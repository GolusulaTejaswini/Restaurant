package restaurant.models;

public class Employee {
	private String StreetNo;
	private String StreetName;
	private String City;
	private String State;
	private String ZipCode;
	private Float Salary;
	private String Type;
	private String First_Name;
	private String Last_Name;
	private String SSN;
	//private Integer Employee_ID;
	private String PhoneNo;
	private int isSupervisor;

	public Employee() {
		
	}

	public Employee(String StreetNo, String StreetName, String City,String State,String ZipCode,
			Float Salary,String Type,String First_Name,String Last_Name,String SSN,String PhoneNo,int isSupervisor) {
		this.StreetNo=StreetNo;
		this.StreetName=StreetName;
		this.City=City;
		this.State=State;
		this.ZipCode=ZipCode;
		this.Salary=Salary;
		this.Type=Type;
		this.First_Name=First_Name;
		this.Last_Name=Last_Name;
		this.SSN=SSN;
		//this.Employee_ID=Employee_ID;
		this.PhoneNo=PhoneNo;
		this.isSupervisor=isSupervisor;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getStreetNo() {
		return StreetNo;
	}

	public void setStreetNo(String streetNo) {
		StreetNo = streetNo;
	}

	public String getStreetName() {
		return StreetName;
	}

	public void setStreetName(String streetName) {
		StreetName = streetName;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getZipCode() {
		return ZipCode;
	}

	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}

	public Float getSalary() {
		return Salary;
	}

	public void setSalary(Float salary) {
		Salary = salary;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	public int getIsSupervisor() {
		return isSupervisor;
	}

	public void setIsSupervisor(int isSupervisor) {
		this.isSupervisor = isSupervisor;
	}
	

}
