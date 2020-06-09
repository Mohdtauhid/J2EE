<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<html>
<body>

<%! String User_Name="Jamia_Millia_Islamia"; %>   <%--hardcoded --%>
<%! String Password="JMI_DCS_2020"; %>            <%--hardcoded   --%>
<%
if(User_Name.equals(request.getParameter("U_name"))) {
if(Password.equals(request.getParameter("P_word"))) {%>    
<p><b>Successfully Login</b></p>

<form action="DATA.jsp" method="Post"   >
<br><br><br><h2> --PERSONAL DETAIL-- </h2>
NAME : <input type="text" placeholder="ENTER NAME" size="50"  name="S_NAME"> <br/>   <br>
ROLL NO : <input type="text" placeholder="ENTER ROLL NUMBER" size="50"  name="ROLL_NO"> <br/>   <br>
<h2>----- SUBJECT MARKS---------- </h2>
DATA STRUCTURE : <input type="text" placeholder="ENTER MARKS" size="15"  name="DATA_STRUCTURE"> <br/>   <br>
C : <input type="text" placeholder="ENTER MARKS" size="15"  name="C"> <br/>   <br>
J2EE : <input type="text" placeholder="ENTER MARKS" size="15"  name="J2EE"> <br/>   <br>
JAVA : <input type="text" placeholder="ENTER MARKS" size="15"  name="JAVA"> <br/>   <br>
DBMS : <input type="text" placeholder="ENTER MARKS" size="15"  name="DBMS"> <br/>   <br>

<button type="submit">Submit</button>
<label>
<br><br>

<input type="checkbox" checked="checked" name="remember"> Remember me
</label>
</form>


<%} else{ %>
<p><b>Password is Incorrect</b></p>
<% } %>
<%}else{%>
<p><b>User Name  is Incorrect</b></p> 
<% }%>

</body>
</html>