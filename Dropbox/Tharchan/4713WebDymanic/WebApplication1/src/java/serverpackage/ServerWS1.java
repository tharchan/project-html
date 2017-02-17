//WS1: takes 3 inputs and calculates the depreciation

package serverpackage;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "ServerWS1")
public class ServerWS1 
{
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) 
    {
        return "Hello " + txt + " !";
    }
}
