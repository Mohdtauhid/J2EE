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
Enumeration E=req.getParameterNames();
////////////////////////////------1 way -------/////////////////////////////////////
		while(E.hasMoreElements())
		{
			
			String P=(String)E.nextElement();
          
			out.println("</br>Parameter Name is  "+P+" And Parameter Value is  "+ req.getParameter(P));
		}		
        ///////////////////////////////////-----------2 way --------//////////////////////////////////////////////
 
		out.println("</br>"+req.getParameter("D value"));// from url (example:http://localhost:8080/MCA/demo ? D+value=2 & A+value=3 & B+value=4 )
		
/////////////////////////////////////-------------3 way-----------/////////////////////////////////////////////////		
		   String[] values=req.getParameterValues("habits");
        out.println("</br><b>Selected Values...<b>");    
        for(int i=0;i<values.length;i++)
       {
           out.println("<li>"+values[i]+"</li>");
       }
 
out.close();
}
 
 

}
