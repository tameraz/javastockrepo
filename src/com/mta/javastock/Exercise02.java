package com.mta.javastock;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Exercise02 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		int num1;
		int num2;
		int num3;
		
		num1 = 4 ; 
		num2 = 3 ;
		num3 = 7 ;
		
		int result = (num1 +num2)* num3 ;
		
		String resultStr = new String ("<h1>result of "+num1+"*"+num2+"="+result+"</h1");
		resp.getWriter().println(resultStr);
	}
}
	