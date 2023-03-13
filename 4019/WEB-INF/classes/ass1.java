// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class ass1 extends HttpServlet {
 
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
	  String str = request.getParameter("num");
	  int n = Integer.parseInt(str);
      int arr[]={10,20,30,40,50};
	  String y = String.valueOf(arr[n-1]);
	  
      String title = "Array Data Access";
      String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
         
      out.println(docType +
         "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<h1 align = \"center\">" + title + "</h1>\n" +
               "<h3>\n" +
				  "  <li><b>Input Option given by user</b>: "
				  + request.getParameter("num") + "\n" +
				  "  <li><b>Array Value</b>: "
				  + y + "\n" +
               "</h3>\n" +
            "</body>" +
         "</html>"
      );
   }
}