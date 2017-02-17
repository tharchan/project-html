
public class UserAccountList {
	private final int SIZE =10;
	private UserAccount[] arrUserAccountList;
	
	public UserAccountList(){
		
	}
	
	public UserAccount search(String username){
		return UserAccount.getInstance();
	}
	
	public boolean add(UserAccount acc){
		return false;
	}

	public boolean add(String uname,String pass,String email){
		return false;
	}
	
	public boolean edit(String username, UserAccount acc){
		return false;
	}
		
	public boolean edit(String uname,String pass,String email){
		return false;
	}
	
	public boolean remove(String uname){
		return false;
	}
	
	public void clear(){
		
	}
	
	public boolean Authenticate(String uname, String pass){
		return false;
	}
			
}
