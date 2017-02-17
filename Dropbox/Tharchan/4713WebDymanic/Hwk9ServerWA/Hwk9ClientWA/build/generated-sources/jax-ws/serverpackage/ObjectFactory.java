
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

    private final static QName _Hwk9ServerOpResponse_QNAME = new QName("http://serverpackage/", "Hwk9ServerOpResponse");
    private final static QName _Hwk9ServerOp_QNAME = new QName("http://serverpackage/", "Hwk9ServerOp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serverpackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hwk9ServerOpResponse }
     * 
     */
    public Hwk9ServerOpResponse createHwk9ServerOpResponse() {
        return new Hwk9ServerOpResponse();
    }

    /**
     * Create an instance of {@link Hwk9ServerOp }
     * 
     */
    public Hwk9ServerOp createHwk9ServerOp() {
        return new Hwk9ServerOp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hwk9ServerOpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpackage/", name = "Hwk9ServerOpResponse")
    public JAXBElement<Hwk9ServerOpResponse> createHwk9ServerOpResponse(Hwk9ServerOpResponse value) {
        return new JAXBElement<Hwk9ServerOpResponse>(_Hwk9ServerOpResponse_QNAME, Hwk9ServerOpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hwk9ServerOp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpackage/", name = "Hwk9ServerOp")
    public JAXBElement<Hwk9ServerOp> createHwk9ServerOp(Hwk9ServerOp value) {
        return new JAXBElement<Hwk9ServerOp>(_Hwk9ServerOp_QNAME, Hwk9ServerOp.class, null, value);
    }

}
