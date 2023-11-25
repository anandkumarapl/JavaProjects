

<%@page import="java.sql.PreparedStatement"%>
<%@page import="database.DbConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Management</title>

    </head>
    <body>
    <center>
        <h1>Products</h1>
        <%

            String check = request.getParameter("check");
            String option = "";
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }

            String productid = "", productname = "", price = "", description = "", discount = "", measurement = "", productcategory = "", result = "";
            System.out.println(ispostback);

            if (ispostback) {
                try {
                    option = request.getParameter("option");
                    if (option.equals("Submit")) {
                        productid = request.getParameter("productid");
                        productname = request.getParameter("productname");
                        price = request.getParameter("price");
                        description = request.getParameter("description");
                        discount = request.getParameter("discount");
                        measurement = request.getParameter("measurement");
                        productcategory = request.getParameter("productcategory");

                        PreparedStatement ps = DbConnect.connect().prepareStatement("insert into products values(productseq.nextval,?,?,?,?,?,?)");

                        ps.setString(1, productname);
                        ps.setString(2, price);
                        ps.setString(3, description);
                        ps.setString(4, discount);
                        ps.setString(5, measurement);
                        ps.setString(6, productcategory);

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
        
        <div class="container text-center">
                <div class="row">
                    <div class="col-md-3"></div>
                    <div class="col-md-6">
        
        
        
        
        
        <form method="post">
            <input type="hidden" name="check" value="1">

            productname<input class="form-control" name="productname" value="<%=productname%>" type="text">
            <br>
            price<input class="form-control" name="price" value="<%=price%>" type="number">
            <br>
            description<input class="form-control" name="description" value="<%=description%>" type="text">
            <br>
            discount<input class="form-control" name="discount"value="<%=discount%>" type="number">
            <br>
            measurement<input class="form-control" name="measurement" value="<%=measurement%>" type="text">
            <br>
            productcategory<input class="form-control" name="productcategory" value="<%=productcategory%>" type="text">
            <br>

            <input name="option" type="submit">

            <input name="option" type="submit" value="Clear">


        </form>
        <iframe style="width: 100%; border-style: none;height: 500px;" src="productlist.jsp"></iframe>
    </center>
</body>
</html>
