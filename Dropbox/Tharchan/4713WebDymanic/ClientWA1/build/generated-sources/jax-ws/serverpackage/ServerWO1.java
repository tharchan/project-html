
package serverpackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerWO1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerWO1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originalvalue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="salvagevalue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lifetime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerWO1", propOrder = {
    "originalvalue",
    "salvagevalue",
    "lifetime"
})
public class ServerWO1 {

    protected double originalvalue;
    protected double salvagevalue;
    protected int lifetime;

    /**
     * Gets the value of the originalvalue property.
     * 
     */
    public double getOriginalvalue() {
        return originalvalue;
    }

    /**
     * Sets the value of the originalvalue property.
     * 
     */
    public void setOriginalvalue(double value) {
        this.originalvalue = value;
    }

    /**
     * Gets the value of the salvagevalue property.
     * 
     */
    public double getSalvagevalue() {
        return salvagevalue;
    }

    /**
     * Sets the value of the salvagevalue property.
     * 
     */
    public void setSalvagevalue(double value) {
        this.salvagevalue = value;
    }

    /**
     * Gets the value of the lifetime property.
     * 
     */
    public int getLifetime() {
        return lifetime;
    }

    /**
     * Sets the value of the lifetime property.
     * 
     */
    public void setLifetime(int value) {
        this.lifetime = value;
    }

}
