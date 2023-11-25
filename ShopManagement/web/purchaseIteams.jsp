<%@page import="database.SelectBoxes"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="database.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
         <center>
    <body>
        <%@include file="menu.jsp" %>
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
            <div class="container col-md-3">
           <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">receiptNo</label>
                    <input name="receiptNo" required type="number" class="form-control" id="exampleFormControlInput1" placeholder="receiptno" value="<%=receiptno%>">
                </div>               
            productid<%=SelectBoxes.getProductsList("4", "productid")%><br>
            <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">quantity</label>
                    <input name="quantity" required type="number" class="form-control" id="exampleFormControlInput1" placeholder="quantity" value="<%=quantity%>">
                </div>
                 <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">price</label>
                    <input name="price" required type="number" class="form-control" id="exampleFormControlInput1" placeholder="price" value="<%=price%>">
                </div>
            <input name="option" type="submit" class="btn btn-warning">

        </form>
           
                
                
            </select>
    </body>
    </center>
</html>
<br>
<br>
<br>
<br>
<%@include file="footer.jsp" %>%>
