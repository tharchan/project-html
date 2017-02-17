
package serverpackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Hwk7ServerOp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hwk7ServerOp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputzipcode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hwk7ServerOp", propOrder = {
    "inputzipcode"
})
public class Hwk7ServerOp {

    protected int inputzipcode;

    /**
     * Gets the value of the inputzipcode property.
     * 
     */
    public int getInputzipcode() {
        return inputzipcode;
    }

    /**
     * Sets the value of the inputzipcode property.
     * 
     */
    public void setInputzipcode(int value) {
        this.inputzipcode = value;
    }

}
