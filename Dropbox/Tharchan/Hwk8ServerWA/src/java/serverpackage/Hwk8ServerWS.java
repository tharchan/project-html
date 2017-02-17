//Hwk8ServerWS: greeting depending on time of the day

package serverpackage;

import java.util.Calendar;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName="Hwk8ServerWS")
public class Hwk8ServerWS 
{
    @WebMethod(operationName = "Hwk8ServerOp")
    public String Hwk8ServerOp(@WebParam(name = "inputname") String inputname) 
    {
        String greeting = "";
        
        //reading the system's hour using Calendar class
        Calendar mycalendar = Calendar.getInstance();
        int currentHour = mycalendar.get(Calendar.HOUR_OF_DAY);
        
        if (currentHour >=0 && currentHour <= 12) greeting = "Good morning, " + inputname + "!";
        else if (currentHour >12 && currentHour <= 17) greeting = "Good afternoon, " + inputname + "!";
        else greeting = "Good night, " + inputname + "!";
        
        return greeting;
    }
}
