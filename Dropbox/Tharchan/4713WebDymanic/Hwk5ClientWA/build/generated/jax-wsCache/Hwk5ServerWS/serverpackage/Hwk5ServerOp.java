
package serverpackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Hwk5ServerOp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hwk5ServerOp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputLoan" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="inputTerm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="inputInterest" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hwk5ServerOp", propOrder = {
    "inputLoan",
    "inputTerm",
    "inputInterest"
})
public class Hwk5ServerOp {

    protected int inputLoan;
    protected int inputTerm;
    protected double inputInterest;

    /**
     * Gets the value of the inputLoan property.
     * 
     */
    public int getInputLoan() {
        return inputLoan;
    }

    /**
     * Sets the value of the inputLoan property.
     * 
     */
    public void setInputLoan(int value) {
        this.inputLoan = value;
    }

    /**
     * Gets the value of the inputTerm property.
     * 
     */
    public int getInputTerm() {
        return inputTerm;
    }

    /**
     * Sets the value of the inputTerm property.
     * 
     */
    public void setInputTerm(int value) {
        this.inputTerm = value;
    }

    /**
     * Gets the value of the inputInterest property.
     * 
     */
    public double getInputInterest() {
        return inputInterest;
    }

    /**
     * Sets the value of the inputInterest property.
     * 
     */
    public void setInputInterest(double value) {
        this.inputInterest = value;
    }

}
