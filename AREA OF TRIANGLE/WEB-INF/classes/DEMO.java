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
 
		
int a=Integer.parseInt (req.getParameter("A value"));   // return string
int b=Integer.parseInt (req.getParameter("B value"));   // return string
int c=Integer.parseInt (req.getParameter("C value"));   // return string 
if(a+b>c && b+c>a && c+a>b)
{ double S=a+b+c/2;

double RESULT = Math.sqrt(S*(S-a)*(S-b)*(S-c));
	out.println("</br><b>AREA OF TRIANGLE =</b>" + RESULT);
 
	
}
else
{
	out.println("Not a valid side ");
	
} 
out.close();
}
 
 

}
