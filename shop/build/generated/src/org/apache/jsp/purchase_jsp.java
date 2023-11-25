package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import components.SelectBoxes;
import java.sql.Date;
import java.util.function.Supplier;
import java.sql.PreparedStatement;

public final class purchase_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>purchase</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>purchase</h1>\n");
      out.write("\n");
      out.write("        ");

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

        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("            <h3>");
      out.print(result);
      out.write("</h3>\n");
      out.write("            <input type=\"hidden\"  name=\"check\" value=\"1\"><br>\n");
      out.write("            receiptNo<input value=\"");
      out.print(receiptNo);
      out.write("\" autocomplete=\"off\" name=\"receiptNo\" type=\"number\"><br>\n");
      out.write("            dateofpurchase<input name=\"dateofpurchase\" autocomplete=\"off\" value=\"");
      out.print(dateofpurchase);
      out.write("\" type=\"date\"><br>\n");
      out.write("            totalamount<input name=\"totalamount\" autocomplete=\"off\" value=\"");
      out.print(totalamount);
      out.write("\" type=\"number\"><br>\n");
      out.write("            suppliername<input name=\"suppliername\" autocomplete=\"off\" value=\"");
      out.print(suppliername);
      out.write("\" type=\"text\"><br>\n");
      out.write("            supplieraddress<input name=\"supplieraddress\" autocomplete=\"off\" value=\"");
      out.print(supplieraddress);
      out.write("\" type=\"text\"><br>\n");
      out.write("            supplierphones<input name=\"supplierphones\" autocomplete=\"off\" value=\"");
      out.print(supplierphones);
      out.write("\" type=\"test\"><br>\n");
      out.write("            supplieremail<input name=\"supplieremail\" autocomplete=\"off\" value=\"");
      out.print(supplieremail);
      out.write("\"type=\"text\"><br>\n");
      out.write("            amountpaid<input name=\"amountpaid\" autocomplete=\"off\" value=\"");
      out.print(amountpaid);
      out.write("\"type=\"number\"><br>\n");
      out.write("            amountpending<input name=\"amountpending\" autocomplete=\"off\" value=\"");
      out.print(amountpending);
      out.write("\" type=\"number\"><br>\n");
      out.write("            remarks<input name=\"remarks\" autocomplete=\"off\" value=\"");
      out.print(remarks);
      out.write("\" type=\"text\"><br>\n");
      out.write("            <input type=\"submit\">\n");
      out.write("\n");
      out.write("            </center>\n");
      out.write("\n");
      out.write("             </body>\n");
      out.write("            </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
