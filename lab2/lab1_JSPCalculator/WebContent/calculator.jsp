<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Simple JSP Calculator</title>
</head>
<body>
	<form id = "calculator" method = "POST" action = "Calculator">
	
	<input type = "text" placeholder = "Input number 1" name = "num1" pattern = "[0-9]" title = "Please enter numeric value"  value = "${num1}" />

	<input type = "text" placeholder = "Operator" name = "operator" title = "Please enter operators +, - , * or /"  value = "${operator}" /> 
	
	<input type = "text" placeholder = "Input number 2" name = "num2" pattern = "[0-9]" title = "Please enter numeric value" value = "${num2}" />
		
	<input type = "text" placeholder = "Result" name = "result" title = "Result"  value = "${result}"/>
	
	<input type = "submit" value = "Calculate" id = "calc" />
	
	</form>
</body>
</html>