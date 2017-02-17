
package serverpackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serverpackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Hwk4ServerOp_QNAME = new QName("http://serverpackage/", "Hwk4ServerOp");
    private final static QName _Hwk4ServerOpResponse_QNAME = new QName("http://serverpackage/", "Hwk4ServerOpResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serverpackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hwk4ServerOp }
     * 
     */
    public Hwk4ServerOp createHwk4ServerOp() {
        return new Hwk4ServerOp();
    }

    /**
     * Create an instance of {@link Hwk4ServerOpResponse }
     * 
     */
    public Hwk4ServerOpResponse createHwk4ServerOpResponse() {
        return new Hwk4ServerOpResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hwk4ServerOp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpackage/", name = "Hwk4ServerOp")
    public JAXBElement<Hwk4ServerOp> createHwk4ServerOp(Hwk4ServerOp value) {
        return new JAXBElement<Hwk4ServerOp>(_Hwk4ServerOp_QNAME, Hwk4ServerOp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hwk4ServerOpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpackage/", name = "Hwk4ServerOpResponse")
    public JAXBElement<Hwk4ServerOpResponse> createHwk4ServerOpResponse(Hwk4ServerOpResponse value) {
        return new JAXBElement<Hwk4ServerOpResponse>(_Hwk4ServerOpResponse_QNAME, Hwk4ServerOpResponse.class, null, value);
    }

}
