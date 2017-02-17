public class EmployeeImpl {
public static void main(String[] args){
	Employee employee1=new Employee();
	
	employee1.print();
	
	
	Employee employee2=new Employee("244-44-4544","jhon", "ghale","01/01/1988", "woodside","6465450960","tha2hptmail.com", "programmer");
	employee2.print();
	
	String ss = employee2.getSSNumber();
	System.out.println(ss);
	
	employee2.setSSNumber("123-45-5678");
	String ss1 = employee2.getSSNumber();
	System.out.println(ss1);

 	String fname = employee2.getFirstName();
 	System.out.println(fname);
 	
 	employee2.setFirstName("Max");
 	String fname1 =employee2.getFirstName();
 	System.out.println(fname1);
 	 
 	String lname = employee2.getLastNmae();
 	System.out.println(lname);
 	
 	employee2.setLastNmae("bond");
 	String lname1 =employee2.getLastNmae();
 	System.out.println(lname1);
 	 
 	String dob=employee2.getDateOfBirth();
 	System.out.println(dob);
 	
 	employee2.setDateofBirth("22/22/2222");
 	String dob1=employee2.getDateOfBirth();
 	System.out.println(dob1);
 	
 	String add=employee2.getAddress();
 	System.out.println(add);
 	
 	employee2.setAddress("sunnyside");
 	String add1=employee2.getAddress();
 	System.out.println(add1);
 	
 	String email= employee2.getEmail();
 	System.out.println(email);
 	
 	employee2.setEmail("penny@hotmail.com");
 	String email1 =employee2.getEmail();
 	System.out.println(email1);
 	
 	employee2.setJobTitle("Accountant");
 	String jtitle =employee2.getJobTitle();
 	System.out.println(jtitle);
 	
 	employee2.setJobTitle("Sr.programmer");
 	String jtitle1=employee2.getJobTitle();
 	System.out.println(jtitle1); 	
}
}