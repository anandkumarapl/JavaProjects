package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class simpleform_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Content Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<div>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg bg-light\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Navbar</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("      <ul class=\"navbar-nav\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\" href=\"index.jsp\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("          Sales\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("               <li><a class=\"dropdown-item\" href=\"https://www.flipkart.com/\">big billion days</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("          Pricing\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("               <li><a class=\"dropdown-item\" href=\"https://www.amazon.in/\">indian great festival</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("            Shop Management\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("              \n");
      out.write("              <li><a class=\"dropdown-item\" href=\"productmaster.jsp\">Products Master</a></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"productmasterstocks.jsp\">Product master Stock</a></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"productselects.jsp\">product selects</a></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"purchaseitem.jsp\">Purchase item</a></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"sales2.jsp\">salse2</a></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"\"></a></li> \n");
      out.write("            \n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    <div>\n");
      out.write("        <h1 style=\"text-align: center; background-color: lightblue;\">ABC Shop</h1>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\"></div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <form class=\"row g-3\">\n");
      out.write("  <div class=\"col-md-4\">\n");
      out.write("    <label for=\"validationDefault01\" class=\"form-label\">First name</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"validationDefault01\" value=\"Mark\" required>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-md-6\">\n");
      out.write("    <label for=\"validationDefault02\" class=\"form-label\">Last name</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"validationDefault02\" value=\"Otto\" required>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-md-2\">\n");
      out.write("    <label for=\"validationDefaultUsername\" class=\"form-label\">Username</label>\n");
      out.write("    <div class=\"input-group\">\n");
      out.write("      <span class=\"input-group-text\" id=\"inputGroupPrepend2\">@</span>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"validationDefaultUsername\"  aria-describedby=\"inputGroupPrepend2\" required>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-md-6\">\n");
      out.write("    <label for=\"validationDefault03\" class=\"form-label\">City</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"validationDefault03\" required>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-md-2\">\n");
      out.write("    <label for=\"validationDefault04\" class=\"form-label\">State</label>\n");
      out.write("    <select class=\"form-select\" id=\"validationDefault04\" required>\n");
      out.write("      <option selected disabled value=\"\">Choose...</option>\n");
      out.write("      <option>...</option>\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-md-2\">\n");
      out.write("    <label for=\"validationDefault05\" class=\"form-label\">Zip</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"validationDefault05\" required>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-2\">\n");
      out.write("    <div class=\"form-check\">\n");
      out.write("      <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"invalidCheck2\" required>\n");
      out.write("      <label class=\"form-check-label\" for=\"invalidCheck2\">\n");
      out.write("        Agree to terms and conditions\n");
      out.write("      </label>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-12\">\n");
      out.write("    <button class=\"btn btn-primary\" type=\"submit\">Submit form</button>\n");
      out.write("  </div>\n");
      out.write("</form>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\"></div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("    <style>\n");
      out.write(".footer {\n");
      out.write("  position: fixed;\n");
      out.write("  left: 0;\n");
      out.write("  bottom: 0;\n");
      out.write("  width: 100%;\n");
      out.write("  background-color: orchid;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write(" \n");
      out.write("<div class=\" \">\n");
      out.write("  <p>Footer </p>\n");
      out.write("  \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write('\n');
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
