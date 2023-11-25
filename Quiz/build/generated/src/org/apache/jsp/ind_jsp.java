package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public final class ind_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Bootstrap demo</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9\" crossorigin=\"anonymous\">\n");
      out.write("  </head>\n");
      out.write("  <Style>\n");
      out.write("      div{\n");
      out.write("          \n");
      out.write("      }\n");
      out.write("      body{\n");
      out.write("          background-color: blueviolet;\n");
      out.write("          text-align:center;\n");
      out.write("          \n");
      out.write("      }\n");
      out.write("      button{\n");
      out.write("          background-color: red;\n");
      out.write("      }\n");
      out.write("      </Style>\n");
      out.write("      \n");
      out.write("  <body>\n");
      out.write("       ");

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
                try{           
                    PreparedStatement ps = database.DbConnect.connect().prepareStatement("SELECT * FROM quiz WHERE QNO = 1");
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        QUESTION  = "" + rs.getObject("QUESTION");
                        OPTION1 = "" + rs.getObject("OPTION1");
                        OPTION2 = "" + rs.getObject("OPTION2");
                         OPTION3 = "" + rs.getObject("OPTION3");
                          OPTION4 = "" + rs.getObject("OPTION4");
                          CORRECTOPTION = "" + rs.getObject("CORRECTOPTION");
                           int n = ps.executeUpdate();
                             Result ="records"+"Founded";
                    }
                             else{
                                  Result="Not Founded";   
                                     }
//                    response.sendRedirect("InsertQuestion.jsp");
                
            }catch(Exception ex){
                System.out.println(ex);
                    Result = ex.getMessage();
                    }
            }
        
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    <h1>Quiz App</h1>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-1\"><img src=\"Images/logo1.jpg\"></div>\n");
      out.write("            <div class=\"col-1\"><img src=\"Images/logo4.jpg\"></div>\n");
      out.write("            <div class=\"col-8\"></div>\n");
      out.write("            <div class=\"col-1\"><img src=\"Images/logo2.jpg\"></div>\n");
      out.write("            <div class=\"col-1\"><img src=\"Images/logo3.jpg\"></div>\n");
      out.write("        </div> \n");
      out.write("         <div class=\"row\">\n");
      out.write("            <div class=\"col-4\"></div>\n");
      out.write("            <div class=\"col-4\"><img src=\"Images/logo.jpg\"></div>\n");
      out.write("            <div class=\"col-4\"></div>\n");
      out.write("        </div> \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-3\"></div>\n");
      out.write("            <div class=\"col-6\">What Is Your Name</div>\n");
      out.write("            <div class=\"col-3\"></div>\n");
      out.write("        </div> \n");
      out.write("       <div class=\"row\">\n");
      out.write("            <div class=\"col-2\"></div>\n");
      out.write("            <div class=\"col-4\"><input type=\"radio\">Amit</div>\n");
      out.write("            <div class=\"col-4\"><input type=\"radio\">  <input  name=\"OPTION1\" type=\"text\"  value=\"");
      out.print(OPTION1);
      out.write("\"  class=\"form-control\" id=\"floatingInput\" placeholder=\"OPTION1\"</div>\n");
      out.write("            <div class=\"col-2\"></div>\n");
      out.write("        </div> \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-2\"></div>\n");
      out.write("            <div class=\"col-4\"><input type=\"radio\">Sachin</div>\n");
      out.write("            <div class=\"col-4\"><input type=\"radio\">Karan</div>\n");
      out.write("            <div class=\"col-2\"></div>\n");
      out.write("        </div> \n");
      out.write("         <div class=\"row\">\n");
      out.write("            <div class=\"col-5\"></div>\n");
      out.write("            <div class=\"col-2\"><button type=\"button\">Submit</button></div>\n");
      out.write("            <div class=\"col-5\"></div>\n");
      out.write("        </div> \n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
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
