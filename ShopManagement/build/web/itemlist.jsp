

<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="database.DbConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Stock List</title>
    </head>
    <body>
    <center>
        <h1>Stock List</h1>

        <%
            PreparedStatement statement = DbConnect.connect().prepareStatement("select	productname,quantity,price from productstock t1 join products t2 on t1.productid=t2.productid  order by productname");
            ResultSet rs = statement.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int n = rsmd.getColumnCount();
        %>

        <table border="1">
            <tr>
                <%
                    for (int i = 1; i <= n; i++) {
                %>
                <th><%=rsmd.getColumnLabel(i)%></th>


                <%
                    }

                %>
            </tr>
            <%    while (rs.next()) {%>
            <tr>
                <%
                    for (int i = 1; i <= n; i++) {
                %>
                <td><%=rs.getObject(i)%></td>


                <%
                    }
                %>
            </tr>
            <%
                }


            %>
        </table>

    </center>
</body>
</html>
