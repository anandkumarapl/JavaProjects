package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fristpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("   \n");
      out.write("     <title>Bootstrap Example</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- Carousel -->\n");
      out.write("<div id=\"demo\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("\n");
      out.write("  <!-- Indicators/dots -->\n");
      out.write("  <div class=\"carousel-indicators\">\n");
      out.write("    <button type=\"button\" data-bs-target=\"#demo\" data-bs-slide-to=\"0\" class=\"active\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#demo\" data-bs-slide-to=\"1\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#demo\" data-bs-slide-to=\"2\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#demo\" data-bs-slide-to=\"3\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#demo\" data-bs-slide-to=\"4\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#demo\" data-bs-slide-to=\"5\"></button>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <!-- The slideshow/carousel -->\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("      <img src=\"pics/0.jpg\" alt=\"Los Angeles\" class=\"d-block\" style=\"width:100%\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h3>Los Angeles</h3>\n");
      out.write("        <p>We had such a great time in LA!</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"pics/1.jpg\" alt=\"Chicago\" class=\"d-block\" style=\"width:100%\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h3>Chicago</h3>\n");
      out.write("        <p>Thank you, Chicago!</p>\n");
      out.write("      </div> \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"pics/2.jpg\" alt=\"New York\" class=\"d-block\" style=\"width:100%\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h3>New York</h3>\n");
      out.write("        <p>We love the Big Apple!</p>\n");
      out.write("      </div>  \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("        <img src=\"pics/0.jpg\" alt=\"New York\" class=\"d-block\" style=\"width:100%\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("          <h3>New York</h3>\n");
      out.write("          <p>We love the Big Apple!</p>\n");
      out.write("        </div>  \n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("      <div class=\"carousel-item\">\n");
      out.write("        <img src=\"pics/4.jpg\" alt=\"New York\" class=\"d-block\" style=\"width:100%\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("          <h3>New York</h3>\n");
      out.write("          <p>We love the Big Apple!</p>\n");
      out.write("        </div>  \n");
      out.write("      </div>\n");
      out.write("      <div class=\"carousel-item\">\n");
      out.write("        <img src=\"pics/5.jpg\" alt=\"New York\" class=\"d-block\" style=\"width:100%\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("          <h3>New York</h3>\n");
      out.write("          <p>We love the Big Apple!</p>\n");
      out.write("        </div>  \n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <!-- Left and right controls/icons -->\n");
      out.write("  <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#demo\" data-bs-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("  <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#demo\" data-bs-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container-fluid mt-3\">\n");
      out.write("  <h3>Carousel Example</h3>\n");
      out.write("  <p>The following example shows how to create a basic carousel with indicators and controls.</p>\n");
      out.write("</div>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
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
