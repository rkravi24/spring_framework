package in.springmaven.spring_jdbc_crud;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import in.sp.beans.Student;
import in.sp.mapper.StudentRowMapper;
import in.sp.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
    	int  std_roll = 1;
    	String std_name = "Ravi";
    	int std_marks = 98;
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        JdbcTemplate template = context.getBean(JdbcTemplate.class);
        
//+++++++++++++++++++++ insert +++++++++++++++++++++
        
//        String insert_data = "insert into student values(?, ?, ?)";
//        int count = template.update(insert_data,std_roll,std_name,std_marks);
//        if(count>0) {
//        	System.out.println("success");
//        }else {
//        	System.err.println("False");
//        }
        
//+++++++++++++++++++++ update +++++++++++++++++++++
     

//        std_name = "raj";  
//        String update_query = "update student set std_name=? where std_roll=44";
//        
//        int update_count = template.update(update_query, std_name);
//        
//        if(update_count>0) {
//        	System.out.println("success");
//        }else {
//        	System.out.println("Failed");
//        }
        
        
// +++++++++++++++++++++ delete +++++++++++++++++++++
        
//        String delete_query = "delete from student where std_roll = 1";
//        int delete_count = template.update(delete_query);
//        if(delete_count>0) {
//        	System.out.println("delete success");
//        }else {
//        	System.err.println("delete op failed");
//        }
        
        
// +++++++++++++++++++++ select all +++++++++++++++++++++
        
//       String select_query = "select * from student";
//       List<Student> s_list =  template.query(select_query, new StudentRowMapper());
//       for(Student std : s_list) {
//    	   System.out.println("Roll: "+std.getRoll());
//    	   System.out.println("Name: "+std.getName());
//    	   System.out.println("Marks: "+std.getMarks());
//    	   System.out.println("----------------------------");
//       }
        
        
 // +++++++++++++++++++++ select one data way - 1 +++++++++++++++++++++
        String select_query2 = "select * from student where std_roll = 44";
        List<Student> s_list2 =  template.query(select_query2, new StudentRowMapper());
        for(Student std : s_list2) {
     	   System.out.println("Roll: "+std.getRoll());
     	   System.out.println("Name: "+std.getName());
     	   System.out.println("Marks: "+std.getMarks());
        }
        
        
 // +++++++++++++++++++++ select one data way - 2 +++++++++++++++++++++
        int roll = 4;
        String select_query3 = "select * from student where std_roll = ?";
        Student std_obj =  template.queryForObject(select_query3, new StudentRowMapper(), roll);
     	System.out.println("Roll: "+std_obj.getRoll());
     	System.out.println("Name: "+std_obj.getName());
     	System.out.println("Marks: "+std_obj.getMarks());
  
    }
}
