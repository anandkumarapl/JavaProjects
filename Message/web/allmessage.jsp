<%@page import="database.Utilities"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Messages</title>
    </head>
    <body>
        <center>
        <h1>All Messages</h1>
        <%=Utilities.getTodoList()%>
        </center>>
                
    </body>
</html>
