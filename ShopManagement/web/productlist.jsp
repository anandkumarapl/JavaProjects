<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="database.DbConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
        <title>Product List</title>
    </head>
    <body>
    <center>
        <style>      
        tr{
            color: black;
        }
    </style>
        <h1>Product List</h1>

        <%
            PreparedStatement statement = DbConnect.connect().prepareStatement("select PRODUCTNAME  ,PRICE	,DESCRIPTION,	DISCOUNT,	UNITOFMEASUREMENT,	PRODUCTCATEGORY  from products order by productid desc");
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
<br>
<br>
<br>
 