
package serverpackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Hwk4ServerOp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hwk4ServerOp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="number2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="operationsign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hwk4ServerOp", propOrder = {
    "number1",
    "number2",
    "operationsign"
})
public class Hwk4ServerOp {

    protected double number1;
    protected double number2;
    protected String operationsign;

    /**
     * Gets the value of the number1 property.
     * 
     */
    public double getNumber1() {
        return number1;
    }

    /**
     * Sets the value of the number1 property.
     * 
     */
    public void setNumber1(double value) {
        this.number1 = value;
    }

    /**
     * Gets the value of the number2 property.
     * 
     */
    public double getNumber2() {
        return number2;
    }

    /**
     * Sets the value of the number2 property.
     * 
     */
    public void setNumber2(double value) {
        this.number2 = value;
    }

    /**
     * Gets the value of the operationsign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationsign() {
        return operationsign;
    }

    /**
     * Sets the value of the operationsign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationsign(String value) {
        this.operationsign = value;
    }

}
