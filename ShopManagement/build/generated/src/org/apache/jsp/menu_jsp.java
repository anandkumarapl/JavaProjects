package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div class=\"container\">\n");
      out.write("    <nav class=\"navbar navbar-expand-lg bg-lightblue\">\n");
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
      out.write("        <h1 style=\"text-align: center; background-color: lightblue;\">TODO</h1>\n");
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
