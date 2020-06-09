// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.*;
// Extend HttpServlet class
public class DEMO extends HttpServlet 
{

protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
            res.setContentType("text/html");
PrintWriter out  = res.getWriter();

try 
{  
//Initialize Database Connection related information 
String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
String dbUsername = "system"; 
String dbPassword = "tauhid786786"; 
Connection con = DriverManager.getConnection(dbURL,dbUsername, dbPassword);
out.println("Connection is stablish = "+con);  

String Name =req.getParameter("S_NAME");
String Roll_No =req.getParameter("ROLL_NO");

////////////////////////-----Retrieving Data  from  Student table ---- ////////////////////////////////////////////////////
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * from  student where S_NAME = '" +Name+ "'  and ROLL_NO = '" +Roll_No+ "'  ");

while (rs.next()) 
{
	//retrieve and print the values for the current row
 int DATA_STRUCTURE =Integer.parseInt(rs.getString(3));
 int C =Integer.parseInt(rs.getString(4));
int  J2EE=Integer.parseInt(rs.getString(5));
int  JAVA=Integer.parseInt(rs.getString(6));
int  DBMS=Integer.parseInt(rs.getString(7));
 int SUM = DATA_STRUCTURE + C + J2EE + JAVA + DBMS;
 float PERCENTAGE=SUM/5;
 
out.println("<table border='1' >");

out.println("<tr><h1>------- REPORT CARD ----------</h1></tr>");
out.println("<tr><td><b>Name</b> </td> <td><b>"+Name+"</b></td></tr>");
out.println("<tr><td><b>ROLL NUMBER</b> </td> <td><b>"+Roll_No+"</b></td></tr>");
out.println("<tr><td><b>SUBJECTS</b> </td> <td><b>DATA STRUCTURE</b> </td> <td><b> C </b> </td> <td><b>   J2EE   </b> </td> <td><b>   JAVA  </b> </td> <td><b>  DBMS  </b> </td> </tr>");
out.println("<tr><td><b>MARKS</b> </td> <td><b>"+DATA_STRUCTURE+"</b> </td> <td><b>"+C+"</b> </td> <td><b>"+J2EE+"</b> </td> <td><b>"+JAVA+"</b> </td> <td><b>"+DBMS+"</b> </td> </tr>");
out.println("<tr><td><b>TOTAL MARKS </b> </td> <td><b>"+SUM+"</b></td>  <td><b>PERCENTAGE</b></td>   <td><b>"+PERCENTAGE+" % </b></td></tr>");
if (PERCENTAGE>40)
out.println("<tr><td><b>RESULT </b> </td> <td><b>Passed</b></td></tr>");
else
out.println("<tr><td><b>RESULT </b> </td> <td><b>Promoted</b></td></tr>");
    
  out.println("</table>");

}

// Close all the connections
con.close();
stmt.close(); rs.close();

}
catch (Exception e)  
{
out.println(e); 
}

out.close();
 

}
 
 

}
