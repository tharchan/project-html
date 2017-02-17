import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;


public class Useraccountimpl {
	public static void main (String []args){
		UserAccount account1 = UserAccount.getInstance();
		
		String a= account1.getusername();
		System.out.println("username   " + a);  
		String b= account1.getpassword();
		System.out.println( "Enter password    "+b);
		String d = account1.getEmail();
		System.out.println( "email    "+d);
		
		
		UserAccount account2= UserAccount.getInstance( "John", "John15" ,"abc@hotmail.com" );
		String uname =account2.getusername();
		System.out.println("username    "+uname);
		account2.setusername("max");
		uname=account2.getusername( );
		System.out.println("username    "+  uname);
		
		String pass=account2.getpassword();
		System.out.println(pass);
		account2.setpassword("max15  ");
		pass=account2.getpassword();
		System.out.println("password    "+ pass);   
		
		String email= account2.getEmail();
		System.out.println("Email      "+email );
		account2.setEmail("abc@gmail.com");
		email=account2.getEmail();
		System.out.println("email      " +email);
}
	}
	