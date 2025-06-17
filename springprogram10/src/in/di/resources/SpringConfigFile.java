package in.di.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.di.beans.Address;
import in.di.beans.Education;
import in.di.beans.Student;


@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddrObj() {
		Address addr = new Address();
		addr.setHouseno(1);
		addr.setCity("Begusarai");
		addr.setCountry("India");
		return addr;
	}
	
	@Bean
	public Address createAddrObj2() {
		Address addr = new Address();
		addr.setHouseno(1);
		addr.setCity("Patna");
		addr.setCountry("India");
		return addr;
	}

	@Bean
	public Education createEduObj() {
		Education edu = new Education();
		edu.setCollege("IGNOU");
		edu.setCourse("MCA");
		edu.setBranch("Computer Application");
		return edu;
	}
	
	
	@Bean
	public Student createStdObj() {		
		Student std = new Student();
		std.setName("Ravi");
		
		//NO NEED TO REF OBJECT FOR SET THE ADDRESS and EDUCATION
		//WE USED AUTOWIRING IN Address class and Education class
		
		return std;
	}
	

}
