package com.empapp.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.empapp.model.Employee_details;
import com.empapp.service.Employee_Service;



@WebServlet("/updateEmployee.do")
public class UpdateEmployeeController extends HttpServlet {

		Employee_Service empService = new Employee_Service();
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			Integer id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			String des= req.getParameter("designation");
			String salary = req.getParameter("salary");
	
			
//			System.out.println("Name: " + name);
//			System.out.println("Age: " + age);
//			System.out.println("Designation: " + designation);
		
			Employee_details emp = new Employee_details();
			emp.setId(id);
			emp.setName(name);
			emp.setDes(des);
			emp.setSal(salary);
			
			try {
				empService.update(emp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Employee updated successfully.");
			
			RequestDispatcher rd = req.getRequestDispatcher("listEmployees.do");
			rd.forward(req, resp);
		}
}
