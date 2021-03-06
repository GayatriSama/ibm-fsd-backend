package com.examples.empapp.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.examples.empapp.dao.EmployeeDB;
import com.examples.empapp.service.Employee_Service;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.examples.empapp")
public class CustomDispatcherConfig {
	@Bean
	public Employee_Service empService() {
		return new Employee_Service();
	}
	
	@Bean
	public EmployeeDB empDao() {
		return new EmployeeDB();
	}
	
//	@Bean
//	public MysqlDataSource dataSource() {
//		MysqlDataSource datasource = new MysqlDataSource();
//		datasource.setServerName("localhost");
//		datasource.setDatabaseName("jdbctraining");
//		datasource.setUser("training");
//		datasource.setPassword("training");
//		
//		return datasource;
//	}
	
	@Bean
	public Connection connection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctraining", "training", "training");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
