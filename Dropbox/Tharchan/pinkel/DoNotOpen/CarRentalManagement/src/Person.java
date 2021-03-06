public abstract class Person {
	private String ssNumber, firstName, lastName, dateOfBirth,address, phone, email;
	private int age;
	private static int count=0;
	
	public Person(){
		this.ssNumber="";
		this.firstName="";
		this.lastName="";
		this.dateOfBirth="";
		this.address="";
		this.phone="";
		this.email="";
		
	}
	public Person(String S,String F,String L,String D,String A,String P,String E){
		this.ssNumber=S;
		this.firstName=F;
		this.lastName=L;
		this.dateOfBirth=D;
		this.address=A;
		this.phone=P;
		this.email=E;
	}
	
	public String getSSNumber(){
		return ssNumber;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public String getDateOfBirth(){
		return dateOfBirth;
	}
	public int getAge(){
		return age;
	}
	public String getAddress(){
		return address;
	}
	public String getPhone(){
		return phone;
	}
	public String getEmail(){
		return email;
	}
	public int getCount(){
		return count;
	}
	
	public void setSSNumber(String S){
		this.ssNumber=S;
	}
	public void setFirstName(String F){
		this.firstName=F;
	}
	public void setLastName(String L){
		this.lastName=L;
	}
	public void setDateOfBirth(String D){
		this.dateOfBirth=D;
	}
	
	public void setAddress(String A){
		this.address=A;
	}
	public void setPhone(String P){
		this.phone=P;
	}
	public void setEmail(String E){
		this.email=E;
	}
	public void setCount(int C){
		this.count=C;
	}	
	public abstract void print();
}