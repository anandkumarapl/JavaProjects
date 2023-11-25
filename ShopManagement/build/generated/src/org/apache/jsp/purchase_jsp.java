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

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    \n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\n");
      out.write("  ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>purchase</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<div class=\"container\">\n");
      out.write("    <nav class=\"navbar navbar-expand-lg bg-light \">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"demo.jsp\">Shop Management</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("      <ul class=\"navbar-nav\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\" href=\"demo.jsp\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("            ToDo List\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("              \n");
      out.write("            <li><a class=\"dropdown-item\" href=\"inserttask.jsp\">Task Insert</a></li>\n");
      out.write("             <li><a class=\"dropdown-item\" href=\"previoustask.jsp\">Previous Task</a></li>\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"futuretask.jsp\">Future Task</a></li>\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"alltask.jsp\">All Task</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>       \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("</div> \n");
      out.write("    <div>\n");
      out.write("       <!-- <h1 style=\"text-align: center; background-color: lightblue;\">TODO</h1>-->\n");
      out.write("    </div>\n");
      out.write("       \n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-dark bg-dark\">\n");
      out.write("  <!-- Navbar content -->\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-dark bg-primary\">\n");
      out.write("  <!-- Navbar content -->\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-light\" style=\"background-color: #e3f2fd;\">\n");
      out.write("  <!-- Navbar content -->\n");
      out.write("</nav>");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h1>purchase</h1>\n");
      out.write("\n");
      out.write("        ");

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

        
      out.write("\n");
      out.write("<form method=\"post\">\n");
      out.write("          ");
      out.print(result);
      out.write("\n");
      out.write("            <input type=\"hidden\"  name=\"check\" value=\"1\"><br>\n");
      out.write("            <div class=\"container col-md-3\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\"></div\n");
      out.write("                <div class=\"col-md-6\"></div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\">receiptNo</label>\n");
      out.write("                    <input name=\"receiptNo\" required type=\"number\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"receiptNo\" value=\"");
      out.print(receiptNo);
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\">dateofpurchase</label>\n");
      out.write("                    <input name=\"dateofpurchase\" required type=\"date\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"dateofpurchase\" value=\"");
      out.print(dateofpurchase);
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\">totalamount</label>\n");
      out.write("                    <input name=\"totalamount\" required type=\"number\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"totalamount\" value=\"");
      out.print(totalamount);
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\">suppliername</label>\n");
      out.write("                    <input name=\"suppliername\" required type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"suppliername\" value=\"");
      out.print(suppliername);
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\">supplieraddress</label>\n");
      out.write("                    <input name=\"supplieraddress\" required type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"supplieraddress\" value=\"");
      out.print(supplieraddress);
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\">supplierphones</label>\n");
      out.write("                    <input name=\"supplierphones\" required type=\"number\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"supplierphones\" value=\"");
      out.print(supplierphones);
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\">supplieremail</label>\n");
      out.write("                    <input name=\"supplieremail\" required type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"supplieremail\" value=\"");
      out.print(supplieremail);
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\">amountpaid</label>\n");
      out.write("                    <input name=\"amountpaid\" required type=\"number\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"amountpaid\" value=\"");
      out.print(amountpaid);
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\">amountpending</label>\n");
      out.write("                    <input name=\"amountpending\" required type=\"number\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"amountpending\" value=\"");
      out.print(amountpending);
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\">remarks</label>\n");
      out.write("                    <input name=\"remarks\" required type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"amountpending\" value=\"");
      out.print(remarks);
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            <input name=\"option\" type=\"submit\"class=\"btn btn-primary\">\n");
      out.write("\n");
      out.write("          <input name=\"option\" type=\"submit\" value=\"Clear\" class=\"btn btn-warning\">\n");
      out.write("            \n");
      out.write("             </form>\n");
      out.write("                </center>\n");
      out.write("                </body>\n");
      out.write("                </html>\n");
      out.write("            ");
      out.write(" <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\n");
      out.write("  \n");
      out.write(" <nav class=\"navbar navbar-dark bg-dark\">\n");
      out.write("  <!-- Navbar content -->\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-dark bg-primary\">\n");
      out.write("  <!-- Navbar content -->\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-light\" style=\"background-color: #e3f2fd;\">\n");
      out.write("  <!-- Navbar content -->\n");
      out.write("</nav>\n");
      out.write(" </body>\n");
      out.write("  </head>\n");
      out.write("</html>");
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
