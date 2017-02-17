<?xml version="1.0"?>
    <xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
        <xsl:output method="html" version="4.0"/>
         <!-- start of root template -->
            <xsl:template match="/">
                <html>
                    <head>
                        <title>meanu.calsswork</title>
                    </head>
                    <body>
                        <h2>Menu</h2>
                        <ul>
                            <xsl:for-each select="ingredients/ingredient">
                                <li>
                                    <xsl:for-each select="step"/>
                                      <xsl:for-each select="serving"/>  
                            
                                    <ul>
                                        <xsl:for-each select="ingredient">
                                            <li><xsl:value-of select="."/></li>
                                        </xsl:for-each>
                                    </ul>
                                </li>
                            </xsl:for-each>
                        </ul>
                        <hr/>
                        <!-- displaying continents where English is spoken -->
                        <h2>Continents where English is spoken</h2>
                        <xsl:for-each select="ingredients/ingredient">
                            <xsl:for-each select="ingredientd">
                                <xsl:if test=". = 'steps'">
                                   
                                </xsl:if>
                            </xsl:for-each>
                        </xsl:for-each>
                        <hr/>
                        <!-- displaying continents where either English or French is spoken -->
                        <h2>Continents where English or French is spoken</h2>
                        <xsl:for-each select="ingredients/ingredient">
                            <xsl:for-each select="ingredient">
                            </xsl:for-each>
                        </xsl:for-each>
                        <hr/>
                        <!-- displaying continents where English and Mandarim are spoken -->
                        
                    </body>
                </html>
            </xsl:template>
        <!-- end of root template -->
    </xsl:stylesheet>