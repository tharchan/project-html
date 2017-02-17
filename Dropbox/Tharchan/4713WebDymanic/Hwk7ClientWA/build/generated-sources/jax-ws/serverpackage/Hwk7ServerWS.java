
package serverpackage;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Hwk7ServerWS", targetNamespace = "http://serverpackage/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Hwk7ServerWS {


    /**
     * 
     * @param inputzipcode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Hwk7ServerOp")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Hwk7ServerOp", targetNamespace = "http://serverpackage/", className = "serverpackage.Hwk7ServerOp")
    @ResponseWrapper(localName = "Hwk7ServerOpResponse", targetNamespace = "http://serverpackage/", className = "serverpackage.Hwk7ServerOpResponse")
    @Action(input = "http://serverpackage/Hwk7ServerWS/Hwk7ServerOpRequest", output = "http://serverpackage/Hwk7ServerWS/Hwk7ServerOpResponse")
    public String hwk7ServerOp(
        @WebParam(name = "inputzipcode", targetNamespace = "")
        int inputzipcode);

}
