package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import database.alltask;
import java.sql.PreparedStatement;

public final class InsertQuestion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <center>\n");
      out.write("        <title>Insert</title>\n");
      out.write("        <style>\n");
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
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String check = request.getParameter("check");
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }
            String QNO = "", QUESTION = "", OPTION1 = "", OPTION2 = "", OPTION3="",OPTION4="",CORRECTOPTION="",Result = "";
            System.out.println(ispostback);
            if (ispostback) {
                try {
                    QNO = request.getParameter("QNO");
                    QUESTION = request.getParameter("QUESTION");
                    OPTION1 = request.getParameter("OPTION1");
                    OPTION2 = request.getParameter("OPTION2");
                    OPTION3 = request.getParameter("OPTION3");
                    OPTION4 = request.getParameter("OPTION4");
                    CORRECTOPTION = request.getParameter("CORRECTOPTION");               
                    PreparedStatement ps = database.DbConnect.connect().prepareStatement("insert into quiz values(?,?,?,?,?,?,?)");
                    ps.setString(1, QNO);
                    ps.setString(2, QUESTION);
                    ps.setString(3, OPTION1);
                    ps.setString(4, OPTION2);
                    ps.setString(5, OPTION3);
                    ps.setString(6, OPTION4);
                     ps.setString(7, CORRECTOPTION);
                    int n = ps.executeUpdate();
                    Result = "Inserted " + " records";
//                    response.sendRedirect("InsertQuestion.jsp");
                } catch (Exception ex) {
                    System.out.println(ex);
                    Result = ex.getMessage();
                }
            }
        
      out.write("\n");
      out.write("<h1>Quiz</h1>\n");
      out.write("        <form method=\"post\">\n");
      out.write("           ");
      out.print(Result);
      out.write("\n");
      out.write("            <input type=\"hidden\"  name=\"check\" value=\"1\"><br>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3\"></div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-floating mb-3\">\n");
      out.write("                            <label for=\"floatingInput\">QNO</label>\n");
      out.write("                            <input required name=\"QNO\" value=\"");
      out.print(QNO);
      out.write("\" type=\"number\" class=\"form-control\" id=\"floatingInput\" placeholder=\"QNO\"");
      out.print(QNO);
      out.write("\n");
      out.write("                            \n");
      out.write("                            <div class=\"valid-feedback\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-floating mb-3\">\n");
      out.write("                            <label for=\"floatingInput\">QUESTION</label>\n");
      out.write("                            <input required name=\"QUESTION\"  value=\"");
      out.print(QUESTION);
      out.write("\"  type=\"text\" class=\"form-control\" id=\"floatingInput\" placeholder=\"QUESTION\"");
      out.print(QUESTION);
      out.write("\n");
      out.write("                            \n");
      out.write("                            <div class=\"valid-feedback\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-floating mb-3\">\n");
      out.write("                            <label for=\"floatingInput\">OPTION1</label>\n");
      out.write("                            <input required name=\"OPTION1\" type=\"text\"  value=\"");
      out.print(OPTION1);
      out.write("\"  class=\"form-control\" id=\"floatingInput\" placeholder=\"OPTION1\"");
      out.print(OPTION1);
      out.write("\n");
      out.write("                            \n");
      out.write("                            <div class=\"valid-feedback\">\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"form-floating mb-3\">\n");
      out.write("                                 <label for=\"floatingInput\">OPTION2</label>\n");
      out.write("                            <input required name=\"OPTION2\"   value=\"");
      out.print(OPTION2);
      out.write("\"   type=\"text\" class=\"form-control\" id=\"floatingInput\" placeholder=\"OPTION2\"");
      out.print(OPTION2);
      out.write("\n");
      out.write("                            \n");
      out.write("                            <div class=\"valid-feedback\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                             <div class=\"form-floating mb-3\">\n");
      out.write("                                 <label for=\"floatingInput\">OPTION3</label>\n");
      out.write("                            <input required name=\"OPTION3\" type=\"text\"  value=\"");
      out.print(OPTION3);
      out.write("\"   class=\"form-control\" id=\"floatingInput\" placeholder=\"OPTION3\"");
      out.print(OPTION3);
      out.write("\n");
      out.write("                            \n");
      out.write("                            <div class=\"valid-feedback\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                             <div class=\"form-floating mb-3\">\n");
      out.write("                                 <label for=\"floatingInput\">OPTION4</label>\n");
      out.write("                            <input required name=\"OPTION4\" type=\"text\"   value=\"");
      out.print(OPTION4);
      out.write("\"  class=\"form-control\" id=\"floatingInput\" placeholder=\"OPTION4\"");
      out.print(OPTION4);
      out.write("\n");
      out.write("                            \n");
      out.write("                            <div class=\"valid-feedback\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-floating mb-3\">\n");
      out.write("                             <label for=\"floatingInput\">CORRECT OPTION</label>\n");
      out.write("                             <input required name=\"CORRECTOPTION\"   value=\"");
      out.print(CORRECTOPTION);
      out.write("\"   type=\"number\" class=\"form-control\" id=\"floatingInput\" placeholder=\"CORRECTOPTION\"");
      out.print(CORRECTOPTION);
      out.write("\n");
      out.write("                           \n");
      out.write("                            <div class=\"valid-feedback\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <input class=\"btn btn-primary\" type=\"submit\">\n");
      out.write("                        <br>       \n");
      out.write("                        <br>\n");
      out.write("                        ");
      out.print(alltask.getQuiz());
      out.write("\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        </form>\n");
      out.write("                        </body>\n");
      out.write("                        </html>\n");
      out.write("                        </center>");
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
