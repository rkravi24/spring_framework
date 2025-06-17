package in.di.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.di.beans.Student;
import in.di.resources.SpringConfigFile;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student std = (Student) context.getBean(Student.class);
		std.display();
	}

}
