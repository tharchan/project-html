
import java.util.Scanner;

//Quizz1: calculation of asset depreciation

public class Quizz1 
{
    public static void main(String[] args)
    {
        try
        {
            //declaring and initiate variables for the inputs
            double original_value=0., salvage_value=0.;
            int useful_life;
            double depreciation=0.;
            
            //creating an object of the class Scanner
            Scanner keyboard = new Scanner(System.in);
            
            //getting the inputs from the user
            System.out.println("Original value?");
            original_value= keyboard.nextDouble();
            System.out.println("salvage_value?");
            salvage_value= keyboard.nextDouble();
            System.out.println("Useful life?");
            useful_life= keyboard.nextInt();
            
            //depreciation
            depreciation = (original_value - salvage_value)/useful_life;
            
            if (depreciation>0)
            System.out.println("Asset with an original value of $" +
                    original_value + " and a salvage value of $" + 
                    salvage_value + " depreciates by $" +
                    depreciation + " per year");
            else if (depreciation < 0)
                System.out.println("Asset with an original value of $" +
                    original_value + " and a salvage value of $" + 
                    salvage_value + " appreciates by $" +
                    (-1) * depreciation + " per year");
            else 
                System.out.println("Asset with an original value of $" +
                    original_value + " and a salvage value of $" + 
                    salvage_value + " appreciates by $" +
                    depreciation + " per year");
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
    }
    
}
