<%-- 
    Document   : purchase
    Created on : 8 Oct, 2022, 5:03:58 PM
    Author     : satish 
--%>

<%@page import="components.SelectBoxes"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Date"%>
<%@page import="java.util.function.Supplier"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>demo list</title>
    </head>
    <body>
    <center>
        <h1>demo list</h1>
        <select>
            <option value="1">Jan</option>
            <option value="2">Feb</option>
            <option value="3">Mar</option>
            <option value="4">Apr</option>
            <option value="5">May</option>
            <option selected value="6">Jun</option>
        </select>

        <form>
            <input type="hidden"  name="check" value="1"><br>
            <%
                PreparedStatement ps = database.DbConnect.connect().prepareStatement("select productid, productname from products order by productname asc");
                ResultSet rs = ps.executeQuery();

            %>
            <select>
                <%                    while (rs.next()) {
                        String productname = "" + rs.getObject("productname");
                        String productid = "" + rs.getObject("productid");
                %>
                <option value="<%=productid%>"><%=productname%></option>
                <%
                    }
                %>

            </select>
                
                <%=SelectBoxes.getProductsList("4", "myproducts")%>
            <input type="submit">
        </form>
    </center>

     </body>
</html>
