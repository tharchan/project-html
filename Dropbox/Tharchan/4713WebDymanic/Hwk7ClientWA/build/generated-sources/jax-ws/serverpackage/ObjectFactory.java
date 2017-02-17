
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

    private final static QName _Hwk7ServerOp_QNAME = new QName("http://serverpackage/", "Hwk7ServerOp");
    private final static QName _Hwk7ServerOpResponse_QNAME = new QName("http://serverpackage/", "Hwk7ServerOpResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serverpackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hwk7ServerOp }
     * 
     */
    public Hwk7ServerOp createHwk7ServerOp() {
        return new Hwk7ServerOp();
    }

    /**
     * Create an instance of {@link Hwk7ServerOpResponse }
     * 
     */
    public Hwk7ServerOpResponse createHwk7ServerOpResponse() {
        return new Hwk7ServerOpResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hwk7ServerOp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpackage/", name = "Hwk7ServerOp")
    public JAXBElement<Hwk7ServerOp> createHwk7ServerOp(Hwk7ServerOp value) {
        return new JAXBElement<Hwk7ServerOp>(_Hwk7ServerOp_QNAME, Hwk7ServerOp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hwk7ServerOpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpackage/", name = "Hwk7ServerOpResponse")
    public JAXBElement<Hwk7ServerOpResponse> createHwk7ServerOpResponse(Hwk7ServerOpResponse value) {
        return new JAXBElement<Hwk7ServerOpResponse>(_Hwk7ServerOpResponse_QNAME, Hwk7ServerOpResponse.class, null, value);
    }

}
