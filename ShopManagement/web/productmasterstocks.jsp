<%@page import="java.sql.PreparedStatement"%>
<%@page import="database.DbConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Stock</title>
    </head>
    <body>
        <%@include file="menu.jsp" %>

    <center>
        <h1>Product Stock</h1>



        <%

            String check = request.getParameter("check");
            String option = "";
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }

            String productid = "", quantity = "", result = "";
            System.out.println(ispostback);

            if (ispostback) {
                try {
                    option = request.getParameter("option");
                    if (option.equals("Submit")) {
                        productid = request.getParameter("productid");
                        quantity = request.getParameter("quantity");

                        PreparedStatement ps = DbConnect.connect().prepareStatement("insert into productstock values(?,?)");
                        ps.setString(1, productid);
                        ps.setString(2, quantity);

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
        
          <!--***********************************************-->
            <div class="container text-center">
                <div class="row">
                    <div class="col-md-3"></div> 
                    <div class="col-md-6">
                
        <form method="post">
            <input type="hidden" name="check" value="1">
            

            productid<input class="form-control" name="productid" value="<%=productid%>" type="text">
            
            
            quantity<input class="form-control" name="quantity" value="<%=quantity%>" type="number">
            <br>
            <input name="option" type="submit">
            <br>
            <input name="option" type="submit" value="Clear">

            

            </center>
            </body>
            </html>
            <%@include file="footer.jsp" %>
