//Calculus of mortgage's monthly payments

package serverpackage;

import java.text.NumberFormat;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName="Hwk5ServerWS")
public class Hwk5ServerWS 
{
    @WebMethod(operationName = "Hwk5ServerOp")
    public String Hwk5ServerOp(@WebParam(name = "inputLoan") int inputLoan, 
                                @WebParam(name = "inputTerm") int inputTerm, 
                                @WebParam(name = "inputInterest") double inputInterest) 
    {
        //converting the input values to monthly values
        inputTerm = inputTerm * 12;
        inputInterest = inputInterest/1200;
        
        double monthlyPayments = (inputLoan*(inputInterest*(Math.pow(1+inputInterest,inputTerm))))/(Math.pow(1+inputInterest,inputTerm) -1);
        
        NumberFormat regularformat = NumberFormat.getNumberInstance();
        
        return "Your monthly payments for a $" + regularformat.format(inputLoan) + 
                " loan a " + inputTerm/12 + "-year term with interest rate of " +
                inputInterest*1200 + "% is $" + regularformat.format(monthlyPayments);
    }

}
