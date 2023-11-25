
<%@page import="components.Utilities"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="database.DbConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<title>Content Page</title>
</head>
<body>
    <%@include file="menu.jsp" %>
    <div>
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
            <!--***********************************************-->
            <div class="container text-center">

                <div class="row">
                    <div class="col-md-3"></div>
                    <div class="col-md-6">




                        <form method="post">
                            <input type="hidden" name="check" value="1">


                            productname<input class="form-control" name="productname" value="<%=productname%>" type="text">

                            price<input class="form-control" name="price" value="<%=price%>" type="number">
                            description<input class="form-control" name="description" value="<%=description%>" type="text">

                            discount<input class="form-control" name="discount"value="<%=discount%>" type="number">

                            Measurement<input class="form-control" name="measurement" value="<%=measurement%>" type="text">
                            Product Category<input class="form-control" name="productcategory" value="<%=productcategory%>" type="text">
                            <input name="option" type="submit">

                            <input name="option" type="submit" value="Clear">


                        </form>
                    </div>
                    <div class="col-md-3"></div>
                </div>
            </div>
            <!--***********************************************-->
                        <div class="row">
                  <div class="col-md-2"></div>         
            <div class="col-md-8">
            <%=Utilities.getProductList()%>
            </div>
             <div class="col-md-2"></div>
            
                        </div>
                            
                

        
        
        
        </center>

    </div>


    <%@include file="footer.jsp" %>
