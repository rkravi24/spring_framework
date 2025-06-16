package in.springprogram.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.springprogram.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Student stdId() {
		Student std = new Student();
		std.setName("Ravi");
		std.setRollno(44);
		std.setEmail("mrkravi");
			
		return std;
	}
}
