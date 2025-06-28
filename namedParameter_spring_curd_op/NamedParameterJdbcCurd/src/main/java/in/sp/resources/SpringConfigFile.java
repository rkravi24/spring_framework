package in.sp.resources;


import java.security.spec.NamedParameterSpec;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public DriverManagerDataSource myDataSources() {
		DriverManagerDataSource dataSources = new DriverManagerDataSource();
		
		dataSources.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSources.setUrl("jdbc:mysql://localhost:3306/springdb");
		dataSources.setUsername("root");
		dataSources.setPassword("rootuser");
		return dataSources;
	}
	
	@Bean
	public NamedParameterJdbcTemplate npJdbcTemplate(){
		
//		NamedParameterJdbcTemplate jpJdbcTemplate = new NamedParameterJdbcTemplate(myDataSources());
		
		return new NamedParameterJdbcTemplate(myDataSources());
	}
}
