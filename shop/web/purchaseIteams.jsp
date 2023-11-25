<%-- 
    Document   : purchaseIteams
    Created on : 10 Oct, 2022, 3:55:35 PM
    Author     : satish
--%>

<%@page import="components.SelectBoxes"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="database.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PurchaseItems</title>
    </head>
    <body>
    <center>
        <h1>PurchaseItems</h1>
        <%
            String check = request.getParameter("check");
            boolean ispostback;
            String receiptno = "";
            if (check == null) 
            {
                receiptno=request.getParameter("receiptno");
                ispostback = false;
            } else {
                ispostback = true;
            }

            String   productid = "", quantity = "", price = "", result = "";
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
            
            
           
                    <form method="post">
                        
            <input type="hidden"  name="check" value="1"><br>
           
            receiptno<input value="<%=receiptno%>" autocomplete="off" name="reciptno" type="number"><br>
            productid<%=SelectBoxes.getProductsList("4", "productid")%><br>
            quantity<input value="<%=quantity%>" autocomplete="off" name="quantity" type="number"><br>
            price<input value="<%=price%>" autocomplete="off" name="price" type="number"><br>
            <input name="option" type="submit">

        </form>
           
                
                
            </select>
    </body>
</html>
