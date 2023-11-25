<%@page import="database.Search"%>
<%@page import="database.Message"%>
<%@page import="database.Utilities"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="database.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <center><title>Search</title>
    </head>
    <body>
        <%
            String check = request.getParameter("check");
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }
            String sno = "", message = "", msgfrom = "", msgto = "",result = "";
            System.out.println(ispostback);
            if (ispostback) {
                try {
                    
                    msgfrom = request.getParameter("msgfrom");
                    
                    PreparedStatement ps = DbConnect.connect().prepareStatement("select * from message where msgfrom=?");
                    ps.setString(1, msgfrom);
                
                    ResultSet rs = ps.executeQuery();
                    if(!rs.next())
                    {
                        result = "MsgFrom " + msgfrom + " not found";
                    }
                    else
                    {
                        
                        msgto="" + rs.getObject("msgto");
                        result = "Record Found ";
                    }
                    
                } catch (Exception ex) {
                    System.out.println(ex);
                    result = ex.getMessage();
                }
            }
        %>


        <h1>Messages</h1>
        <form>
            <h3><%=result%></h3>
            <form>
            <input type="hidden" name="check" value="2">
           msgfrom<input value="<%=msgfrom%>" name="msgfrom" type="text">
            msgto<input value="<%=msgto%>" name="msgto" type="text">
            <br>
            <br>
            <input type="submit" value="Search"/>
            </form>
          <%=Search.getList(msgfrom)%>
    </body>
</form>
</html>