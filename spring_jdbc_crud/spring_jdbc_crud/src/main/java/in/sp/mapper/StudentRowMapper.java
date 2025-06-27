package in.sp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.sp.beans.Student;

public class StudentRowMapper implements RowMapper<Student>{
	

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student s = new Student();
		s.setRoll(rs.getInt("std_roll"));
		s.setName(rs.getNString("std_name"));
		s.setMarks(rs.getInt("std_marks"));
		return s;
	}
}
