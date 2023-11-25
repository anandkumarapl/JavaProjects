package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import database.alltask;
import java.sql.PreparedStatement;

public final class AllQuestions_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("de\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <center>\n");
      out.write("    <title>show</title>\n");
      out.write("            <style>\n");
      out.write("            div {\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("            label {\n");
      out.write("                display: inline-block;\n");
      out.write("                width: 150px;\n");
      out.write("                text-align: right;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Quiz</h1>\n");
      out.write("          ");

            String check = request.getParameter("check");
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }
            String QNO = "", QUESTION = "", OPTION1 = "", OPTION2 = "", OPTION3="",OPTION4="",CORRECTOPTION="",Result = "";
            System.out.println(ispostback);
            PreparedStatement Ps=database.DbConnect.connect().prepareStatement("select*from quiz order by qno");
            
      out.write("\n");
      out.write("            <form method=\"post\">\n");
      out.write("            ");
      out.print(Result);
      out.write("\n");
      out.write("            <input type=\"hidden\"  name=\"check\" value=\"1\"><br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("             <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3\"></div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("\n");
      out.write("                <div class=\"form-floating mb-3\">\n");
      out.write("                 \n");
      out.write("                </div>\n");
      out.write("             <div class=\"form-floating mb-3\">\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("             <div class=\"form-floating mb-3\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("              <div class=\"form-floating mb-3\">\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("                 ");
      out.print(alltask.getQuiz());
      out.write("\n");
      out.write("            </body>\n");
      out.write("        </form>\n");
      out.write("</center>\n");
      out.write("        </html>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
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
