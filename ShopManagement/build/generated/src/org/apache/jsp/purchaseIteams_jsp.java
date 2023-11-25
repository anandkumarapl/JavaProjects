package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import database.SelectBoxes;
import java.sql.ResultSet;
import database.DbConnect;
import java.sql.PreparedStatement;

public final class purchaseIteams_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <center>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<div class=\"container\">\n");
      out.write("    <nav class=\"navbar navbar-expand-lg bg-light \">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"purchase.jsp\">Shop Management</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("      <ul class=\"navbar-nav\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("            Shop Management List\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("              \n");
      out.write("              <li><a class=\"dropdown-item\" href=\"product.jsp\">Product</a></li>\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"purchase.jsp\">Purchase</a></li>\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"AllProducts.jsp\">All Products</a></li>\n");
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
      out.write("        <h1>PurchaseItems</h1>\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("           \n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("            <h3>");
      out.print(result);
      out.write("</h3>\n");
      out.write("            <form method=\"post\">\n");
      out.write("                        \n");
      out.write("            <input type=\"hidden\"  name=\"check\" value=\"1\"><br>\n");
      out.write("            <div class=\"container col-md-3\">\n");
      out.write("           <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\">receiptNo</label>\n");
      out.write("                    <input name=\"receiptNo\" required type=\"number\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"receiptno\" value=\"");
      out.print(receiptno);
      out.write("\">\n");
      out.write("                </div>               \n");
      out.write("            productid");
      out.print(SelectBoxes.getProductsList("4", "productid"));
      out.write("<br>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\">quantity</label>\n");
      out.write("                    <input name=\"quantity\" required type=\"number\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"quantity\" value=\"");
      out.print(quantity);
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\">price</label>\n");
      out.write("                    <input name=\"price\" required type=\"number\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"price\" value=\"");
      out.print(price);
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            <input name=\"option\" type=\"submit\" class=\"btn btn-warning\">\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("           \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </select>\n");
      out.write("    </body>\n");
      out.write("    </center>\n");
      out.write("</html>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
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
      out.write("%>\n");
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
