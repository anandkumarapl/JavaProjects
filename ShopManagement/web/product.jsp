<%@page import="java.sql.PreparedStatement"%>
<%@page import="database.DbConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<body>
    <%@include file="menu.jsp" %>
<center>
    <style>
        body{
            background-color: lightsteelblue; 
        }
        div{
            color: darkblue;
        }
    </style>
    <h1>PRODUCTS</h1>
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
    <form method="post">
        <%=result%>
        <input type="hidden" name="check" value="1"><br>          
        <div class="container col-md-3">
            <div class="row">
                <div class="col-md-3"></div
                <div class="col-md-6"></div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Productname</label>
                    <input name="productname"  type="text" class="form-control" id="exampleFormControlInput1" placeholder="productname" value="<%=productname%>">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Price</label>
                    <input name="price"  type="number" class="form-control" id="exampleFormControlInput1" placeholder="price" value="<%=price%>">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Description</label>
                    <input name="description"  type="text" class="form-control" id="exampleFormControlInput1" placeholder="description" value="<%=description%>">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">discount</label>
                    <input name="discount"  type="text" class="form-control" id="exampleFormControlInput1" placeholder="discount" value="<%=discount%>">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Measurement</label>
                    <input name="measurement"  type="number" class="form-control" id="exampleFormControlInput1" placeholder="measurement" value="<%=measurement%>">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">productcategory</label>
                    <input name="productcategory"  type="text" class="form-control" id="exampleFormControlInput1" placeholder="productcategory" value="<%=productcategory%>">
                </div>

                <input name="option" type="submit"class="btn btn-primary">

                <input name="option" type="submit" value="Clear" class="btn btn-warning">


                </form>
                </center>
                </body>
                </html>
                <iframe style="width: 100%; border-style: none;height: 500px;" src="productlist.jsp"></iframe>


                <%@include  file="footer.jsp" %>
