package restaurant.models;

public class Customer {
	private String First_Name;
	private String Last_Name;
	private String StreetNo;
	private String StreetName;
	private String PhoneNo;
	private String City;
	private String State;
	private String ZipCode;

	public Customer() {
		
	}

	public Customer(String First_Name, String Last_Name,String StreetNo,String StreetName, String PhoneNo,String City,String State,String ZipCode) {
		this.First_Name=First_Name;
		this.Last_Name=Last_Name;
		this.StreetNo=StreetNo;
		this.StreetName=StreetName;
		this.PhoneNo=PhoneNo;
		this.City=City;
		this.State=State;
		this.ZipCode=ZipCode;
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

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
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


}
