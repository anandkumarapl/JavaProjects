<%-- 
    Document   : purchase
    Created on : 8 Oct, 2022, 5:03:58 PM
    Author     : satish 
--%>

<%@page import="java.sql.Date"%>
<%@page import="java.util.function.Supplier"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>purchase</title>
    </head>
    <body>
        <%@include file="menu.jsp" %>

    <center>
        <h1>Sales</h1>

        <%
            String check = request.getParameter("check");
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }
            String receiptNo = "", dateofsale = "", customername = "", customeradress = "", customerphones = "", customeremail = "", amountpaid = "", amountpending = "", remarks = "", result = "";

            System.out.println(ispostback);

            if (ispostback) {
                try {
                    receiptNo = request.getParameter("receiptNo");
                    dateofsale = request.getParameter("dateofsale");
                    out.println(dateofsale);
                    customername = request.getParameter("customername");
                    customeradress = request.getParameter("customeradress");
                    customerphones = request.getParameter("customerphones");
                    customeremail = request.getParameter("customeremail");
                    amountpaid = request.getParameter("amountpaid");
                    amountpending = request.getParameter("amountpending");
                    remarks = request.getParameter("remarks");
                    PreparedStatement ps = database.DbConnect.connect().prepareStatement("insert into sales values(salesseq.nextval,to_date(?,'yyyy-mm-dd'),?,?,?,?,?,?,?,?,?)");
                    ps.setString(1, receiptNo);
                    ps.setString(2, dateofsale);
                    ps.setString(3, customername);
                    ps.setString(4, customeradress);
                    ps.setString(5, customerphones);
                    ps.setString(6, customeremail);
                    ps.setString(7, amountpaid);
                    ps.setString(8, amountpending);
                    ps.setString(9, remarks);
                    int n = ps.executeUpdate();
                    result = "Inserted " + " records";
                } catch (Exception ex) {
                    System.out.println(ex);
                    result = ex.getMessage();
                }
            }

        %>


        <form>
            <h3><%=result%></h3>

            
          <!--***************************************************-->
          <div class="container text-center">
              <div class="row">
                  <div class="col-md-3"></div>
                  <div class="col-md-6">
                      
            
            
            
            <input type="hidden"  name="check" value="1"><br>
            receiptNo<input class="form-control" value="<%=receiptNo%>" autocomplete="off" name="receiptNo" type="number"><br>
            dateofsale<input class="form-control" name="dateofsale" autocomplete="off" value="<%=dateofsale%>" type="date"><br>
            customername<input class="form-control" name="customername" autocomplete="off" value="<%=customername%>" type="text"><br>
            customeraddress<input class="form-control" name="customeraddress" autocomplete="off" value="<%=customeradress%>" type="text"><br>
            customerphones<input class="form-control" name="customerphones" autocomplete="off" value="<%=customerphones%>" type="number"><br>
            customeremail<input class="form-control" name="customeremail" autocomplete="off" value="<%=customeremail%>" type="tet"><br>
            amountpaid<input class="form-control" name="amountpaid" autocomplete="off" value="<%=amountpaid%>"type="number"><br>
            amountpending<input class="form-control" name="amountpending" autocomplete="off" value="<%=amountpending%>" type="number"><br>
            remarks<input class="form-control" name="remarks" autocomplete="off" value="<%=remarks%>" type="text"><br>
            <input type="submit">

            </center>
             </body>
            </html>
            <%@include file="footer.jsp" %>
