package in.di.beans;

public class Address {
	private int houseno;
	private String city;
	
	public Address(int houseno, String city) {
		this.houseno = houseno;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "#" +houseno+ " "+city ; 
	}
	
}