package in.di.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private String name;
	
	@Autowired
	private Address address; 
	
	//WE USED AUTOWIRING SO NO NEED OF ANY SETTER OR CONSTRUCTOR FOR SET THE VALUE OF ADDRESS
	//USE OF "Autowired" FOR AUTOWIRING
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
}
