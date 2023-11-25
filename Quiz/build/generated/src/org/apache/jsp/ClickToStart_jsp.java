package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public final class ClickToStart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>KBC </title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            background-image: url('Images/1.jpg');\n");
      out.write("        }\n");
      out.write("        div{\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            font-family: arial, sans-serif;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            width: 100%;\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        td{\n");
      out.write("            border: 1px solid #dddddd;\n");
      out.write("            text-align: left;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 17px;\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("            border: 1px solid #dddddd;\n");
      out.write("            text-align: left;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 15px;\n");
      out.write("        }\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("            background-color: gray;\n");
      out.write("        }\n");
      out.write("        tr:nth-child(odd) {\n");
      out.write("            background-color: goldenrod;\n");
      out.write("        }\n");
      out.write("        .trs {\n");
      out.write("            background-color: mistyrose;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .Question{\n");
      out.write("            background-color: blueviolet;\n");
      out.write("            text-align: center;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            border: solid black;\n");
      out.write("        }\n");
      out.write("        .Question:hover{\n");
      out.write("            Question-radius: 100px;\n");
      out.write("            box-shadow: 2px 2px 2px 2px red;\n");
      out.write("            transition: 5ms;\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .option{\n");
      out.write("            background-color: lightcyan;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px; \n");
      out.write("            border: solid black;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .button{\n");
      out.write("            background-color: lightgray;\n");
      out.write("            padding: 10px;\n");
      out.write("            border-radius: 10px; \n");
      out.write("            border: solid black;\n");
      out.write("        }\n");
      out.write("        .button:hover{\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .KaunBanegaCrorepati{\n");
      out.write("            text-align: center;\n");
      out.write("            background-color: red;\n");
      out.write("            border-radius: 40px;\n");
      out.write("            height:  110%;\n");
      out.write("            border: solid black;\n");
      out.write("        }\n");
      out.write("        .KaunBanegaCrorepati:hover{\n");
      out.write("            KaunBanegaCrorepati-radius: 100px;\n");
      out.write("            box-shadow: 2px 2px 2px 2px blue;\n");
      out.write("            transition: 5ms;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .rightwrong{\n");
      out.write("            text-align: center;\n");
      out.write("            background-color: yellow;\n");
      out.write("            border-radius: 4000px;\n");
      out.write("            border: solid black;\n");
      out.write("        }\n");
      out.write("        .timer{\n");
      out.write("            text-align: center;\n");
      out.write("            background-color: yellowgreen;\n");
      out.write("            border-radius: 100px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            String style = "style='display:none;'";
            int QNO = 1;
            String prize[] = {"You Won = 0", "You Won = 0", "You Won =00", "You Won = 1000", "You Won = 5000", "You Won = 6000", "You Won = 7000"};
            int count = 0;

            if (session.getAttribute("count") != null) {
                count = Integer.parseInt("" + session.getAttribute("count"));
            }

            String result = "";
            String prizes = "";
            String check = request.getParameter("check");
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
                
                response.sendRedirect("Quiz2.jsp");
            }

            String QUESTION = "", OPTION1 = "", OPTION2 = "", OPTION3 = "", OPTION4 = "", CORRECTOPTION = "1", Result = "";

            System.out.println(ispostback);
            if (ispostback) {
                style = "style='display:block;'";
                out.println("Here");
                try {

                    int option = Integer.parseInt(request.getParameter("option"));
                    int answer = Integer.parseInt(request.getParameter("answer"));
                    if (option == -1) {

                    } else {
                        if (option == answer) {
                            result = "Correct ";
                            count++;
                        } else {
                            result = "Wrong";
                            response.sendRedirect("gameover.html");
                            //count--;
                        }
                    }
                    session.setAttribute("count", count);
                    QNO = Integer.parseInt(request.getParameter("QNO"));
                    if (QNO >3) {
                        result = "Quiz OVER" + count;
                        response.sendRedirect("gameover.html");
                    }
                    PreparedStatement ps = database.DbConnect.connect().prepareStatement("SELECT * FROM quiz WHERE QNO = ?");
                    ps.setInt(1, QNO);
                    QNO++;
                    prizes = prize[QNO];
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        QUESTION = "" + rs.getObject("QUESTION");

                        Result = "";

                    } else {
                        Result = "";
                    }

                } catch (Exception ex) {
                    System.out.println(ex);
                    Result = ex.getMessage();
                }
            }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-2\"></div>\n");
      out.write("            <div class=\"col-8\">\n");
      out.write("                <div class=\"KaunBanegaCrorepati\">\n");
      out.write("                    <h1>Kaun Banega Crorepati</h1>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-2\"></div>\n");
      out.write("        </div>\n");
      out.write("        <form method=\"post\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <input  name=\"QNO\"  value=\"");
      out.print(QNO);
      out.write("\"  type=\"hidden\" class=\"form-control\" id=\"floatingInput\" placeholder=\"QNO\"</input>\n");
      out.write("            <br>\n");
      out.write("           \n");
      out.write("            <input type=\"hidden\" name=\"answer\" value=\"");
      out.print(CORRECTOPTION);
      out.write("\">\n");
      out.write("            <h1> ");
      out.print(Result);
      out.write("</h1>\n");
      out.write("            <input type=\"hidden\"  name=\"check\" value=\"1\"><br>\n");
      out.write("           \n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <input checked style=\"display:none\" required class=\"form-check-input\"    type=\"radio\" name=\"option\" value=\"-1\">\n");
      out.write("                <div class=\"col-8\"> \n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div>\n");
      out.write("                        <div class=\"button\"><button  class=\"btn btn-primary form-control padding \" type=\"Start\" id\n");
      out.write("                                                     =\"oooo\">Click To Start </button><br><br>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-4\">                       \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
