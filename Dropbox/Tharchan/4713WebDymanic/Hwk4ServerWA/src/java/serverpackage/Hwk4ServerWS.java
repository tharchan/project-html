//Hwk4ServerWS: given two numbers and math operation
//returns the result of the math operation

package serverpackage;

import java.text.NumberFormat;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName="Hwk4ServerWS")
public class Hwk4ServerWS 
{
    @WebMethod(operationName = "Hwk4ServerOp")
    public String Hwk4ServerOp(@WebParam(name = "number1") double number1, 
                                @WebParam(name = "number2") double number2, 
                                @WebParam(name = "operationsign") String mathoperation) 
    {
        double result = 0.;
        
        if (mathoperation.equalsIgnoreCase("sum")) result = number1 + number2;
        else if (mathoperation.equalsIgnoreCase("product")) result = number1 * number2;
        else if (mathoperation.equalsIgnoreCase("division")) result = number1 / number2;
        else if (mathoperation.equalsIgnoreCase("exponentiation")) result = Math.pow(number1, number2);
        
        NumberFormat regularformat = NumberFormat.getNumberInstance();
        
        return "The " + mathoperation + " of " + regularformat.format(number1) + " and " + 
                regularformat.format(number2) + " is " + regularformat.format(result);
    }
}
