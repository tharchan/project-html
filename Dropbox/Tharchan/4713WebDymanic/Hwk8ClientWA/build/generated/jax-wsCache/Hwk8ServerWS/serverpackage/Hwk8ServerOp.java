
package serverpackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Hwk8ServerOp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hwk8ServerOp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hwk8ServerOp", propOrder = {
    "inputname"
})
public class Hwk8ServerOp {

    protected String inputname;

    /**
     * Gets the value of the inputname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputname() {
        return inputname;
    }

    /**
     * Sets the value of the inputname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputname(String value) {
        this.inputname = value;
    }

}
