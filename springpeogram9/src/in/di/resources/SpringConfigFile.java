package in.di.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.di.beans.Address;
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
	public Student createStdObj() {		
		Student std = new Student();
		std.setName("Ravi");
		
		//NO NEED TO REF OBJECT FOR SET THE ADDRESS 
		//WE USED AUTOWIRING IN Address class
		
		return std;
	}
}
