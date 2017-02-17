
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

    private final static QName _Hwk8ServerOp_QNAME = new QName("http://serverpackage/", "Hwk8ServerOp");
    private final static QName _Hwk8ServerOpResponse_QNAME = new QName("http://serverpackage/", "Hwk8ServerOpResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serverpackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hwk8ServerOpResponse }
     * 
     */
    public Hwk8ServerOpResponse createHwk8ServerOpResponse() {
        return new Hwk8ServerOpResponse();
    }

    /**
     * Create an instance of {@link Hwk8ServerOp }
     * 
     */
    public Hwk8ServerOp createHwk8ServerOp() {
        return new Hwk8ServerOp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hwk8ServerOp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpackage/", name = "Hwk8ServerOp")
    public JAXBElement<Hwk8ServerOp> createHwk8ServerOp(Hwk8ServerOp value) {
        return new JAXBElement<Hwk8ServerOp>(_Hwk8ServerOp_QNAME, Hwk8ServerOp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hwk8ServerOpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpackage/", name = "Hwk8ServerOpResponse")
    public JAXBElement<Hwk8ServerOpResponse> createHwk8ServerOpResponse(Hwk8ServerOpResponse value) {
        return new JAXBElement<Hwk8ServerOpResponse>(_Hwk8ServerOpResponse_QNAME, Hwk8ServerOpResponse.class, null, value);
    }

}
