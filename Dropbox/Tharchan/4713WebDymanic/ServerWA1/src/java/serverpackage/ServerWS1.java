//WS1: given 3 inputs (value, lifetime, salvage) calculates the depreciation of asset
package serverpackage;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ServerWS1")
public class ServerWS1
{
    @WebMethod(operationName = "ServerWO1")
    public String ServerWO1(@WebParam(name = "originalvalue") double originalvalue, 
                            @WebParam(name = "salvagevalue") double salvagevalue, 
                            @WebParam(name = "lifetime") int lifetime) 
    {
        double depreciation = 0.;
        
        depreciation = (originalvalue - salvagevalue)/lifetime;
        
        String returnstring ="";
        
        if (depreciation>0) returnstring= "Asset depreciates at a rate of $" + depreciation + " per year";
        else if (depreciation<0) returnstring= "Asset appreciates at a rate of $" + (-1)*depreciation + " per year";
        else if (depreciation==0) returnstring= "Asset keeps its value";
        
        return returnstring;
    }

}
