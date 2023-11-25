<%-- 
    Document   : purchase
    Created on : 8 Oct, 2022, 5:03:58 PM
    Author     : satish 
--%>

<%@page import="components.SelectBoxes"%>
<%@page import="java.sql.Date"%>
<%@page import="java.util.function.Supplier"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>purchase</title>
    </head>
    <body>
    <center>
        <h1>purchase</h1>

        <%
            String check = request.getParameter("check");
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }
            String receiptNo = "", dateofpurchase = "", totalamount = "", suppliername = "", supplieraddress = "", supplierphones = "", supplieremail = "", amountpaid = "", amountpending = "", remarks = "", result = "";

            System.out.println(ispostback);

            if (ispostback) {
                try {
                    receiptNo = request.getParameter("receiptNo");
                    dateofpurchase = request.getParameter("dateofpurchase");
                    out.println(dateofpurchase);
                    totalamount = request.getParameter("totalamount");
                    suppliername = request.getParameter("suppliername");
                    supplieraddress = request.getParameter("supplieraddress");
                    supplierphones = request.getParameter("supplierphones");
                    supplieremail = request.getParameter("supplieremail");
                    amountpaid = request.getParameter("amountpaid");
                    amountpending = request.getParameter("amountpending");
                    remarks = request.getParameter("remarks");
                    PreparedStatement ps = database.DbConnect.connect().prepareStatement("insert into purchase values(productseq.nextval,to_date(?,'yyyy-mm-dd'),?,?,?,?,?,?,?,?)");
                    //ps.setString(1, receiptNo);
                    ps.setString(1, dateofpurchase);//   Dateofpurchase);
                    ps.setString(2, totalamount);
                    ps.setString(3, suppliername);
                    ps.setString(4, supplieraddress);
                    ps.setString(5, supplierphones);
                    ps.setString(6, supplieremail);
                    ps.setString(7, amountpaid);
                    ps.setString(8, amountpending);
                    ps.setString(9, remarks);
                    int n = ps.executeUpdate();
                    result = "Inserted " + " records";
                    String newreceiptno=SelectBoxes.getNewReceiptId();
                    response.sendRedirect("purchaseIteams.jsp?receiptno=" + newreceiptno);
                } catch (Exception ex) {
                    System.out.println(ex);
                    result = ex.getMessage();
                }
            }

        %>


        <form>
            <h3><%=result%></h3>
            <input type="hidden"  name="check" value="1"><br>
            receiptNo<input value="<%=receiptNo%>" autocomplete="off" name="receiptNo" type="number"><br>
            dateofpurchase<input name="dateofpurchase" autocomplete="off" value="<%=dateofpurchase%>" type="date"><br>
            totalamount<input name="totalamount" autocomplete="off" value="<%=totalamount%>" type="number"><br>
            suppliername<input name="suppliername" autocomplete="off" value="<%=suppliername%>" type="text"><br>
            supplieraddress<input name="supplieraddress" autocomplete="off" value="<%=supplieraddress%>" type="text"><br>
            supplierphones<input name="supplierphones" autocomplete="off" value="<%=supplierphones%>" type="test"><br>
            supplieremail<input name="supplieremail" autocomplete="off" value="<%=supplieremail%>"type="text"><br>
            amountpaid<input name="amountpaid" autocomplete="off" value="<%=amountpaid%>"type="number"><br>
            amountpending<input name="amountpending" autocomplete="off" value="<%=amountpending%>" type="number"><br>
            remarks<input name="remarks" autocomplete="off" value="<%=remarks%>" type="text"><br>
            <input type="submit">

            </center>

             </body>
            </html>
