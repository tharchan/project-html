<?xml version="1.0" ?>
    <xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
        <xsl:output method="html" version="4.0"/>
        
        <!-- creating a variable for same student -->
        <xsl:variable name="samestudent" select="fund_raising/students/student[@id = //@student]"/>
        
        <!-- start of root template -->
            <xsl:template match="/">
                <html>
                    <head>
                        <title>Hwk11: Fund Raising</title>
                        <style>
                            #hl {
                                    color:green;
                                    font-family:Arial;
                                    font-size:22px;
                                    margin-left:40%
                                }
                                
                            hr  {
                                    width: 20%;
                                    margin-right:40%
                                }
                            
                            #st  {
                                    font-family: Arial;
                                    font-size:20px;
                                    margin-left:40%
                                }
                        </style>
                    </head>
                    <body>
                        <div id="hl">Daily Contribution Report</div>
                        <hr/>
                        <xsl:apply-templates select="$samestudent"/>
                        
                        
                    </body>
                </html>
            </xsl:template>
        <!-- end of root template -->
        
        <!-- start student template -->
            <xsl:template match = "student">
                <xsl:variable  name="studentID" select="@id"/>
                
                <div id="st">
                    <xsl:value-of select="first"/>
                    &#160;
                    <xsl:value-of select="last"/>
                    &#160;
                    <span>
                        <xsl:value-of select="sum(//amount)"/>
                    </span>
                </div>
                <div id="co">
                    <xsl:apply-templates select="../../contributions/contributor"/>
                </div>
            </xsl:template>
        <!-- end of student template -->
        
        <!-- start of contributor template -->
            <xsl:template match="contributor">
                <xsl:if test="../../students/student/@id = @student">
                    <xsl:value-of select="first"/>
                        &#160;
                    <xsl:value-of select="last"/><br/>
                    <xsl:value-of select="address/street"/>
                    <xsl:value-of select="address/city"/>,
                    <xsl:value-of select="address/state"/>
                    <xsl:value-of select="address/zip"/><br/>
                    <xsl:value-of select="amount"/>
                </xsl:if>
            </xsl:template>
        <!-- end of contributor template -->
    </xsl:stylesheet>