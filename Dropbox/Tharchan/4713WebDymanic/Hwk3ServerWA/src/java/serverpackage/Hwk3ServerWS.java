//Hwk3ServerWS: take two inputs (sales amt + State) returns total Sales Amount
//including the corresponding state tax

package serverpackage;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName="Hwk3ServerWS")
public class Hwk3ServerWS 
{

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Hwk3ServerOp")
    public String Hwk3ServerOp(@WebParam(name = "salesamount") double salesamount,
                                @WebParam(name = "inputstate") String inputstate) 
    {
        //establishing the state tax
        double statetax = 0.;
        
        if (inputstate.equalsIgnoreCase("NY")) statetax = 0.086;
        else if (inputstate.equalsIgnoreCase("NJ")) statetax = 0.07;
        else if (inputstate.equalsIgnoreCase("CT")) statetax = 0.1;
        else if (inputstate.equalsIgnoreCase("MS")) statetax = 0.09;
        
        double totalsales = salesamount + (salesamount * statetax);
        
        return "The total cost for a purchase amount of $" +
                salesamount + " in the state of " + inputstate
                + " is $" + totalsales;
    }

}
