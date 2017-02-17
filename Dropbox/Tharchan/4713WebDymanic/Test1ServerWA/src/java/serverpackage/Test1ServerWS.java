//Operation: return a message after comparing current year to year of graduation

package serverpackage;

import java.util.Calendar;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName="Test1ServerWS")
public class Test1ServerWS 
{
    @WebMethod(operationName = "Test1ServerOp")
    public String Test1ServerOp(@WebParam(name = "inputname") String inputname, 
                                @WebParam(name = "gradyear") int gradyear) 
    {
        String message = "";
        
        //reading the computer system's year using the Calendar java class
        Calendar mycalendar = Calendar.getInstance();
        int currentYear = mycalendar.get(Calendar.YEAR);
        
        int diffYear = gradyear - currentYear;
        
        if (diffYear == 1) message = inputname + ", you still have 1 year to go";
        else if (diffYear>1) message = inputname + ", you still have " + diffYear 
                + " years to go";
        else if (diffYear == 0) message = inputname + " , good luck";
        else message = inputname + ", you already graduated";
        
        return message;
    }

}
