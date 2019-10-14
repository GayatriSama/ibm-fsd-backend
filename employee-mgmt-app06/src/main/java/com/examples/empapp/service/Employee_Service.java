package com.examples.empapp.service;
import java.beans.Statement;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.Callable;

import com.examples.empapp.dao.EmployeeDB;
import com.examples.empapp.model.Employee_details;

public class Employee_Service {

		
		ArrayList<Employee_details> employeeList = new ArrayList<Employee_details>();
		EmployeeDB db = new EmployeeDB();
		java.util.Scanner sc= new java.util.Scanner(System.in);

		public void add(Employee_details employee) throws SQLException {
			db.addEmployee(employee);
					
		}

		public void viewAll() throws SQLException {
			db.displayEmployee();
			
		}

		public void update(int id) throws SQLException {
			db.updateEmployee(id);
			
		}

		public void delete(int id) throws SQLException {
			
			db.deteleEmployee(id);
			
			
		}

		public void view(int id) throws SQLException {
			
				db.viewEmployee(id);
		}

		public void imported() throws SQLException {
			// TODO Auto-generated method stub
			BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader(
						"C:\\Users\\SamaNagaVenkataGayat\\details.txt"));
				String line = reader.readLine();
				while (line != null) {
					//System.out.println(line);
					String []tokens = line.split(",");
					Employee_details emp = new Employee_details(Integer.parseInt(tokens[0]),tokens[1],tokens[2],tokens[3]);
					db.addEmployee(emp);
					line = reader.readLine();
				}
				reader.close();
				System.out.println("File imported successfully.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void exported() {
			 try{    
		           FileWriter fw=new FileWriter("C:\\Users\\SamaNagaVenkataGayat\\details.txt"); 
		           ArrayList<Employee_details> employeeList= new ArrayList<Employee_details>();
		           employeeList = (ArrayList<Employee_details>) db.exportEmployees();
		           for(Employee_details e : employeeList)
		           {
		        	   fw.write(e.getId()+","+e.getName()+","+e.getDes()+","+e.getSal()+"\n"); 
		        	   
		           }
		              
		           fw.close();    
		          }
			 catch(Exception e){System.out.println(e);}    
		          System.out.println("File exported succesfully");    
			
		}

		

	}
