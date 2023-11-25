<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>  
        <title>Insert</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
 

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
            String name = "", id = "", age = "", Result = "";
            System.out.println(ispostback);
            if (ispostback) {
                try {
                    name = request.getParameter("name");
                    id = request.getParameter("id");
                    age = request.getParameter("age");
                    PreparedStatement ps = database.DbConnect.connect().prepareStatement("insert into student values(?,?,?)");
                    ps.setString(1, name);
                    ps.setString(2, id);
                    ps.setString(3, age);
                    int n = ps.executeUpdate();
                    Result = "Inserted " + " records";
                } catch (Exception ex) {
                    System.out.println(ex);
                    Result = ex.getMessage();
                }
            }
        %>
        <h1>Student</h1>
        <form method="post">
            <%=Result%>
            <input type="hidden"  name="check" value="1"><br>
            <br>

            <div class="container">
                <div class="row">
                    <div class="col-md-3"></div>
                    <div class="col-md-6">

                        <div class="form-floating mb-3">
                            <input required name="name" type="text" class="form-control" id="floatingInput" placeholder=<%=name%>>
                            <label for="floatingInput">name</label>
                            <div class="valid-feedback">
                            </div>
                        </div>
                        <div class="form-floating mb-3">
                            <input required name="id" type="text" class="form-control" id="floatingInput" placeholder=<%=id%>>
                            <label for="floatingInput">id</label>
                            <div class="valid-feedback">
                            </div>
                        </div>
                        <div class="form-floating mb-3">
                            <input required name="age" type="text" class="form-control" id="floatingInput" placeholder=<%=age%>>
                            <label for="floatingInput">age</label>
                            <div class="valid-feedback">
                            </div>
                        </div>

                    </div>
                </div>
            </div>
                    <input class="btn btn-primary" type="submit">
                    <input class="btn btn-danger" type="submit" value="clear">

                    </form>
                            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
                    </body>
                    </html>
                    </center>