package edu.mum;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet{

	/**
	 * Created by Prasanna Bajracharya
	 * Created on : 05/31/2017
	 * Servlet to calculate arithmetic operation of 2 input values and an operator from user
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String input1 = request.getParameter("num1") == null ? "" : request.getParameter("num1");
		String input2 = request.getParameter("num2") == null ? "" : request.getParameter("num2");
		String operator = request.getParameter("operator") == null ? "" : request.getParameter("operator");
		
		int result = 0;
		
		StringBuffer sb = new StringBuffer();
		sb.append("<html><head><title>Simple Calculator</title></head><body>");
		sb.append("<h1>Simple Calculator</h1>");
		sb.append("<form action = 'CalculatorServlet' method = 'POST' >");
		sb.append("<input type = 'text' name = 'num1' placeholder = 'Input Number1' pattern = '[0-9]' title = 'Please enter numeric value' value = '" + input1 + "' />");
		sb.append("<input type = 'text' name = 'operator' size = '1' value = '" + operator + "' />");
		sb.append("<input type = 'text' name = 'num2' placeholder = 'Input Number2' pattern = '[0-9]' title = 'Please enter numeric value' value = '" + input2 + "' />");
		sb.append(" = ");			
		
		if(input1 != "" && input2 != ""){
			int num1 = Integer.parseInt(input1);
			int num2 = Integer.parseInt(input2);
			
			if(operator.equals("+")){
					result = num1 + num2;
			}else if(operator.equalsIgnoreCase("-")){
				result = num1 - num2;
			}else if(operator.equals("*")){
				result = num1 * num2;
			}else if(operator.equals("/")){
				result = num1 / num2;
			}
		}
		
		sb.append("<input type = 'number' name = 'result' placeholder = 'result' value = '" + result + "' />");
		sb.append("<input type = 'submit' name = 'calculate' value = 'Calculate' />");
			
		sb.append("</form></body></html>");
		
		out.print(sb.toString());
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		doGet(request, response);
	}

}
