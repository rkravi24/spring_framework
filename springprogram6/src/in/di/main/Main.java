package in.di.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.di.beans.Student;

public class Main {
	public static void main(String[] args) {
		
		String config_file = "in/di/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_file);
		
		Student std = (Student) context.getBean("stdId");
		std.display();
	}

}
