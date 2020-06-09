<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<%@ page import="java.sql.*"%>
<html>
<body>
<%--  for comment  --%> 

<%
try 
{  
//Initialize Database Connection related information 
String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
String dbUsername = "system"; 
String dbPassword = "tauhid786786"; 
Connection con = DriverManager.getConnection(dbURL,dbUsername, dbPassword);
out.println("Connection is stablish = "+con);  



// Create a SQL query to insert data into
// STUDENT(S_NAME  , ROLL_NO ,DATA_STRUCTURE ,C ,J2EE ,JAVA ,DBMS);

PreparedStatement pst = con.prepareStatement("insert into student values(?, ? , ?, ?, ?, ?, ?)");
// sets the data to pst pointer
pst.setString(1, request.getParameter("S_NAME")); 
pst.setString(2, request.getParameter("ROLL_NO"));
pst.setString(3, request.getParameter("DATA_STRUCTURE")); 
pst.setString(4, request.getParameter("C"));
pst.setString(5, request.getParameter("J2EE")); 
pst.setString(6, request.getParameter("JAVA"));
pst.setString(7, request.getParameter("DBMS"));
// Execute the insert command using executeUpdate()



int x=pst.executeUpdate();  // It returns an integer value representing the number of rows affected                  
if(x!=0) {%>    
<h2>Student Marks  Successfully Inserted.....</h2>
<%} else{ %> 
<h2>Something went  wrong.....</h2>
<% } %>
<% 
// Close all the connections
con.close();  pst.close();
}
catch (Exception e)  {   out.println(e); }


%>

</body>
</html>
