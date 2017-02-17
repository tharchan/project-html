
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

    private final static QName _Hwk5ServerOpResponse_QNAME = new QName("http://serverpackage/", "Hwk5ServerOpResponse");
    private final static QName _Hwk5ServerOp_QNAME = new QName("http://serverpackage/", "Hwk5ServerOp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serverpackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hwk5ServerOpResponse }
     * 
     */
    public Hwk5ServerOpResponse createHwk5ServerOpResponse() {
        return new Hwk5ServerOpResponse();
    }

    /**
     * Create an instance of {@link Hwk5ServerOp }
     * 
     */
    public Hwk5ServerOp createHwk5ServerOp() {
        return new Hwk5ServerOp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hwk5ServerOpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpackage/", name = "Hwk5ServerOpResponse")
    public JAXBElement<Hwk5ServerOpResponse> createHwk5ServerOpResponse(Hwk5ServerOpResponse value) {
        return new JAXBElement<Hwk5ServerOpResponse>(_Hwk5ServerOpResponse_QNAME, Hwk5ServerOpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hwk5ServerOp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpackage/", name = "Hwk5ServerOp")
    public JAXBElement<Hwk5ServerOp> createHwk5ServerOp(Hwk5ServerOp value) {
        return new JAXBElement<Hwk5ServerOp>(_Hwk5ServerOp_QNAME, Hwk5ServerOp.class, null, value);
    }

}
