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
	
String F_NAME = req.getParameter("F_NAME");   // return string
String L_NAME = req.getParameter("L_NAME");   
String AGE = req.getParameter("AGE");   // return string
String GENDER = req.getParameter("GENDER");   
String DOB = req.getParameter("DOB");   // return string
String ADDRESS = req.getParameter("ADDRESS");   


String SCHOOL_NAME_10 = req.getParameter("10_SCHOOL_NAME");   // return string
String PERCENTAGE_10 = req.getParameter("10_PERCENTAGE");   
String MARK_10 = req.getParameter("10_MARKS");   
String BOARD_10 = req.getParameter("10_BOARD");   // return string
String YEAR_10 = req.getParameter("10_YEAR");   

String SCHOOL_NAME_12 = req.getParameter("12_SCHOOL_NAME");   // return string
String PERCENTAGE_12 = req.getParameter("12_PERCENTAGE");   
String MARK_12 = req.getParameter("12_MARKS");   
String BOARD_12 = req.getParameter("12_BOARD");   // return string
String YEAR_12 = req.getParameter("12_YEAR");   


String COLLEGE_NAME = req.getParameter("COLLEGE_NAME");   // return string
String COURSE = req.getParameter("COURSE"); 
String MARK = req.getParameter("MARKS");   
String PERCENTAGE = req.getParameter("PERCENTAGE");   // return string
String UNIVERSITY = req.getParameter("UNIVERSITY");   


String EXPERIENCE = req.getParameter("EXPERIENCE");   
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
out.println("<h2><u>Personal Details</u></h2>");
	
  out.println("<table border='1' >");
  out.println("<tr><td><b>First Name</b> </td> <td>"+F_NAME+"</td></tr>");
  out.println("<tr><td><b>Last Name </b> </td> <td>"+L_NAME+"</td></tr>");
  out.println("<tr><td><b>AGE</b> </td> <td> "+AGE+"</td></tr>");
  out.println("<tr><td><b>GENDER</b> </td> <td>"+GENDER+"</td></tr>");
  out.println("<tr><td><b>DATE OF BIRTH </b> </td> <td>"+DOB+"</td></tr>");
  out.println("<tr><td><b>ADDRESS </b> </td> <td>"+ADDRESS+"</td></tr>");
  out.println("</table>");
  
out.println("<h2><u>Academic Details</u> </h2>");	
out.println("<h3><u>10th Class details</u> </h3>");	
  out.println("<table border='1' >");

	out.println("<tr><td><b>SCHOOL NAME</b> </td> <td>"+SCHOOL_NAME_10+"</td></tr>");
	out.println("<tr><td><b>PERCENTAGE</b> </td> <td>"+PERCENTAGE_10+"</td></tr>");
	out.println("<tr><td><b>Marks</b> </td> <td>"+MARK_10+"</td></tr>");
	out.println("<tr><td><b>BOARD</b> </td> <td>"+BOARD_10+"</td></tr>");
	out.println("<tr><td><b>YEAR</b> </td> <td>"+YEAR_10+"</td></tr>");
	out.println("</table>");
  
out.println("<h3><u>12th Class details</u></h3>");	
  out.println("<table border='1' >");
	
	out.println("<tr><td><b>SCHOOL NAME</b> </td> <td>"+SCHOOL_NAME_12+"</td></tr>");
	out.println("<tr><td><b>PERCENTAGE</b> </td> <td>"+PERCENTAGE_12+"</td></tr>");
	out.println("<tr><td><b>Marks</b> </td> <td>"+MARK_12+"</td></tr>");
	out.println("<tr><td><b>BOARD</b> </td> <td>"+BOARD_12+"</td></tr>");
	out.println("<tr><td><b>YEAR</b> </td> <td>"+YEAR_12+"</td></tr>");
     out.println("</table>");

out.println("<h3><u>College details</u> </h3>");	
     out.println("<table border='1' >");

	out.println("<tr><td><b>COLLEGE NAME</b> </td> <td>"+COLLEGE_NAME+"</td></tr>");
	out.println("<tr><td><b>COURSE</b> </td> <td>"+COURSE+"</td></tr>");
	out.println("<tr><td><b>PERCENTAGE</b> </td> <td>"+PERCENTAGE+"</td></tr>");
	out.println("<tr><td><b>MARK</b> </td> <td>"+MARK+"</td></tr>");
	out.println("<tr><td><b>UNIVERSITY</b> </td> <td>"+UNIVERSITY+"</td></tr>");
	out.println("</table>");
	
out.println("<h2><u>Experience details </u></h2>");
	
	out.println("<textarea rows='5' cols='60'>"+EXPERIENCE +"</textarea>");
	
	
out.close();

 
 
	}
}
