import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map.Entry;


public class UserAccountList {
	private HashMap<String, UserAccount> userAccountList;
	
	public UserAccountList(){
		userAccountList = new HashMap<String, UserAccount>();		
	}
	public UserAccount search(String uName){
		return userAccountList.get(uName);
	}
	public boolean add(String uname, UserAccount acc){
		if(!userAccountList.containsKey(uname)){
			userAccountList.put(uname, acc);
			return true;
		}
		return false;
	}
	
	public boolean add(String uname, String pass, String email){
		UserAccount acc  = UserAccount.getInstance(uname, pass, email);
		return this.add(uname, acc);
	}
	
	public boolean edit(String uName, UserAccount acc){
		if(userAccountList.containsKey(uName)){
			userAccountList.get(uName).setEmail(acc.getEmail());
			userAccountList.get(uName).setPassword(acc.getPassword());
			return true;
		}
		return false;
	}
	public boolean edit(String uName, String pass, String email){		
		if(userAccountList.containsKey(uName)){
			userAccountList.get(uName).setEmail(email);
			userAccountList.get(uName).setPassword(pass);
			return true;
		}
		return false;
	}
	public boolean remove(String uName){
		if(userAccountList.containsKey(uName)){
			userAccountList.remove(uName);
			return true;
		}
		return false;
	}
	
	public boolean changeUserName(String uName, String newName){
		if(userAccountList.containsKey(uName)){
			userAccountList.get(uName).setUserName(newName);
		}		
		return false;
	}
	public boolean changePassword(String uName, String pass){		
		if(userAccountList.containsKey(uName)){
			userAccountList.get(uName).setPassword(pass);
			return true;
		}
		return false;
	}
	public boolean changeEmail(String uName, String newEmail){		
		if(userAccountList.containsKey(uName)){
			userAccountList.get(uName).setEmail(newEmail);
			return true;
		}
		return false;
	}
	public void clear(){
		userAccountList.clear();
	}
	
	public boolean authenticate(String uName, String pass){
		
		return false;
	}
	
	public void load(){
		this.Database_Load();
	}
	public void save(){
		this.Database_Save();
	}	
	protected void Database_Load(){
		try{
			File myFile = new File("UserAccountData.txt");
			if(!myFile.exists()) {
				myFile.createNewFile();				
			}
			FileInputStream fstream = new FileInputStream("UserAccountData.txt");

			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			 while ((strLine = br.readLine()) != null)   {
				 String[] input = strLine.split(",");				 
				 UserAccount objUserAccount = UserAccount.getInstance(input[1],input[2],input[3]);
				 this.add(input[1], objUserAccount);
			 }
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
	}
	protected void Database_Save(){
		try {
			File file = new File("UserAccountData.txt");
			if(!file.exists()) {
				file.createNewFile();				
			}
			FileWriter fw = new FileWriter (file,true);		    
		    PrintWriter outFile = new PrintWriter (fw);
		    System.out.println(this.userAccountList.size());
		    for(Entry<String, UserAccount> data : userAccountList.entrySet()) {
		        String key = data.getKey();		        
		        outFile.println(userAccountList.get(key).getUserAccountID()+","+userAccountList.get(key).getPassword()+","+userAccountList.get(key).getPassword()+","+userAccountList.get(key).getEmail());
		    }
		    outFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
