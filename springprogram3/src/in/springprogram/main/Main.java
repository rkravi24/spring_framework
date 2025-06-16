 package in.springprogram.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.springprogram.beans.Student;

public class Main {
	public static void main(String[] args) {
		String res_path = "in/springprogram/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(res_path);
		
		Student std = (Student) context.getBean("student");
		std.display();
	}
}
