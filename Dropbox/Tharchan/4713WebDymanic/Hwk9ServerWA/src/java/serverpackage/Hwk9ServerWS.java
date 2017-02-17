//Hwk9WS: calculate BMI given height and weight

package serverpackage;

import java.text.NumberFormat;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName="Hwk9ServerWS")
public class Hwk9ServerWS 
{
    @WebMethod(operationName = "Hwk9ServerOp")
    public String Hwk9ServerOp(@WebParam(name = "inputheightfeet") int inputheightfeet,
                                @WebParam(name = "inputheightinches") int inputheightinches, 
                                @WebParam(name = "inputweight") int inputweight) 
    {
        //storing the inputheightinches to a  variable for return purposes
        int heightinches = inputheightinches;
        
        //converting the height in feet to inches and adding to height in inches
        inputheightinches = (inputheightfeet * 12) + inputheightinches;
        
        double bmi = 703 * (inputweight/Math.pow(inputheightinches, 2));
        
        String outputstring ="";
        
        if (bmi < 18.5) outputstring = "you are underweight";
        else if (bmi >= 18.5 && bmi <= 25) outputstring = "you are healthy";
        else outputstring = "you are overweight";
        
        //formatting the bmi
        NumberFormat myformat = NumberFormat.getInstance();
        
        return "A height of " + inputheightfeet + "'" + heightinches 
                + " and weight of " + inputweight 
                + "lbs corresponds to a bmi of " + myformat.format(bmi)
                + " which means " + outputstring;
    }
}
