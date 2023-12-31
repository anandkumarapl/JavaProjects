package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import databasepackage.DbConnect;
import java.sql.PreparedStatement;

public final class inserttask_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    \n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\n");
      out.write("  ");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("     <a class=\"navbar-brand\" href=\"#\">Booking App</a>\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Home</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDarkDropdown\" aria-controls=\"navbarNavDarkDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNavDarkDropdown\">\n");
      out.write("      <ul class=\"navbar-nav\">\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("            Booking Start\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu dropdown-menu-dark\">\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"bookingstart.jsp\"> Start Booking</a></li>\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"validation.jsp\">validation</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("    ");

        String check = request.getParameter("check");
        boolean ispostback;
        if (check == null) {
            ispostback = false;
        } else {
            ispostback = true;
        }
        String serialno = "", task = "", description = "", status = "", taskdate = "", Result = "";
        System.out.println(ispostback);

        if (ispostback) {
            try {

                task = request.getParameter("task");
                description = request.getParameter("description");
                status = request.getParameter("status");
                taskdate = request.getParameter("taskdate");
                out.println(taskdate);
                taskdate = taskdate.replace("T", "-");
                PreparedStatement ps = DbConnect.connect().prepareStatement("insert into todo values(todoseq.nextval ,?,?,?,to_date(?,'yyyy-mm-dd-hh24:mi'))");
                ps.setString(1, serialno);
                ps.setString(1, task);
                ps.setString(2, description);
                ps.setString(3, status);
                ps.setString(4, taskdate);
                int n = ps.executeUpdate();
                Result = "Inserted " + " records";
                response.sendRedirect("inserttask.jsp");
            } catch (Exception ex) {
                System.out.println(ex);
                Result = ex.getMessage();
            }
        }

    
      out.write("\n");
      out.write("<center>\n");
      out.write("    <h1>Todo</h1>\n");
      out.write("    <form method=\"post\">\n");
      out.write("        <h3>");
      out.print(Result);
      out.write("</h3>\n");
      out.write("        <input type=\"hidden\"  name=\"check\" value=\"1\"><br>\n");
      out.write("        <div class=\"container col-md-3\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\"></div>\n");
      out.write("                <div class=\"col-md-6\"></div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\">Task</label>\n");
      out.write("                    <input required name=\"task\" type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"task\" value=\"");
      out.print(task);
      out.write("\">\n");
      out.write("                    <div class=\"valid-feedback\"></div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                    <div class=\"form-floating mb-3\">\n");
      out.write("                        <input required name=\"description\" type=\"text\" class=\"form-control\" id=\"floatingInput\" placeholder=\"name@example.com\"");
      out.print(description);
      out.write(">\n");
      out.write("                        <label for=\"floatingInput\">description</label>\n");
      out.write("                        <div class=\"valid-feedback\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-floating mb-3\">\n");
      out.write("                        <input required name=\"status\" type=\"text\" class=\"form-control\" id=\"floatingInput\" placeholder=\"name@example.com\"");
      out.print(status);
      out.write(">\n");
      out.write("                        <label for=\"floatingInput\">status</label>\n");
      out.write("                        <div class=\"valid-feedback\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-floating mb-3\">\n");
      out.write("                        <input required name=\"taskdate\" type=\"datetime-local\" class=\"form-control\" id=\"floatingInput\" placeholder=\"name@example.com\"");
      out.print(taskdate);
      out.write(">\n");
      out.write("                        <label for=\"floatingInput\">taskdate</label>\n");
      out.write("                        <div class=\"valid-feedback\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                    <input class=\"btn btn-primary\" type=\"submit\">\n");
      out.write("                    <input class=\"btn btn-danger\" type=\"submit\" value=\"clear\">\n");
      out.write("                    </div>\n");
      out.write("                   </form>\n");
      out.write("                </body>\n");
      out.write("                </html>\n");
      out.write("                </center>\n");
      out.write("                    ");
      out.write(" <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
