<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">

<xsl:param name="outputFolder" />
<xsl:param name="packageName" />

<xsl:template match="@*|node()">
  <xsl:apply-templates select="@*|node()"/>
</xsl:template>

<xsl:template match="title">
	<xsl:apply-templates/>
</xsl:template>

<xsl:template match="value" mode="enum">
		/**
		  * <xsl:value-of select="normalize-space(description/text())"/>
		  */
		<xsl:value-of select="@name" /><xsl:if test="following-sibling::*[1]">,
		</xsl:if>
</xsl:template>

<xsl:template match="simpleType[count(validValues/value) gt 0]">
  <xsl:result-document href="{$outputFolder}/{@name}.java" method="text">
   	package <xsl:value-of select="$packageName" />;
   	
   	public enum <xsl:value-of select="@name"/> {
   	
   		<xsl:apply-templates select="validValues/value" mode="enum" />
   	
   	}
  </xsl:result-document>
</xsl:template>
</xsl:stylesheet>