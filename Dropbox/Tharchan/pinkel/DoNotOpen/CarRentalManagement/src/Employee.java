import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Employee extends Person{
	private String jobTitle;
	
	public String getJobTitle(){
		return this.jobTitle;
	}
	public void setJobTitle(String job){
		this.jobTitle=job;
	}
	public Employee() {
		super();
		this.jobTitle="";
		super.setCount(super.getCount()+1);
	}
	
	public Employee(String S,String F,String L,String D,String A,String P,String E,String job) {
		super(S, F, L, D, A, P, E);
		this.jobTitle=job;
		super.setCount(super.getCount()+1);
	}
	
	public void load(String key){
		this.Database_Load(key);
	}
	public void insert(){
		this.Database_Insert();
	}
	public void update(){
		this.Database_Update();
	}
	public void delete(){
		this.Database_Delete();
	}
	protected void Database_Load(String key){
		// for future implementation
	}
	protected void Database_Insert(){
		// for future implementation			
	}
	protected void Database_Update(){
		// for future implementation		
	}
	protected void Database_Delete(){
		// for future implementation		
	}
	
	@Override
	public void print() {
		try {
			File file = new File("Network_Printer.txt");
			FileWriter fw = new FileWriter (file,true);
		    
		    PrintWriter outFile = new PrintWriter (fw);
		    outFile.println("Employee information:");
		    outFile.println("First Name = "+this.getFirstName());
		    outFile.println("Last Name = "+this.getLastName());
		    outFile.println("Social Security  = "+this.getSSNumber());
		    outFile.println("Date Of Birth = "+this.getDateOfBirth());
		    outFile.println("Address = "+this.getAddress());
		    outFile.println("Age = "+this.getAge());
		    outFile.println("Email = "+this.getEmail());
		    outFile.println("Title = "+this.getJobTitle());
		    
		    outFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
