package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.any;


public class StudentDetails extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	
	
	{
		any an=new any();
		ArrayList al=new ArrayList();
		al.add(an);
		request.setAttribute("al",al);
		RequestDispatcher rd=request.getRequestDispatcher("studentsDetails.jsp");
		rd.forward(request,response);
	}
			
			
}
