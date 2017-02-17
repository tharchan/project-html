
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

    private final static QName _Test1ServerOpResponse_QNAME = new QName("http://serverpackage/", "Test1ServerOpResponse");
    private final static QName _Test1ServerOp_QNAME = new QName("http://serverpackage/", "Test1ServerOp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serverpackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Test1ServerOpResponse }
     * 
     */
    public Test1ServerOpResponse createTest1ServerOpResponse() {
        return new Test1ServerOpResponse();
    }

    /**
     * Create an instance of {@link Test1ServerOp }
     * 
     */
    public Test1ServerOp createTest1ServerOp() {
        return new Test1ServerOp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test1ServerOpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpackage/", name = "Test1ServerOpResponse")
    public JAXBElement<Test1ServerOpResponse> createTest1ServerOpResponse(Test1ServerOpResponse value) {
        return new JAXBElement<Test1ServerOpResponse>(_Test1ServerOpResponse_QNAME, Test1ServerOpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test1ServerOp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpackage/", name = "Test1ServerOp")
    public JAXBElement<Test1ServerOp> createTest1ServerOp(Test1ServerOp value) {
        return new JAXBElement<Test1ServerOp>(_Test1ServerOp_QNAME, Test1ServerOp.class, null, value);
    }

}
