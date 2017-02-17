
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

    private final static QName _ServerWO1Response_QNAME = new QName("http://serverpackage/", "ServerWO1Response");
    private final static QName _ServerWO1_QNAME = new QName("http://serverpackage/", "ServerWO1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serverpackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServerWO1 }
     * 
     */
    public ServerWO1 createServerWO1() {
        return new ServerWO1();
    }

    /**
     * Create an instance of {@link ServerWO1Response }
     * 
     */
    public ServerWO1Response createServerWO1Response() {
        return new ServerWO1Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServerWO1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpackage/", name = "ServerWO1Response")
    public JAXBElement<ServerWO1Response> createServerWO1Response(ServerWO1Response value) {
        return new JAXBElement<ServerWO1Response>(_ServerWO1Response_QNAME, ServerWO1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServerWO1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpackage/", name = "ServerWO1")
    public JAXBElement<ServerWO1> createServerWO1(ServerWO1 value) {
        return new JAXBElement<ServerWO1>(_ServerWO1_QNAME, ServerWO1 .class, null, value);
    }

}
