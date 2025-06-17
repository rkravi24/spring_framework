package in.di.beans;

public class Address {
	private int houseno;
	private String city;
	
	
	//setter
//	public int getHouseno() {
//		return houseno;
//	}
//	public void setHouseno(int houseno) {
//		this.houseno = houseno;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
	
	
	//constructor
	public Address(int houseno, String city) {
		this.houseno = houseno;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "houseno " +houseno+" city "+city;
	}
}
