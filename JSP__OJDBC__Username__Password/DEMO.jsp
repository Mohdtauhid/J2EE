<%@ page import="java.sql.*"%>


<%-- use for comment --%>

<%
String U= request.getParameter("username"); 
String P =request.getParameter("password");
out.println(U+" "+P); 

try 
{ 
//Initialize Database Connection related information 
String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
String dbUsername = "system"; 
String dbPassword = "tauhid786786"; 
Connection con = DriverManager.getConnection(dbURL,dbUsername, dbPassword);
out.println("Connection is stablish = "+con);  
   

// Create a SQL query to insert data into 
// Table_1(username,password) 
PreparedStatement pst = con.prepareStatement("insert into Table_1 values(?, ?)");
// sets the data to pst pointer
pst.setString(1, request.getParameter("username")); 
pst.setString(2, request.getParameter("password"));




//Execute the insert command using executeUpdate()
int x=pst.executeUpdate();//  It returns an integer value representing the number of rows affected        
if(x!=0)
out.println("<br>Data Successfully Inserted");
else
out.println("Something went  wrong.....");




////////////////////////-----Retrieving Data  from table ---- ////////////////////////////////////////////////////
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * from  Table_1");
while (rs.next()) 
{
	//retrieve and print the values for the current row
 	
    String User = rs.getString("USERNAME");   ///  rs.getInt(" ---- ");  rs.getFloat("  -----");
	 String Pass = rs.getString("PASSWORD");   
	        
   out.println("<br>ROW = " + User+" "+Pass);
}




// Close all the connections
pst.close(); con.close();
stmt.close(); rs.close();

}
catch (Exception e)  {   out.println(e); }


%>
