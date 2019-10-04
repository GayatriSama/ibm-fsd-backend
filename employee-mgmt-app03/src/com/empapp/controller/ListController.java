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



@WebServlet("/listEmployees.do")
public class ListController extends HttpServlet {

		Employee_Service empService = new Employee_Service();
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			this.doPost(req, resp);
		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			List<Employee_details> employees;
			try {
				employees = empService.viewAll();
				System.out.println(employees);
				
				req.setAttribute("empList", employees);
				
				RequestDispatcher rd = req.getRequestDispatcher("listEmployees.jsp");
				rd.forward(req, resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
}
