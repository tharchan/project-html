import java.util.UUID;

public class UserAccount{
	private UUID userAccountID;
	private String username;
	private String password;
	private String email;
	
	private UserAccount(){
	this.username="";
	this.password="";
	this. email="";
	}
	private UserAccount(String uname,String pass, String email){
	this.username= uname;
	this.password=pass;
	this.email=email;
	}
	
	public static UserAccount getInstance(){
		UserAccount objAccount1= new UserAccount();
		return objAccount1;
	}
	public static UserAccount getInstance( String U, String P, String E){
		UserAccount objAccount1=new UserAccount( U,E,P);
		return objAccount1;
	}
	
	public boolean authenticate( String U, String P){
		if ( this.username==U && this.password==P){
			return true;
		}
		return false;
	}
	public String getUserAccountID(){
		return userAccountID.toString();
	}
	
	public String getusername(){
		return username;
	}
	public void setusername(String uname){
		this.username =uname;
		
	}	
	public void setpassword(String pass){
		this.password = pass;
	}
	
	public String getpassword(){
		return password;
	}
		
	public String getEmail(){
		return email;
	}
	public void setEmail(String em){
		this.email = em;
	}
}
