package edu.mum.waa;

public class Contacts {
    public StringBuilder getResponse(){

        StringBuilder response = new StringBuilder();
		response.append("<!DOCTYPE html>");
		response.append("<html>");
		response.append("<head>");
		response.append("<title>Almost an HTTP Server</title>");
		response.append("</head>");
		response.append("<body>");

        response.append("<p>This is from Contacts</p>");
        response.append("<p>From Class : " + this.getClass().getSimpleName() + "</p>");
        response.append("</body>");
        response.append("</html>");

        return response;
    }
}
