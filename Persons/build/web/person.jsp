<%-- 
    Document   : insert
    Created on : Oct 5, 2023, 6:56:16 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        String check=request.getParameter("check");
        boolean ispostback;
        if(check==null){
            ispostback=false;
        }
        else{
            ispostback=true;
        }
        int count=1;
        while(count<10){
            System.out.println(count);
        }
    %>
    <body>
        <h1>Hello World!</h1>
    </body>
    <%=check%>
    <%=ispostback%>
    <%=count%>
</html>
