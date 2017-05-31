package edu.mum;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String input1 = request.getParameter("num1");
		String input2 = request.getParameter("num2");
		String operator = request.getParameter("operator");

		int result = 0;

		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);

		if (operator.equals("+")) {
			result = num1 + num2;
		} else if (operator.equalsIgnoreCase("-")) {
			result = num1 - num2;
		} else if (operator.equals("*")) {
			result = num1 * num2;
		} else if (operator.equals("/")) {
			result = num1 / num2;
		}

		request.setAttribute("num1", num1); // It'll be available as ${num1}.
		request.setAttribute("num2", num2); // It'll be available as ${num2}.
		request.setAttribute("operator", operator); // It'll be available as ${operator}.
		
		request.setAttribute("result", result); // It'll be available as ${sum}.
	    request.getRequestDispatcher("calculator.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
