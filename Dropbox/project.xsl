<?xml version="1.0"?>
    <xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
        <xsl:output method="html" version="4.0"/>
        
        <!-- start of  root template-->
            <xsl:template match="/">
              
              
              
              
                <html>
                    <head>
                        <title>travel agency: project </title>
                    </head>
                    <table border="1">
                        <xsl:for-each select="tours/tour">
                            <tr>                  
                              <xsl:description>Description:</xsl:description>
                            <td colspan="2"  align="center">
                                category:<xsl:value-of select="@description"/>
                             
                            </td>
                        
                        </tr>
                            <tr>
                                <td colspan="2"><xsl:value-of select=""/></td>
                            </tr>
                            <tr>
                                <td><xsl:value-of select = "description"/> </td>
                                <td><img scr="Lake.jpg"/></td>
                                <td><xsl:value-of select= "tourGuide"/></td>
                                <td><xsl:value-of select= "tdEmail"/></td>
                                <td><xsl:value-of select= "tourStart"/>to<xsl:value-of select= "tourEnd"/></td>
                                
                                
                            </tr>
                            <hr width="60"/>
                        </xsl:for-each>
                          <xsl:variable name="" select="tours/tour[@id = //@tour]"/>
          
        <TABLE border="1"> 
          <TR> 
               <Tr>Description</Tr> 
               <Tr>tourGuide</Tr> 
               <Tr> tdEmail</Tr>
               <tr> tourStart</tr>
          </TR> 
          <xsl:apply-templates select="//*"/> 
    


<xsl:for-each select="tour/tours"> 
     <TR>  
      <td><xsl:value-of select="<i>Description</i>()"/>
     </td>
     <td> <xsl:value-of select="tourGuide()"/> </td>
     <td><xsl:value-of select="tdEmail()"/></td>
      <td><xsl:value-of select="tourStart()"/></tr> 
     </tr> 
</xsl:for-each>

                    </table>
                </html>
            </xsl:template>
    </xsl:stylesheet>


