
package serverpackage;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Test1ServerWS", targetNamespace = "http://serverpackage/", wsdlLocation = "http://localhost:8080/Test1ServerWA/Test1ServerWS?wsdl")
public class Test1ServerWS_Service
    extends Service
{

    private final static URL TEST1SERVERWS_WSDL_LOCATION;
    private final static WebServiceException TEST1SERVERWS_EXCEPTION;
    private final static QName TEST1SERVERWS_QNAME = new QName("http://serverpackage/", "Test1ServerWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Test1ServerWA/Test1ServerWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TEST1SERVERWS_WSDL_LOCATION = url;
        TEST1SERVERWS_EXCEPTION = e;
    }

    public Test1ServerWS_Service() {
        super(__getWsdlLocation(), TEST1SERVERWS_QNAME);
    }

    public Test1ServerWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TEST1SERVERWS_QNAME, features);
    }

    public Test1ServerWS_Service(URL wsdlLocation) {
        super(wsdlLocation, TEST1SERVERWS_QNAME);
    }

    public Test1ServerWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TEST1SERVERWS_QNAME, features);
    }

    public Test1ServerWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Test1ServerWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Test1ServerWS
     */
    @WebEndpoint(name = "Test1ServerWSPort")
    public Test1ServerWS getTest1ServerWSPort() {
        return super.getPort(new QName("http://serverpackage/", "Test1ServerWSPort"), Test1ServerWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Test1ServerWS
     */
    @WebEndpoint(name = "Test1ServerWSPort")
    public Test1ServerWS getTest1ServerWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serverpackage/", "Test1ServerWSPort"), Test1ServerWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TEST1SERVERWS_EXCEPTION!= null) {
            throw TEST1SERVERWS_EXCEPTION;
        }
        return TEST1SERVERWS_WSDL_LOCATION;
    }

}
