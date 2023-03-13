// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class ass2 extends HttpServlet {
 
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
	  String str = request.getParameter("regno");
	  int n = Integer.parseInt(str);
	  String r="0";
      int arr[][]={{19,100},{54,89},{28,70},{27,90},{5,75}};
	  int arr2[][]={{19,1},{54,3},{28,5},{27,2},{5,4}};
	  for(int i=0;i<5;i++)
	  {
		  if(arr[i][0]==n)
			  r = String.valueOf(arr2[i][1]);
	  }
      //String y = String.valueOf(r);
	  
	  
      String title = "Rank Access";
      String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
         
      out.println(docType +
         "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
			"<script>"+
			"alert(\""+r+"\");"+
			"</script>"+
               "<h1 align = \"center\">" + title + "</h1>\n" +
               "<h3>\n" +
				  "  <li><b>Register Number</b>: "
				  + request.getParameter("regno") + "\n" +
				  "  <li><b>Rank</b>: "
				  + r + "\n" +
               "</h3>\n" +
            "</body>" +
         "</html>"
      );
   }
}