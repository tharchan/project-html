
public class Employee {
	String ssNumber;
	String firstName;
	String lastName;
	String dateOfBirth;
	String address;
	String phone;
	String email;
	String jobtitle;
	int age;
	private static int count = 0;
	
	public Employee(){
		this.ssNumber="";
		this.firstName="";
		this.lastName="";
		this.dateOfBirth="00/00/0000";
		this.age= 0;
		this.address="";
		this.phone="";
		this.email="";
		this.jobtitle="";
	}
	public Employee(String ss,String fname, String lname,String dob, String add,String phone,String email,String Jtitle){
		this.ssNumber=ss;
		this.firstName=fname;
		this.lastName=lname;
		this.dateOfBirth=dob;
		this.address=add;
		this.phone=phone;
		this.email= email;
		this.jobtitle=Jtitle;
		this.count++;
		
	}
	
	public String getSSNumber(){
		return ssNumber;
		
	}
	public void setSSNumber(String s){
		this.ssNumber=s;
	}
	
	public String getFirstName(){
		return firstName;
		
	}
	public void setFirstName(String f){
		this.firstName=f;
	}
	public String getLastNmae(){;
		return lastName;
		
	}
	public void setLastNmae(String L){
		this.lastName =L;
	}
	public String getDateOfBirth(){
		return dateOfBirth;
	}
	public void setDateofBirth(String d ){
		this. dateOfBirth=d;
	}
	public int getAge(){
		return age;
	}
	
	public String getAddress(){
		return address;
	}
	public void setAddress(String a){
		this.address =a;
	}
    public String getphone(){
    	return phone;
		
	}
	public void setphone(String p){
		this.phone=p;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String e ){
		this.email=e;
	}
	public String getJobTitle(){
		return jobtitle;
	}
	public void setJobTitle(String J){
		this.jobtitle= J;
	}
	public int getCount(){
		return count;
	}
	public void setCount(int c){
		this.count= c;
	}
	public void print(){
		System.out.println("Employee Information");
		System.out.println("First Name      = " +this.firstName);
		System.out.println("Last Name       = "+ this. lastName);
		System.out.println("Social Serurity = "+ this. ssNumber);
		System.out.println("Date of Birth  = "+ this. dateOfBirth);
		System.out.println("Address        = " + this. address);
		System.out.println("Age             = "+ this. age);
		System.out.println("Email           = "+ this. email);
		System.out.println("title           = "+ this. jobtitle);
		
	}
}










