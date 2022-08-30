package in.co.settergetter;

import java.util.Date;

public class Person {
	private String name;
	private String dob;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
