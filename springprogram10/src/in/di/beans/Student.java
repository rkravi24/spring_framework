package in.di.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String name;
	
	@Autowired
	@Qualifier("createAddrObj2")  //two or more bean object then specify
	private Address address; 
	
	@Autowired
	private Education education;
	
	//WE USED AUTOWIRING SO NO NEED OF ANY SETTER OR CONSTRUCTOR FOR SET THE VALUE OF ADDRESS and EDUCATION
	//USE OF "Autowired" FOR AUTOWIRING
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Education: "+education);
	}
}
