package aug19.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calc")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		String num1 = request.getParameter("first_num");
		String num2 = request.getParameter("second_num");
		double d1 = Double.parseDouble(num1);
		double d2 = Double.parseDouble(num2);
		String opCode = request.getParameter("op_code");
		
		double result=0;
		switch(opCode) {
		 case "1":{result=d1+d2; break;}
		 case "2":{result=d1-d2; break;}
		 case "3":{result=d1*d2; break;}
		 case "4":{result=d1/d2; break;}
		 case "5":{result=d1%d2; break;} 
		}
		pw.print("The result is :");
		pw.println(result);
		
		String htmlResponse = "<html>";
		htmlResponse += "<a href='calculator.html'>Go back</a>";
		htmlResponse += "<br>";
        htmlResponse += "</html>";
        
        pw.println(htmlResponse);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		String num1 = request.getParameter("first_num");
		String num2 = request.getParameter("second_num");
		double d1 = Double.parseDouble(num1);
		double d2 = Double.parseDouble(num2);
		String opCode = request.getParameter("op_code");
		
		double result=0;
		switch(opCode) {
		 case "1":{result=d1+d2; break;}
		 case "2":{result=d1-d2; break;}
		 case "3":{result=d1*d2; break;}
		 case "4":{result=d1/d2; break;}
		 case "5":{result=d1%d2; break;} 
		}
		pw.print("The result is :");
		pw.println(result);
		
		String htmlResponse = "<html>";
		htmlResponse += "<a href='calculator.html'>Go back</a>";
		htmlResponse += "<br>";
        htmlResponse += "</html>";
        
        pw.println(htmlResponse);
	}

}
