<%@page import="database.SelectBoxes"%>
<%@page import="java.sql.Date"%>
<%@page import="java.util.function.Supplier"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>purchase</title>
    </head>
    
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
        <h1>PURCHASE</h1>

        <%
            String check = request.getParameter("check");
               String option = "";
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
                    option = request.getParameter("option");
                   if (option.equals("Submit")){
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
                }
                }catch (Exception ex) {
                    System.out.println(ex);
                    result = ex.getMessage();
                }
            }

        %>
<form method="post">
          <%=result%>
            <input type="hidden"  name="check" value="1"><br>
            <div class="container col-md-3">
            <div class="row">
                <div class="col-md-3"></div
                <div class="col-md-6"></div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">receiptNo</label>
                    <input name="receiptNo" required type="number" class="form-control" id="exampleFormControlInput1" placeholder="receiptNo" value="<%=receiptNo%>">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">dateofpurchase</label>
                    <input name="dateofpurchase" required type="date" class="form-control" id="exampleFormControlInput1" placeholder="dateofpurchase" value="<%=dateofpurchase%>">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">totalamount</label>
                    <input name="totalamount" required type="number" class="form-control" id="exampleFormControlInput1" placeholder="totalamount" value="<%=totalamount%>">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">suppliername</label>
                    <input name="suppliername" required type="text" class="form-control" id="exampleFormControlInput1" placeholder="suppliername" value="<%=suppliername%>">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">supplieraddress</label>
                    <input name="supplieraddress" required type="text" class="form-control" id="exampleFormControlInput1" placeholder="supplieraddress" value="<%=supplieraddress%>">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">supplierphones</label>
                    <input name="supplierphones" required type="number" class="form-control" id="exampleFormControlInput1" placeholder="supplierphones" value="<%=supplierphones%>">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">supplieremail</label>
                    <input name="supplieremail" required type="text" class="form-control" id="exampleFormControlInput1" placeholder="supplieremail" value="<%=supplieremail%>">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">amountpaid</label>
                    <input name="amountpaid" required type="number" class="form-control" id="exampleFormControlInput1" placeholder="amountpaid" value="<%=amountpaid%>">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">amountpending</label>
                    <input name="amountpending" required type="number" class="form-control" id="exampleFormControlInput1" placeholder="amountpending" value="<%=amountpending%>">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">remarks</label>
                    <input name="remarks" required type="text" class="form-control" id="exampleFormControlInput1" placeholder="amountpending" value="<%=remarks%>">
                </div>

            <input name="option" type="submit"class="btn btn-primary">

          <input name="option" type="submit" value="Clear" class="btn btn-warning">
            
             </form>
                </center>
                </body>
                </html>
                <br>
                <br>
                <br>
            <%@include file="footer.jsp" %>