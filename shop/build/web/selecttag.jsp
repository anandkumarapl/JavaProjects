

<%@page import="components.SelectBoxes"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.naming.spi.DirStateFactory.Result"%>
<%@page import="database.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form>
            <%
            PreparedStatement ps=DbConnect.connect().prepareStatement("select*from products order by productname");
            ResultSet rs=ps.executeQuery();
            %>
            <select name="products" >
                <%
                while(rs.next())
                {
                String productid="" + rs.getObject("productid");
                String productname=""+rs.getObject("productname");
                %>
                <option value="<%=productid%>"><%=productname%></option>
                <%
                        }
                %>
                
                
            </select>
                <%=SelectBoxes.getProductsList("4", "productslist")%>
        <select name="month">
            
            <option value="1"> jan</option>
            <option value="2"> feb</option>
            <option value="3"> mar</option>
            <option selected value="4"> apr</option>
            <option value="5"> may</option>



        </select>
            
            <input type="submit" value="buttonwa">
        </form>
    </body>
</html>
