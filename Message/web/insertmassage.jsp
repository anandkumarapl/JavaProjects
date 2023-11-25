<%@page import="database.Utilities"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="database.DbConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Message</title>

    </head>
    <body>
    <center>
        <h1>Insert Message</h1>
        <%
            String check = request.getParameter("check");
            String option = "";
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }

            String sno = "", message = "", msgfrom = "", msgto = "", result = "";
            System.out.println(ispostback);

            if (ispostback) {
                try {
                    option = request.getParameter("option");
                    if (option.equals("Submit")) {
                        sno = request.getParameter("sno");
                        message = request.getParameter("message");
                        msgfrom = request.getParameter("msgfrom");
                        msgto = request.getParameter("msgto");
                        PreparedStatement ps = DbConnect.connect().prepareStatement("insert into message values(messageseq.nextval ,?,?,?)");

                        //ps.setString(1, sno);
                        ps.setString(2, message);
                        ps.setString(3, msgfrom);
                        ps.setString(4, msgto);
                        int n = ps.executeUpdate();
                        result = "Inserted " + n + " records";
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                    result = ex.getMessage();
                }
            }

        %>
        <%=result%>

        <form method="post">
            <input type="hidden" name="check" value="1">
            <br>
            message<input class="form-control" name="message" value="<%=message%>" type="text">
            <br>
            msgfrom<input class="form-control" name="msgfrom" value="<%=msgfrom%>" type="text">
            <br>
            msgto<input class="form-control" name="msgto"value="<%=msgto%>" type="text">
            <br>
            <br>
            <input name="option" type="submit">

            <input name="option" type="submit" value="Clear">


        </form>
            <br>
            <br>
        <%=Utilities.getTodoList()%>
    </center>
</body>
</html>

