package com.mta.javastock;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Exercise03 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		//Exercise01
		double radius = 50 ;
		double area = Math.PI * (Math.pow (radius,2));
		//Exercise02
		double hypotenuse = 50 ; 
		double oppositeDegree =30 ;
		double radians = Math.toRadians(oppositeDegree);
		double b = Math.sin(radians); 
		double opposite = b*hypotenuse;
		//Exercise03
		double base = 20;
		double exp = 13 ; 
		double result = Math.pow(base,exp);
		
		String line1 = new String("Area of circle with radius "+radius+" is: "+area+" square­cm");
		String line2 = new String ("Length of opposite where angle B is 30 degrees and Hypotenuse length is 50 cm is: "+opposite+" cm.");
		String line3 = new String(" Power of 20 with exp of 13 is "+result+".");
		String resulter = line1 +"<br>"+line2 +"<br>"+line3;
		resp.getWriter().println(resulter);
	}
}