package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;

public final class insertdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>  \n");
      out.write("        <title>Insert</title>\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\n");
      out.write(" \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            String check = request.getParameter("check");
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }
            String name = "", id = "", age = "", Result = "";
            System.out.println(ispostback);
            if (ispostback) {
                try {
                    name = request.getParameter("name");
                    id = request.getParameter("id");
                    age = request.getParameter("age");
                    PreparedStatement ps = database.DbConnect.connect().prepareStatement("insert into student values(?,?,?)");
                    ps.setString(1, name);
                    ps.setString(2, id);
                    ps.setString(3, age);
                    int n = ps.executeUpdate();
                    Result = "Inserted " + " records";
                } catch (Exception ex) {
                    System.out.println(ex);
                    Result = ex.getMessage();
                }
            }
        
      out.write("\n");
      out.write("        <h1>Student</h1>\n");
      out.write("        <form method=\"post\">\n");
      out.write("            ");
      out.print(Result);
      out.write("\n");
      out.write("            <input type=\"hidden\"  name=\"check\" value=\"1\"><br>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3\"></div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("\n");
      out.write("                        <div class=\"form-floating mb-3\">\n");
      out.write("                            <input required name=\"name\" type=\"text\" class=\"form-control\" id=\"floatingInput\" placeholder=");
      out.print(name);
      out.write(">\n");
      out.write("                            <label for=\"floatingInput\">name</label>\n");
      out.write("                            <div class=\"valid-feedback\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-floating mb-3\">\n");
      out.write("                            <input required name=\"id\" type=\"text\" class=\"form-control\" id=\"floatingInput\" placeholder=");
      out.print(id);
      out.write(">\n");
      out.write("                            <label for=\"floatingInput\">id</label>\n");
      out.write("                            <div class=\"valid-feedback\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-floating mb-3\">\n");
      out.write("                            <input required name=\"age\" type=\"text\" class=\"form-control\" id=\"floatingInput\" placeholder=");
      out.print(age);
      out.write(">\n");
      out.write("                            <label for=\"floatingInput\">age</label>\n");
      out.write("                            <div class=\"valid-feedback\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                    <input class=\"btn btn-primary\" type=\"submit\">\n");
      out.write("                    <input class=\"btn btn-danger\" type=\"submit\" value=\"clear\">\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\n");
      out.write("                    </body>\n");
      out.write("                    </html>\n");
      out.write("                    </center>");
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
