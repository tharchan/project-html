<?xml version ="1.0" ?>
      <xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
        <xsl:output method="html" version="4.0"/>
        
        <!-- start of root-->
        <html>
            <head>
                <title> news</title>
            </head>
            <body>
                <h2> news board</h2>
                <table boarder="1">
                    <tr>
                      <th><em>story</em></th>
                    </tr>
                    <xsl:for >
                        <tr>
                        <td><xsl:value-of select="articel"/></td>
                        <td><xsl:value-of select="image"/></td>
                        </tr>
                    </xsl:for>
                </table>
            </body>
        </html>
        
        <!-- end of root template -->
        
    </xsl:stylesheet>


