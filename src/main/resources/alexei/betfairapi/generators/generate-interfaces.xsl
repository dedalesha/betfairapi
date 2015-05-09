<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:udf="http://www.alexei.co.uk/udf" version="2.0">

<xsl:param name="outputFolder" />
<xsl:param name="packageName" />

<!-- named primitive types to be passed to type conversion -->
<xsl:variable name="st" select="//simpleType[count(validValues/value) eq 0]" /> 

<xsl:template match="@*|node()">
  <xsl:apply-templates select="@*|node()"/>
</xsl:template>

<!-- convert from Betfair to Java type -->

<xsl:function name="udf:javaType">
	<xsl:param name="type" />
	<xsl:param name="st" />

	<xsl:choose>
	
		<!-- primitives -->
	
		<xsl:when test="$type eq 'string'">String</xsl:when>			
		<xsl:when test="$type eq 'bool'">boolean</xsl:when>			
		<xsl:when test="$type eq 'dateTime'">Date</xsl:when>			
		<xsl:when test="$type eq 'i32'">int</xsl:when>			
		<xsl:when test="$type eq 'i64'">long</xsl:when>
		
		
		<!-- Lists -->
					
		<xsl:when test="starts-with($type, 'list(')">List<xsl:text disable-output-escaping="yes">&lt;</xsl:text>
			<xsl:value-of select="udf:javaType(substring(substring-after($type, 'list('), 1, string-length($type)-6), $st)" />
			<xsl:text disable-output-escaping="yes">&gt;</xsl:text>
		</xsl:when>

		<!-- Sets -->

		<xsl:when test="starts-with($type, 'set(')">Set<xsl:text disable-output-escaping="yes">&lt;</xsl:text>
			<xsl:value-of select="udf:javaType(substring(substring-after($type, 'set('), 1, string-length($type)-5), $st)" />
			<xsl:text disable-output-escaping="yes">&gt;</xsl:text>
		</xsl:when>
		
		<!-- Maps -->
		
		<xsl:when test="starts-with($type, 'map(')">Map<xsl:variable
			name="mapTypes" select="tokenize(substring(substring-after($type, 'map('), 1, string-length($type)-5), ',')"></xsl:variable>
			<xsl:value-of select="concat( '&lt;', udf:javaType($mapTypes[1], $st), ',', udf:javaType($mapTypes[1], $st), '&gt;' )" />
		</xsl:when>
		
		<!-- named primitive types -->
		<xsl:when test="count($st[@name eq $type]) gt 0">
			<xsl:value-of select="udf:javaType($st[@name eq $type]/@type, $st)" />
		</xsl:when>

		<!-- complex types -->
		
		<xsl:otherwise><xsl:value-of select="$type" /></xsl:otherwise>
	</xsl:choose>
</xsl:function>

<xsl:template match="parameter" mode="parameter">
	<param name="{@name}" type="{udf:javaType(@type, $st)}" />
</xsl:template>

<xsl:template match="parameter" mode="javadoc">
	<param-javadoc name="{@name}" value="{description/text()}">
		<xsl:copy-of select="@mandatory" />
	</param-javadoc>
</xsl:template>

<xsl:template match="operation" mode="operation">
	<javadoc value="{description/text()}">
		<xsl:apply-templates select="parameters/request/parameter" mode="javadoc" />
	</javadoc>
	<method type="{udf:javaType(parameters/simpleResponse/@type, $st)}" name="{@name}">
		<xsl:apply-templates select="parameters/request/parameter" mode="parameter"/>
	</method>
</xsl:template>


<!-- render java -->

<xsl:template match="package">	
package <xsl:value-of select="@name" />;
import java.util.*;

</xsl:template>

<xsl:template match="param-javadoc">
	  * @param <xsl:value-of select="concat(if (@mandatory) then 'REQUIRED: ' else '', @name, ' ', normalize-space(@value))" /> 
</xsl:template>

<xsl:template match="javadoc">
	/**
	  * <xsl:value-of select="normalize-space(@value)"/>
	  <xsl:apply-templates select="*" />
	  */<xsl:text/>
</xsl:template>


<xsl:template match="jinterface">
public interface <xsl:value-of select="@name" /> {
	<xsl:apply-templates select="*" />
}
</xsl:template>

<xsl:template match="method"><xsl:text>
	</xsl:text>
	<xsl:value-of select="concat(@type, ' ', @name)" />(<xsl:apply-templates select="param" />);
</xsl:template>

<xsl:template match="param">
	<xsl:value-of select="concat(@type, ' ', @name)" />
	<xsl:if test="following-sibling::*[1]">, </xsl:if>
</xsl:template>

<!-- entry point -->

<xsl:template match="interface">

	<xsl:result-document href="{$outputFolder}/BetfairAPI.java" method="text" >
	
		<xsl:variable name="xml-java">
			<package name="{$packageName}" />
			<javadoc value="Betfair API operations. This class was auto-generated from interface definition xml." />
			<jinterface name="BetfairAPI">
	   			<xsl:apply-templates select="operation" mode="operation" />
			</jinterface>		
		</xsl:variable>
		<xsl:apply-templates select="$xml-java" />
  	
  </xsl:result-document>
  
</xsl:template>

</xsl:stylesheet>