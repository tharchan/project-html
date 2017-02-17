//Hwk7WS: returns NYC borough given zipcode

package serverpackage;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName="Hwk7ServerWS")
public class Hwk7ServerWS 
{
    @WebMethod(operationName = "Hwk7ServerOp")
    public String Hwk7ServerOp(@WebParam(name = "inputzipcode") int inputzipcode) 
    {
        //creating a return borough string
        String borough = "";
        String nogoodzipcode ="Invalid NYC zipcode";
        
        boolean validzipcode = false;
        
        if (inputzipcode >= 10000 && inputzipcode<=10099)
        {
            validzipcode = true;
            borough = "Manhattan";
        }
        else if (inputzipcode >= 10300 && inputzipcode<=10399)
        {
            validzipcode = true;
            borough = "Staten Island";
        }
        else if (inputzipcode >= 10400 && inputzipcode<=10499) 
        {
            validzipcode = true;
            borough = "Bronx";
        }
        else if (inputzipcode >= 11000 && inputzipcode<=11199)
        {
            validzipcode = true;
            borough = "Queens";
        }
        else if (inputzipcode >= 11200 && inputzipcode<=11299) 
        {
            validzipcode = true;
            borough = "Brooklyn";
        }
        else if (inputzipcode >= 11300 && inputzipcode<=11499) 
        {
            validzipcode = true;
            borough = "Queens";
        }
        else if (inputzipcode >= 11600 && inputzipcode<=11699) 
        {
            validzipcode = true;
            borough = "Queens";
        }
        
        if (validzipcode ==true)
            return inputzipcode + " corresponds to the borough of " + borough;
        else return nogoodzipcode;
    }

}
