
package serverpackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Test1ServerOp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Test1ServerOp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gradyear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Test1ServerOp", propOrder = {
    "inputname",
    "gradyear"
})
public class Test1ServerOp {

    protected String inputname;
    protected int gradyear;

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

    /**
     * Gets the value of the gradyear property.
     * 
     */
    public int getGradyear() {
        return gradyear;
    }

    /**
     * Sets the value of the gradyear property.
     * 
     */
    public void setGradyear(int value) {
        this.gradyear = value;
    }

}
