
package serverpackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Hwk9ServerOp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hwk9ServerOp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputheightfeet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="inputheightinches" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="inputweight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hwk9ServerOp", propOrder = {
    "inputheightfeet",
    "inputheightinches",
    "inputweight"
})
public class Hwk9ServerOp {

    protected int inputheightfeet;
    protected int inputheightinches;
    protected int inputweight;

    /**
     * Gets the value of the inputheightfeet property.
     * 
     */
    public int getInputheightfeet() {
        return inputheightfeet;
    }

    /**
     * Sets the value of the inputheightfeet property.
     * 
     */
    public void setInputheightfeet(int value) {
        this.inputheightfeet = value;
    }

    /**
     * Gets the value of the inputheightinches property.
     * 
     */
    public int getInputheightinches() {
        return inputheightinches;
    }

    /**
     * Sets the value of the inputheightinches property.
     * 
     */
    public void setInputheightinches(int value) {
        this.inputheightinches = value;
    }

    /**
     * Gets the value of the inputweight property.
     * 
     */
    public int getInputweight() {
        return inputweight;
    }

    /**
     * Sets the value of the inputweight property.
     * 
     */
    public void setInputweight(int value) {
        this.inputweight = value;
    }

}
