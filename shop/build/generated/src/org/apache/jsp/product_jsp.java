package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import database.DbConnect;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Show Management</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Products</h1>\n");
      out.write("        ");


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

        
      out.write("\n");
      out.write("        ");
      out.print(result);
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container text-center\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3\"></div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form method=\"post\">\n");
      out.write("            <input type=\"hidden\" name=\"check\" value=\"1\">\n");
      out.write("\n");
      out.write("            productname<input class=\"form-control\" name=\"productname\" value=\"");
      out.print(productname);
      out.write("\" type=\"text\">\n");
      out.write("            <br>\n");
      out.write("            price<input class=\"form-control\" name=\"price\" value=\"");
      out.print(price);
      out.write("\" type=\"number\">\n");
      out.write("            <br>\n");
      out.write("            description<input class=\"form-control\" name=\"description\" value=\"");
      out.print(description);
      out.write("\" type=\"text\">\n");
      out.write("            <br>\n");
      out.write("            discount<input class=\"form-control\" name=\"discount\"value=\"");
      out.print(discount);
      out.write("\" type=\"number\">\n");
      out.write("            <br>\n");
      out.write("            measurement<input class=\"form-control\" name=\"measurement\" value=\"");
      out.print(measurement);
      out.write("\" type=\"text\">\n");
      out.write("            <br>\n");
      out.write("            productcategory<input class=\"form-control\" name=\"productcategory\" value=\"");
      out.print(productcategory);
      out.write("\" type=\"text\">\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <input name=\"option\" type=\"submit\">\n");
      out.write("\n");
      out.write("            <input name=\"option\" type=\"submit\" value=\"Clear\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        <iframe style=\"width: 100%; border-style: none;height: 500px;\" src=\"productlist.jsp\"></iframe>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
