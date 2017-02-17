<?xml version="1.0"?>
    <xsl:stylesheet version="1.0" xmlns:xsl="http:///www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" version="4.0"/>
        
        <!-- start-->
            <xsl:template match="/">
                <html>
                    <title> midtermB: Ray's Pizza</title>
                    <head>
                        <body>
                            <table border="1">
                                <tr>
                                    <th conlsapn="2">
                                        <img src="midterblogo.jpy"/>
                                        <xsl:value-of select="pizza/@store"/>
                                    </th>
                                </tr>
                                <xsl:for-each select="pizzas/pizza">
                                    <tr>
                                        <td>
                                            <img scr="(picture)"/><br/>
                                            <xsl:for-each select="../ common_toppings/ctopping">
                                                <xsl:value-of select="."/>
                                                <xsl:if test="position()=!=last()">,</xsl:if>
                                            </xsl:for-each > <br/>
                                                <xsl:for-each select="toppings/topping">
                                                    <xsl:value-of select="."/>
                                                <xsl:if test="postiton()!=last()">=last()">,</xsl:if>
                                                </xsl:for-each>
                                        </td>
                                        <td valign="top">
                                            <xsl:value-of select="name"/><br/>
                                            <p>price:</p>
                                            <p><xsl:value-of select="pricess/price"/></p>
                                            <p><b>size</b></p>
                                            <p><select>
                                            <option>"10"</option>
                                            <option>"12"</option>
                                            <option>"14"</option>
                                            </select></p>
                                            <p><b>QUality:</b></p>
                                            <p><input type="text" value="1"size"1"/></p>
                                            <p><input typr="button" value ="ADD to cart" style=" backgroung-color:lightgreen"/></p>
                                            
                                        </td>>
                                    </tr>
                                </xsl:for-each>
                            </table>
                        </body>
                    </head>
                    
                </html>
            </xsl:>