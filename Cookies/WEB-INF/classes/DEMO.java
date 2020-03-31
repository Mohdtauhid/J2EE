// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Enumeration;
import java.util.*;

public class DEMO extends HttpServlet 
{
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
{
res.setContentType("text/html");
PrintWriter out = res.getWriter();
Cookie[] c = req.getCookies();
// If this person has been here before then we should have
// a cookiedemouser field assigned to a unique id.
String id = null;
if (c!=null) 
{ // we may have the cookie
for (int i=0; i<c.length; i++) 
{
if (c[i].getName().equals("DCB_JMI_2020")); 
{
id = c[i].getValue();
}
break;
}
}
if (id == null) 
{
// They have not been here before and need a cookie.
String uid = new java.rmi.server.UID().toString();
id = uid;
Cookie c1 = new Cookie("DCB_JMI_2020", id);
c1.setMaxAge(60*60*24*365);
res.addCookie(c1);
out.println("Welcome, you were never here before");
}
else
out.println("Your last visit id was " + id);
}
}