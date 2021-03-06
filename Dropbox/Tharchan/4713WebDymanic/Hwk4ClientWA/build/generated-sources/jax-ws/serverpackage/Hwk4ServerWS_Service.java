
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
@WebServiceClient(name = "Hwk4ServerWS", targetNamespace = "http://serverpackage/", wsdlLocation = "http://localhost:8080/Hwk4ServerWA/Hwk4ServerWS?wsdl")
public class Hwk4ServerWS_Service
    extends Service
{

    private final static URL HWK4SERVERWS_WSDL_LOCATION;
    private final static WebServiceException HWK4SERVERWS_EXCEPTION;
    private final static QName HWK4SERVERWS_QNAME = new QName("http://serverpackage/", "Hwk4ServerWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Hwk4ServerWA/Hwk4ServerWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HWK4SERVERWS_WSDL_LOCATION = url;
        HWK4SERVERWS_EXCEPTION = e;
    }

    public Hwk4ServerWS_Service() {
        super(__getWsdlLocation(), HWK4SERVERWS_QNAME);
    }

    public Hwk4ServerWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), HWK4SERVERWS_QNAME, features);
    }

    public Hwk4ServerWS_Service(URL wsdlLocation) {
        super(wsdlLocation, HWK4SERVERWS_QNAME);
    }

    public Hwk4ServerWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HWK4SERVERWS_QNAME, features);
    }

    public Hwk4ServerWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Hwk4ServerWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Hwk4ServerWS
     */
    @WebEndpoint(name = "Hwk4ServerWSPort")
    public Hwk4ServerWS getHwk4ServerWSPort() {
        return super.getPort(new QName("http://serverpackage/", "Hwk4ServerWSPort"), Hwk4ServerWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Hwk4ServerWS
     */
    @WebEndpoint(name = "Hwk4ServerWSPort")
    public Hwk4ServerWS getHwk4ServerWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serverpackage/", "Hwk4ServerWSPort"), Hwk4ServerWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HWK4SERVERWS_EXCEPTION!= null) {
            throw HWK4SERVERWS_EXCEPTION;
        }
        return HWK4SERVERWS_WSDL_LOCATION;
    }

}
