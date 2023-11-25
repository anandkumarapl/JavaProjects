package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public final class SearchByQuestionNo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Insert</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        div{\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        body{\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        ");

            String check = request.getParameter("check");
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }
            String QUESTION = "", OPTION1 = "", OPTION2 = "", OPTION3 = "", OPTION4 = "", CORRECTOPTION = "", Result = "";
            int QNO=1;
            int count=0;
            System.out.println(ispostback);
            if (ispostback) {
                try {
//                    QNO = request.getParameter("QNO");
                    QNO = Integer.parseInt(request.getParameter("QNO"));     
                    PreparedStatement ps = database.DbConnect.connect().prepareStatement("SELECT * FROM quiz WHERE QNO = ?");
                   ps.setInt(1, QNO);
                   QNO++;
                    ResultSet rs = ps.executeQuery();                  
                    if (rs.next()) {
                        QUESTION = "" + rs.getObject("QUESTION");
                        OPTION1 = "" + rs.getObject("OPTION1");
                        OPTION2 = "" + rs.getObject("OPTION2");
                        OPTION3 = "" + rs.getObject("OPTION3");
                        OPTION4 = "" + rs.getObject("OPTION4");
                        CORRECTOPTION = "" + rs.getObject("CORRECTOPTION");
                        
                        int n = ps.executeUpdate();
                        Result = "records" + "Founded";
                        
                          
                    } else {
                        Result = "Not Founded";
                    }
                    
                } catch (Exception ex) {
                    System.out.println(ex);
                    Result = ex.getMessage();
                }
            }
        
      out.write("\n");
      out.write("        <h1>Quiz</h1>\n");
      out.write("        <form method=\"post\">\n");
      out.write("            ");
      out.print(Result);
      out.write("\n");
      out.write("            <input type=\"hidden\"  name=\"check\" value=\"1\"><br>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-2\"></div>\n");
      out.write("                    <div class=\"col-8\"><input  name=\"QNO\"  value=\"");
      out.print(QNO);
      out.write("\"  type=\"text\" class=\"form-control\" id=\"floatingInput\" placeholder=\"QNO\"</input>                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-2\"></div>                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-2\"></div>\n");
      out.write("                        <div class=\"col-8\"><h1> ");
      out.print(QUESTION);
      out.write("</h1>                        \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-2\"></div>                    \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <table width='100%' border='1'>\n");
      out.write("                                <tr><td class=\"form-control\"><label class=\"form-control form-check-label\">");
      out.print(OPTION1);
      out.write("<input class=\"form-check-input\" type=\"radio\" name=\"option\" value=\"a\"></label></td><td class=\"form-control\"><label class=\"form-control form-check-label\">");
      out.print(OPTION2);
      out.write("<input type=\"radio\" name=\"option\" value=\"b\"></label></td></tr>\n");
      out.write("                                <tr><td class=\"form-control\"><label class=\"form-control form-check-label\">");
      out.print(OPTION3);
      out.write("<input type=\"radio\" name=\"option\" value=\"c\"></label></td><td class=\"form-control\"><label class=\"form-control for\">");
      out.print(OPTION4);
      out.write("<input type=\"radio\" name=\"option\" value=\"d\"></label></td></tr>\n");
      out.write("\n");
      out.write("                            </table>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                                <button class=\"btn btn-primary\" type=\"submit\">Lock </button></form>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
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
