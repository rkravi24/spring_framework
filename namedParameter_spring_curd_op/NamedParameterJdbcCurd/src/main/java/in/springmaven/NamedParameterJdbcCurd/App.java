package in.springmaven.NamedParameterJdbcCurd;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.sp.resources.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
      
//      NamedParameterJdbcTemplate npJdbcTemplate = (NamedParameterJdbcTemplate) context.getBean("npJdbcTemplate");
      
      //or 
      
      	NamedParameterJdbcTemplate npJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);

      	Map<String, Object> map = new  HashMap<String, Object>();
      	map.put("key_rollno", 104);
      	map.put("key_name", "Ravii");
      	map.put("key_marks", 67);
      	
      	String insert_query = "insert into Student values(:key_rollno, :key_name, :key_marks)";
      	int count = npJdbcTemplate.update(insert_query, map);
      
      	if(count>0) {
      		System.out.println("success");
      	}else {
      		System.out.println("Failed");
      	}
    }
}
