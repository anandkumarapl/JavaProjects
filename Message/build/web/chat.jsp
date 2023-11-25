<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="database.DbConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Allchats</title>
    </head>
    <body>
    <center>
        <h1>Allchats</h1>

        <%
            PreparedStatement statement = DbConnect.connect().prepareStatement("select	msgfrom,msgto,message from message order by msgfrom");
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
