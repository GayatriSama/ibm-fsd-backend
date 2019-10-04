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


import com.empapp.service.Employee_Service;


@WebServlet("/deleteEmployee.do")
public class DelEmployeeController extends HttpServlet {

		Employee_Service empService = new Employee_Service();
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			Integer id = Integer.parseInt(req.getParameter("id"));
			
			
			try {
				empService.delete(id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Employee deleted successfully.");
			
			RequestDispatcher rd = req.getRequestDispatcher("listEmployees.do");
			rd.forward(req, resp);
		}
}