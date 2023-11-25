<%@page import="java.sql.ResultSet"%>
<%@page import="database.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <center><title>update</title>
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
            String name = "", id = "", age = "",result = "";
            if (!ispostback) {
                name = request.getParameter("name");
                id = request.getParameter("id");
                age = request.getParameter("age");
                PreparedStatement ps = DbConnect.connect().prepareStatement("select * from student where id=?");
                ps.setString(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    name = "" + rs.getObject("name");
                    id = "" + rs.getObject("id");
                    age = "" + rs.getObject("age");
                     
                }
            }
            System.out.println(ispostback);

            if (ispostback) {
                try {
                    name = request.getParameter("name");
                    id = request.getParameter("id");
                    age = request.getParameter("age");
                    PreparedStatement ps = DbConnect.connect().prepareStatement("UPDATE  student SET name=?,id=?,age=? where id=?");
                    ps.setString(1, name);
                    ps.setString(2, id);
                    ps.setString(3, age);
                    int n = ps.executeUpdate();
                    result = "Update" + n + " records";
                } catch (Exception ex) {
                    System.out.println(ex);
                    result = ex.getMessage();
                }
            }

        %>
        <h1>Update</h1>
        <form method="post">
            <h3><%=result%></h3>
            <input type="hidden"  name="check" value="1">
            <div class="container">
                <div class="row">
                    <div class="col-md-3"></div>
                    <div class="col-md-6">
                         <div class="form-floating mb-3">
                            <input value="<%=name%>" type="text" class="form-control" id="floatingInput">
                            <label for="floatingInput">name</label>
                        </div>

                        <br>
                        <div class="form-floating mb-3">
                            <input value="<%=id%>" type="text" class="form-control" id="floatingInput">
                            <label for="floatingInput">id</label>
                        </div>
                        <br>
                        <div class="form-floating mb-3">
                            <input value="<%=age%>" type="text" class="form-control" id="floatingInput">
                            <label for="floatingInput">age</label>
                        </div>
                            
                        <br>
                        <br>
                        <input class="btn btn-primary" type="submit">
                        </body>
                        </form>
                                </html>