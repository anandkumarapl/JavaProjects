<%@page import="java.sql.PreparedStatement"%>
<%@page import="databasepackage.DbConnect"%>
<%@include file="header.jsp" %>
<body>
    <!--Content-->
    <%@include file="menu.jsp" %>

    <%
        boolean ispostback = false;
        if (request.getParameter("check") != null) {
            ispostback = true;
        }
        String sno = "", otp = "", mobile = "", bookingdate = "", result = "";
        if (ispostback) {
            try {
                mobile = request.getParameter("number");
                PreparedStatement ps = DbConnect.connect().prepareStatement("delete from booking where mobileno=?");
                ps.setString(1, mobile);
                int n = ps.executeUpdate();
                result = "deleted";
            } catch (Exception ex) {
                System.out.println("ex");
                result = "" + ex;
            }
        }
        

    %>
<center>
    <h1>Booking App</h1>
    <form method="post">
        <%=result%>
        <input type="hidden" name="check" value="1"><br>          
        <div class="container col-md-3">
            <div class="row">
                <div class="col-md-3"></div
                <div class="col-md-6"></div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">mobile</label>
                    <input name="number" type="text" class="form-control" id="exampleFormControlInput1" placeholder="mobileno" value="<%=mobile%>">
                </div>
                <br>
                <div class="col-md-3">
                    <input type="submit"class="form-control btn btn-danger">
                </div>
                <br>
                </form>
                </center>
                <%@include  file="footer.jsp" %>