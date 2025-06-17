package in.di.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
	
	private int houseno;
	private String city;
	private String country;
	
	
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "houseno "+houseno+" city "+city+" country "+country;
	}
	
}
