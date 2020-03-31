// Servlet that uses session tracking to keep per-client access counts.
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class DEMO extends HttpServlet
 {
public void doGet(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException 
{
res.setContentType("text/html");
PrintWriter out = res.getWriter();
HttpSession session = req.getSession();    // this is how to get a session object   
 
Integer accessCount = (Integer) session.getAttribute("RAMA");// retrieving value from session object
if (accessCount == null) 
{
accessCount = 0;
 
} else 
{
 
accessCount +=   1;
}



session.setAttribute("RAMA", accessCount);    // storing the value with session object
 
  out.println("Your Session ID:  " + session.getId());  // never changes in the whole session
 out.println("<br>Session Creation Time: " + new Date(session.getCreationTime()));                        // never changes in the whole session
 out.println("<br>Time of Last Access: " + new Date(session.getLastAccessedTime()));                      // changes for every hit
 out.println("<br>Latest Hit Count: " + accessCount);      // increments by 1 for every hit
  }
}