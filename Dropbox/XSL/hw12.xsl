<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html" version="4.0"/>
    <!--  creating a variable for color black only  -->
        <xsl:variable name="black" select="shoes/shoe[color='Black']"/>
        <!--  start of root template  -->
        <xsl:template match="/">
        <html>
            <head>
                <title>Hwk12: Shoe Store</title>
            </head>
            <body>
            <table border="1">
                <tr>
                    <th colspan="5">Shoe Sales</th>
                </tr>
                <tr>
                    <th>Size</th>
                    <th>Color</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Total</th>
                </tr>
                    <xsl:apply-templates select="shoes/shoe"/>
                <tr>
                    <th colspan="4" align="right">Grand Total</th>
                    <td>
                        <xsl:call-template name="calctotalsales">
                        <xsl:with-param name="list" select="shoes/shoe"/>
                        </xsl:call-template>
                    </td>
                </tr>
            </table>
            <hr/>
                <table border="1">
            <tr>
                <th colspan="5">Shoe Sales - Black Only</th>
            </tr>
            <tr>
                <th>Size</th>
                <th>Color</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Total</th>
            </tr>
            <xsl:apply-templates select="$black"/>
            <tr>
                <th colspan="4" align="right">Grand Total</th>
                <td>
                <xsl:call-template name="calctotalsales">
                <xsl:with-param name="list" select="$black"/>
                </xsl:call-template>
                </td>
            </tr>
            </table>
        </body>
        </html>
        </xsl:template>
        <!--  end of root template  -->
        <!--  start of shoe template  -->
        <xsl:template match="shoe">
            <tr>
                <td>
                    <xsl:value-of select="size"/>
                </td>
                <td>
                    <xsl:value-of select="color"/>
                </td>
                <td>
                    <xsl:value-of select="price"/>
                </td>
                <td>
                    <xsl:value-of select="qty"/>
                </td>
                <td align="right">
                    <xsl:value-of select="format-number(price * qty,'$##,##0')"/>
                </td>
            </tr>
        </xsl:template>
        <!--  end of shoe template  -->
        <!--  start of calctotalsales template  -->
        <xsl:template name="calctotalsales">
        <xsl:param name="list"/>
        <xsl:param name="total" select="0"/>
        <xsl:choose>
        <xsl:when test="$list">
            <!--  create variable for the first sales  -->
            <xsl:variable name="firstsales" select="$list[1]/price * $list[1]/qty"/>
            <!--  calling the template again (recursively)  -->
            <xsl:call-template name="calctotalsales">
            <xsl:with-param name="list" select="$list[position() > 1]"/>
            <xsl:with-param name="total" select="$firstsales + $total"/>
            </xsl:call-template>
            </xsl:when>
                <xsl:otherwise>
            <xsl:value-of select="format-number($total,'$##,###0')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>
    <!--  end of calctotalsales template  -->
</xsl:stylesheet>