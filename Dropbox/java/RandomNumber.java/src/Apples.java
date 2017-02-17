import java.util.Scanner;

public class Apples {
	public static void main(String []args){
		
		Scanner input = new Scanner (System.in);
		numbers numbersObject= new numbers();
		
		//System.out.println("enter name");
		//String name=input.nextLine();
 
		//numbersObject.simpleMessage(name);
		System.out.println("enter yor 1st gf here");
		String tip = input.nextLine();
		numbersObject.setName (tip);
		numbersObject.saying();
		
		
		
	}
}