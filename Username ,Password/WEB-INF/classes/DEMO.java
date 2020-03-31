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
            
			
res.setContentType("text/html");
PrintWriter out = res.getWriter();


String UserName ="tomcat_hello";     // username and password is hard-coded 
String PassWord ="tomcat_bye";           //ID

 
Cookie c1 = new Cookie(UserName,PassWord);
c1.setMaxAge(60*60*24*365);
res.addCookie(c1);


Cookie[] c = req.getCookies();
// If this person has been here before then we should have
// a cookiedemouser field assigned to a unique id.


if (c!=null) 
{ // we may have the cookie
for (int i=0; i<c.length; i++) 
{
if (c[i].getName().equals(req.getParameter("U_name"))) 
{
if(c[i].getValue().equals(req.getParameter("P_word")))
{
out.println("<h2>Login Successfully </h2>");
res.addCookie(c1);  // it can be automatically read upon the next login
}
else
out.println("<h2> Login Failed  <br> PassWord is Incorrect </h2>");	
}
else
out.println("<h2> Login Failed  <br> UserName is Incorrect</h2>");	
}
}
}
}
