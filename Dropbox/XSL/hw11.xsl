<?xml version="1.0"?>
    <xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
        <xsl:output method="html" version="4.0"/>
        <!-- starting tamplate-->
        
        
        <xsl:template match="/">
                <html>
                    <head>
                        <title> Doanation Collected Daily</title>
                    </head>
                    <body>
                        <table>
                            <xsl:for-each select="students/student">
                                <td > FName:<xsl:value-of select="@first"/></td>
                                <td > LName:<xsl:value-of select="@last"/></td>
                            </xsl:for-each>
                        </table>

                            <table>
                            <xsl:for-each select="contributions/contributor">
                            <tr>
                                <td > FName:<xsl:value-of select="@first"/></td>
                                <td > LName:<xsl:value-of select="@last"/></td>
                            </tr>
                            <tr>
                                <td > Address:<xsl:value-of select="@address"/></td>
                            </tr>
                            </xsl:for-each>
                            
                        </table>
                        
                   </body>
                </html>
        </xsl:template>
    </xsl:stylesheet>