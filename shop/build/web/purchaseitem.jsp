

<%@page import="components.SelectBoxes"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="database.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PurchaseItems</title>
    </head>
    <body>
        <%@include file="menu.jsp" %>

    <center>
        <h1>PurchaseItems</h1>
        <%
            String check = request.getParameter("check");
            boolean ispostback;
            String receiptno = "";
            if (check == null) {
                receiptno = request.getParameter("receiptno");
                ispostback = false;
            } else {
                ispostback = true;
            }

            String productid = "", quantity = "", price = "", result = "";
            System.out.println(ispostback);

            if (ispostback) {
                try {

                    receiptno = request.getParameter("reciptno");
                    productid = request.getParameter("productid");
                    quantity = request.getParameter("quantity");
                    price = request.getParameter("price");
                    PreparedStatement ps = database.DbConnect.connect().prepareStatement("insert into PurchaseItems values(?,productseq.nextval,?,?,?)");
                    //ps.setString(1, entryno);
                    ps.setString(1, receiptno);
                    ps.setString(2, productid);
                    ps.setString(3, quantity);
                    ps.setString(4, price);
                    int n = ps.executeUpdate();
                    result = "Inserted" + "records";
                } catch (Exception ex) {
                    System.out.println(ex);
                    result = ex.getMessage();

                }
            }
        %>
        <form>
            <h3><%=result%></h3>
            
            <div class="container text-center">
                <div class="row">
                    <div class="col-md-3"></div>
                    <div class="col-md-6">

            <form method="post">

                <input class="form-control" type="hidden"  name="check" value="1"><br>

                receiptno<input class="form-control" value="<%=receiptno%>" autocomplete="off" name="reciptno" type="number">
                productid<%=SelectBoxes.getProductsList("4", "productid")%><br>
                quantity<input class="form-control" value="<%=quantity%>" autocomplete="off" name="quantity" type="number">
                price<input class="form-control" value="<%=price%>" autocomplete="off" name="price" type="number">
                <input name="option" type="submit">

            </form>



            </select>
            </body>
            </html>
            <%@include file="footer.jsp" %>
