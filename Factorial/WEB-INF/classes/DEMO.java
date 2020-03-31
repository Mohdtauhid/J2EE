// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Enumeration;
// Extend HttpServlet class
public class DEMO extends HttpServlet 
{

protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
            
PrintWriter out  = res.getWriter();
res.setContentType("text/html");
 
		int fact_X=1;
		int fact_Y=1;
int X=Integer.parseInt (req.getParameter("X"));   // return string
int Y=Integer.parseInt (req.getParameter("Y"));   // return string
for( int i=X; i>1; i--)
fact_X=i*fact_X;
for( int i=Y; i>1; i--)
fact_Y=i*fact_Y;

	out.println("<br> Fact("+X+") :  "+fact_X);
	out.println("<br> Fact("+Y+") :  "+fact_Y);

	
	
out.close();
}
 
 

}
