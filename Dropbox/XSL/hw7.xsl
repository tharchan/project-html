<?xml version="1.0"?>
    <xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
        <xsl:output method="html" version="4.0"/>
        
        <!-- statr of  root template-->
        <!--<xsl:template match="inventory/album/artist[starts-with(file,'/abc/kk')]">-->
        <xsl:template match="/">
                <html>
                    <head>
                        <title> My Title </title>
                    </head>
                    <table border="1">
                        <xsl:for-each select="inventory/album">
                                <tr>
                                    <td > category:<xsl:value-of select="@category"/></td>
                                </tr>
                                <tr>
                                    <td> Title: <xsl:value-of select="title"/></td>    
                                </tr>
                                <xsl:for-each select="artist">
                                    <tr>    
                                        <td>Artist: <xsl:value-of select="." /></td>
                                    </tr>
                                </xsl:for-each>
                                <tr>
                                <xsl:for-each select="tracks/track">
                                    <tr>
                                        <td> Length :<xsl:value-of select="@length"/></td>
                                        <td> track :<xsl:value-of select="."/></td>
                                    </tr>
                                </xsl:for-each>
                                </tr>
                            </xsl:for-each>
                    </table>
                </html>
            </xsl:template>
    </xsl:stylesheet>