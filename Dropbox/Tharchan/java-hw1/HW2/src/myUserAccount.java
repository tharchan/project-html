import java.util.Scanner;

public class myUserAccount {
	static UserAccount[] arrUserAccountList = new UserAccount[10];
	public static void main(String []args){		
		myUserAccount userAccount = new myUserAccount();		
		userAccount.load();
		Scanner in = new Scanner(System.in);
		String uname;
		String pass;
		while(true){
			System.out.println("LOGIN:");
			System.out.println("Enter UserName: ");
			uname = in.nextLine();
			System.out.println("Enter Password: ");
			pass = in.nextLine();
			boolean  ended = false;
			for(int i=0; i<arrUserAccountList.length;i++){				
				if(!(arrUserAccountList[i] == null)){
					boolean result = arrUserAccountList[i].authenticate(uname, pass);				
					if(result){
						System.out.println("Access is Granted");
						ended = true;
						break;
					}
					if(uname.equals("-1") && pass.equals("-1")){
						System.exit(0);						
					}
				}
			}
			if(!ended){
				System.out.println("Access Denied");				
			}			
		}		
	}
	public void load(){		
		arrUserAccountList[0] = UserAccount.getInstance("joe","111","jsmith@comp1.com");
		arrUserAccountList[1] = UserAccount.getInstance("angel","222","arodriguez@comp1.com");
		arrUserAccountList[2] = UserAccount.getInstance("sam","333","soerterson@comp1.com");
		arrUserAccountList[3] = UserAccount.getInstance("mary","444","mjohnson@comp1.com");
		arrUserAccountList[4] = UserAccount.getInstance("nancy","555","nrivera@comp1.com");		
	}
}
