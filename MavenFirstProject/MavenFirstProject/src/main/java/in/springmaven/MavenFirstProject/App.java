package in.springmaven.MavenFirstProject;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	String config_file = "/in/sp/resources/applicationContext.xml";
    	ApplicationContext contex = new ClassPathXmlApplicationContext(config_file);
    	
    	Student std = (Student) contex.getBean("stdId");
    	std.display();
       
    }
}
