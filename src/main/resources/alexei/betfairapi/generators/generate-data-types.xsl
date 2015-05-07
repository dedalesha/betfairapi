<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">

<xsl:param name="outputFolder" />
<xsl:param name="packageName" />

<xsl:key name="primitiveSimpleTypes" use="parent::simpleType/@name" match="simpleType[count(validValues/value) eq 0]/@type" /> 

<xsl:template match="@*|node()">
  <xsl:apply-templates select="@*|node()"/>
</xsl:template>

<!-- convert from Betfair to Java type -->

<xsl:template name="javaType">
	<xsl:param name="type" />
	<xsl:choose>
	
		<!-- primitives -->
	
		<xsl:when test="$type eq 'string'">String</xsl:when>			
		<xsl:when test="$type eq 'bool'">boolean</xsl:when>			
		<xsl:when test="$type eq 'dateTime'">java.util.Date</xsl:when>			
		<xsl:when test="$type eq 'i32'">int</xsl:when>			
		<xsl:when test="$type eq 'i64'">long</xsl:when>
		
		
		<!-- Lists -->
					
		<xsl:when test="starts-with($type, 'list(')">java.util.List<xsl:text disable-output-escaping="yes">&lt;</xsl:text>
			<xsl:call-template name="javaType">
				<xsl:with-param name="type" select="substring(substring-after($type, 'list('), 1, string-length(@type)-6)"/>
			</xsl:call-template>
			<xsl:text disable-output-escaping="yes">&gt;</xsl:text>
		</xsl:when>

		<!-- Sets -->

		<xsl:when test="starts-with($type, 'set(')">java.util.Set<xsl:text disable-output-escaping="yes">&lt;</xsl:text>
			<xsl:call-template name="javaType">
				<xsl:with-param name="type" select="substring(substring-after($type, 'set('), 1, string-length(@type)-5)"/>
			</xsl:call-template>
			<xsl:text disable-output-escaping="yes">&gt;</xsl:text>
		</xsl:when>
		
		<!-- Maps -->
		
		<xsl:when test="starts-with($type, 'map(')">java.util.Map<xsl:text disable-output-escaping="yes">&lt;</xsl:text>
			<xsl:variable name="mapTypes" select="tokenize(substring(substring-after($type, 'map('), 1, string-length(@type)-5), ',')"></xsl:variable>
			<xsl:call-template name="javaType">
				<xsl:with-param name="type" select="$mapTypes[1]"/>
			</xsl:call-template>,<xsl:call-template name="javaType">
				<xsl:with-param name="type" select="$mapTypes[2]"/>
			</xsl:call-template>
			<xsl:text disable-output-escaping="yes">&gt;</xsl:text>
		</xsl:when>

		<!-- named primitive types -->
		
		<xsl:when test="key('primitiveSimpleTypes', $type)">
			<xsl:call-template name="javaType">
				<xsl:with-param name="type" select="key('primitiveSimpleTypes', $type)" />
			</xsl:call-template>
		</xsl:when>
		
		<!-- complex types -->
		
		<xsl:otherwise><xsl:value-of select="$type" /></xsl:otherwise>
	</xsl:choose>
</xsl:template>

<xsl:template match="parameter" mode="fields">
		/**
		  * <xsl:value-of select="normalize-space(description/text())"/>
		  */
		private <xsl:call-template name="javaType">
					<xsl:with-param name="type" select="@type" />
				</xsl:call-template>
		<xsl:text> </xsl:text>
		<xsl:value-of select="@name" />;
</xsl:template>

<xsl:template match="parameter" mode="getter-setter">
		/**
		  * <xsl:value-of select="normalize-space(description/text())"/>
		  */
		public <xsl:call-template name="javaType">
					<xsl:with-param name="type" select="@type" />
				</xsl:call-template>
				<xsl:text> </xsl:text>
				<xsl:if test="@type eq 'bool'">is</xsl:if>
				<xsl:if test="@type ne 'bool'">get</xsl:if>
				<xsl:apply-templates select="@name" mode="upper-case-first-letter" />() {
			return <xsl:value-of select="@name" />;
		}

		/**
		  * <xsl:value-of select="normalize-space(description/text())"/>
		  */
		public void set<xsl:apply-templates select="@name" mode="upper-case-first-letter" />(<xsl:call-template name="javaType">
					<xsl:with-param name="type" select="@type" />
				</xsl:call-template><xsl:text> </xsl:text><xsl:value-of select="@name" />) {
			this.<xsl:value-of select="@name" /> = <xsl:value-of select="@name" />;
		}		
</xsl:template>

<xsl:template match="@*|text()" mode="upper-case-first-letter">
	<xsl:value-of select="concat(upper-case(substring(current(), 1,1)), substring(current(), 2))" />
</xsl:template>

<xsl:template match="dataType">
  <xsl:result-document href="{$outputFolder}/{@name}.java" method="text" >
   	package <xsl:value-of select="$packageName" />;
   	
	/**
	  * <xsl:value-of select="normalize-space(description/text())"/>
	  * This class was auto-generated from interface definition xml.
	  */
   	public class <xsl:value-of select="@name"/> {
   	
   		<xsl:apply-templates select="parameter" mode="fields" /><xsl:text>
   		
   		</xsl:text>
   		<xsl:apply-templates select="parameter" mode="getter-setter" />
   	
   	}
  </xsl:result-document>
</xsl:template>
</xsl:stylesheet>