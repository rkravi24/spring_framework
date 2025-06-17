package in.di.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.di.beans.Address;
import in.di.beans.Student;

@Configuration
public class SpringContextFile {
	
	@Bean
	public Address createAddrObj() {
		Address addr = new Address();
		
		addr.setHouseno(1);
		addr.setCity("Begusarai");
		
		return addr;
		
	}
	
	@Bean
	public Student createStdObj() {
		Student std = new Student();
		
		std.setName("Ravi");
		std.setRollno(44);
		std.setAddress(createAddrObj());
		
		return std;
	}

}
