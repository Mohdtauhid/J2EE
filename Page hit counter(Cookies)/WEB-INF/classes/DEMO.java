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
int id = 1;
if (c!=null) 
{ // we may have the cookie
for (int i=0; i<c.length; i++) 
{
if (c[i].getName().equals("COUNT"))  //read id value from browser example id=66;
{
id = Integer.parseInt(c[i].getValue()) ;
id++;                                             //id=67;       //  else id=2; 
}
break;
}
}
Cookie c1 = new Cookie("COUNT", Integer.toString(id));
c1.setMaxAge(60*60*24*365);  // 1 year life cycle
res.addCookie(c1);
  
out.println("Your Page hit:  " + id);
}
}