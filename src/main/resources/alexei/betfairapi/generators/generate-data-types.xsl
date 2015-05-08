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
		<xsl:when test="$type eq 'dateTime'">java.util.Date</xsl:when>			
		<xsl:when test="$type eq 'i32'">int</xsl:when>			
		<xsl:when test="$type eq 'i64'">long</xsl:when>
		
		
		<!-- Lists -->
					
		<xsl:when test="starts-with($type, 'list(')">java.util.List<xsl:text disable-output-escaping="yes">&lt;</xsl:text>
			<xsl:value-of select="udf:javaType(substring(substring-after($type, 'list('), 1, string-length($type)-6), $st)" />
			<xsl:text disable-output-escaping="yes">&gt;</xsl:text>
		</xsl:when>

		<!-- Sets -->

		<xsl:when test="starts-with($type, 'set(')">java.util.Set<xsl:text disable-output-escaping="yes">&lt;</xsl:text>
			<xsl:value-of select="udf:javaType(substring(substring-after($type, 'set('), 1, string-length($type)-5), $st)" />
			<xsl:text disable-output-escaping="yes">&gt;</xsl:text>
		</xsl:when>
		
		<!-- Maps -->
		
		<xsl:when test="starts-with($type, 'map(')">java.util.Map<xsl:variable
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

<xsl:template match="parameter" mode="fields">
	<javadoc value="{description/text()}" />
	<field type="{udf:javaType(@type, $st)}" name="{@name}" />
</xsl:template>


<xsl:template match="parameter" mode="getter-setter">
	<javadoc value="{description/text()}" />
	<xsl:variable name="fieldType" select="udf:javaType(@type, $st)"/>
	<getter type="{$fieldType}" field-name="{@name}" /> 
	<javadoc value="{description/text()}" />
	<setter type="{$fieldType}" field-name="{@name}" /> 
</xsl:template>


<xsl:function name="udf:firstCharUp">
	<xsl:param name="str" />
	<xsl:value-of select="concat(upper-case(substring($str, 1, 1)), substring($str, 2))" />
</xsl:function>

<!-- render java -->

<xsl:template match="package">	
package <xsl:value-of select="@name" />;

</xsl:template>

<xsl:template match="javadoc">
	/**
	  * <xsl:value-of select="normalize-space(@value)"/>
	  */<xsl:text/>
</xsl:template>

<xsl:template match="class">
public class <xsl:value-of select="@name" /> {
	<xsl:apply-templates select="*" />
}
</xsl:template>

<xsl:template match="field">
	private <xsl:value-of select="concat(@type, ' ', @name)" />;
</xsl:template>

<xsl:template match="getter">
	public <xsl:value-of select="@type"/> <xsl:value-of select="if (@type eq 'boolean') then ' is' else ' get'" /><xsl:value-of select="udf:firstCharUp(@field-name)"/>() {
		return <xsl:value-of select="@field-name" />;
	}
</xsl:template>

<xsl:template match="setter">
	public void set<xsl:value-of select="udf:firstCharUp(@field-name)"/>(<xsl:value-of select="concat(@type, ' ', @field-name)" />) {
		this.<xsl:value-of select="@field-name" /> = <xsl:value-of select="@field-name" />;
	}
</xsl:template>

<!-- entry point -->

<xsl:template match="dataType">

	<xsl:result-document href="{$outputFolder}/{@name}.java" method="text" >
		<xsl:variable name="xml-java">
			<package name="{$packageName}" />
			<javadoc value="{description/text()}. This class was auto-generated from interface definition xml." />
			<class name="{@name}">
	   			<xsl:apply-templates select="parameter" mode="fields" />
	   			<xsl:apply-templates select="parameter" mode="getter-setter" />
			</class>		
		</xsl:variable>
	<xsl:apply-templates select="$xml-java" />
  	
  </xsl:result-document>
  
</xsl:template>

</xsl:stylesheet>