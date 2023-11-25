package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public final class Quiz3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        .t1{\n");
      out.write("            background-color: red;\n");
      out.write("        }\n");
      out.write("        .prize{\n");
      out.write("                background-color: lightgreen;\n");
      out.write("            }\n");
      out.write("            .noprize{\n");
      out.write("                background-color: lightblue;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            String prize[] = {"You Won =0","You Won =0","You Won =0", "You Won =1000","You Won =2000","You Won =3000","You Won =5000","You Won =10000","You Won =20000","You Won =40000","You Won =80000","You Won =1600000","You Won =3200000","You Won =6400000","You Won =1250000","You Won =2500000","You Won =5000000","You Won =10000000","You Won =70000000"};

            int QNO = 1;
            int count = 2;
            String prizes = "";
            String pri="";
            if (session.getAttribute("count") != null) {
                count = Integer.parseInt("" + session.getAttribute("count"));
            }
            String QUESTION = "", OPTION1 = "", OPTION2 = "", OPTION3 = "", OPTION4 = "", CORRECTOPTION = "", Result = "";

            String result = "";
                try{
                    
                if (request.getParameter("QNO") == null) {
                    QNO = 1;
                } else {
                    QNO = Integer.parseInt(request.getParameter("QNO"));
                }
                
                PreparedStatement ps = database.DbConnect.connect().prepareStatement("SELECT * FROM quiz WHERE QNO = ?");
                ps.setInt(1, QNO);
                QNO++;
                prizes = prize[QNO];
                pri=prize[count];
                
                 if (QNO > 5) {
                   session.setAttribute("prize",prizes);
                   response.sendRedirect("gameover.jsp");
                }
                
                
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {

                    QUESTION = "" + rs.getObject("QUESTION");
                    OPTION1 = "" + rs.getObject("OPTION1");
                    OPTION2 = "" + rs.getObject("OPTION2");
                    OPTION3 = "" + rs.getObject("OPTION3");
                    OPTION4 = "" + rs.getObject("OPTION4");
                    CORRECTOPTION = "" + rs.getObject("CORRECTOPTION");

//                        int n = ps.executeUpdate();
                    Result = "";

                } else {
                    Result = "";
                }
}
                catch(Exception ex){
                        System.out.println(ex);
                        }

            try {
               
                int option = Integer.parseInt(request.getParameter("option"));
                int answer = Integer.parseInt(request.getParameter("answer"));
                if (option == answer) {
                    result = "Correct ";
                    count++;
                } else {
                    result = "Wrong";
                     session.setAttribute("prize",pri);
                    response.sendRedirect("gameover.jsp");
                    //count--;
                }
                 session.setAttribute("count", count);
            } catch (Exception ex) {
                System.out.print(ex);

            }
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            var message = new SpeechSynthesisUtterance(\"Options\");\n");
      out.write("            document.addEventListener('DOMContentLoaded', function () {\n");
      out.write("                // Check if the browser supports the Web Speech API\n");
      out.write("                if ('speechSynthesis' in window) {\n");
      out.write("                    // Create a new SpeechSynthesisUtterance\n");
      out.write("             var message = new SpeechSynthesisUtterance(\"");
      out.print(QUESTION);
      out.write(",Options");
      out.print(OPTION1);
      out.write(',');
      out.print(OPTION2);
      out.write(',');
      out.print(OPTION3);
      out.write(',');
      out.print(OPTION4);
      out.write("\");\n");
      out.write("\n");
      out.write("                                // Set voice options (optional)\n");
      out.write("                                message.voice = speechSynthesis.getVoices()[0]; // You can choose a specific voice\n");
      out.write("                                message.rate = 1; // Speed of speech (0.1 to 10)\n");
      out.write("                                message.pitch = 1; // Pitch of speech (0 to 2)\n");
      out.write("\n");
      out.write("                                var speakButton = document.getElementById('speakButton');\n");
      out.write("\n");
      out.write("       //        speakButton.addEventListener('click', function () {\n");
      out.write("       //          // Speak the text when the button is clicked\n");
      out.write("       //          window.speechSynthesis.speak(message);\n");
      out.write("       //        });\n");
      out.write("\n");
      out.write("                                speakButton.addEventListener('click', function () {\n");
      out.write("                                    // Speak the text when the button is clicked\n");
      out.write("                                    window.speechSynthesis.speak(message);\n");
      out.write("                                });\n");
      out.write("                            } else {\n");
      out.write("                                console.error('Speech synthesis is not supported in this browser.');\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("                        function amitabh() {\n");
      out.write("                     var message = new SpeechSynthesisUtterance(\"");
      out.print(QUESTION);
      out.write(",Options");
      out.print(OPTION1);
      out.write(',');
      out.print(OPTION2);
      out.write(',');
      out.print(OPTION3);
      out.write(',');
      out.print(OPTION4);
      out.write("\");\n");
      out.write("                                    message.voice = speechSynthesis.getVoices()[0]; // You can choose a specific voice\n");
      out.write("                                    message.rate = 1; // Speed of speech (0.1 to 10)\n");
      out.write("                                    message.pitch = 1; // Pitch of speech (0 to 2)\n");
      out.write("                                    window.speechSynthesis.speak(message);\n");
      out.write("                                    console.log(\"Done\")\n");
      out.write("                                }\n");
      out.write("                                window.onload(amitabh());\n");
      out.write("                                      amitabh();\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"timer\">\n");
      out.write("            <div id=\"some_div\" >\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            var timeLeft = 30;\n");
      out.write("            var elem = document.getElementById('some_div');\n");
      out.write("\n");
      out.write("            var timerId = setInterval(countdown, 1000);\n");
      out.write("\n");
      out.write("            function countdown() {\n");
      out.write("                if (timeLeft == -1) {\n");
      out.write("                    clearTimeout(timerId);\n");
      out.write("                } else {\n");
      out.write("                    elem.innerHTML = timeLeft + ' seconds remaining';\n");
      out.write("                    timeLeft--;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("         <div class=\"row\">\n");
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
      out.write("            <input  name=\"QNO\"  value=\"");
      out.print(QNO);
      out.write("\"  type=\"hidden\" class=\"form-control\" id=\"floatingInput\" placeholder=\"QNO\"</input>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-4\"></div>\n");
      out.write("                <div class=\"col-4\"> <div class=\"rightwrong\"> <h2>");
      out.print(result);
      out.write("</h2><h2>");
      out.print(prizes);
      out.write("</h2></div></div>\n");
      out.write("                <div class=\"col-4\"></div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <input type=\"hidden\" name=\"answer\" value=\"");
      out.print(CORRECTOPTION);
      out.write("\">\n");
      out.write("            <h1> ");
      out.print(Result);
      out.write("</h1>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"Question\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("\n");
      out.write("                        <h1>");
      out.print(QUESTION);
      out.write("</h1> \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("                        <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-8\"> <div class=\"option\"><table width='100%' border='2'>\n");
      out.write("                            <tr><td><label class=\"form-control form-check-label\"><div class=\"trs\">");
      out.print(OPTION1);
      out.write("\n");
      out.write("                                            <input required class=\"form-check-input\" type=\"radio\" name=\"option\" value=\"1\"></label></div></td>\n");
      out.write("\n");
      out.write("                                <td><label class=\"form-control form-check-label\"><div class=\"trs\">");
      out.print(OPTION2);
      out.write("<input  class=\"form-check-input\" required type=\"radio\" name=\"option\" value=\"2\"></label></div></td></tr>\n");
      out.write("                            <tr><td><label class=\"form-control form-check-label\"><div class=\"trs\">");
      out.print(OPTION3);
      out.write("\n");
      out.write("                                            <input  class=\"form-check-input\" required type=\"radio\" name=\"option\" value=\"3\"></label></div></td>\n");
      out.write("                                <td><label class=\"form-control for\"><div class=\"trs\">");
      out.print(OPTION4);
      out.write("\n");
      out.write("                                            <input required type=\"radio\"  class=\"form-check-input\" name=\"option\" value=\"4\"></label></div></td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div>\n");
      out.write("                        <div class=\"button\"><button  class=\"btn btn-primary form-control padding \" type=\"submit\" id\n");
      out.write("                                                     =\"oooo\">Lock </button><br><br>\n");
      out.write("                            <button id\n");
      out.write("                                    =\"speakButton\"   class=\"padding btn btn-success form-control\"  type=\"button\" class=\"\">Speak</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-4\">  \n");
      out.write("                     \n");
      out.write("        ");
 
            int[] prz={1000,2000,3000,5000,10000,20000,40000,80000,1600000,3200000,6400000,1250000,2500000,5000000,10000000,70000000};
          
            for (int i = 15; i >= 0; i--) {

                if (i == QNO-2) {
        
      out.write("\n");
      out.write("\n");
      out.write("        <h1  class=\"prize\">Prize ");
      out.print(prz[i]);
      out.write("\n");
      out.write("            \n");
      out.write("        </h1>\n");
      out.write("                \n");
      out.write("        ");

        } else {
        
      out.write("\n");
      out.write("        <h1 class=\"noprize\">Prize ");
      out.print(prz[i]);
      out.write("</h1>\n");
      out.write("\n");
      out.write("        ");

            
                }
            }
        
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-4\">                      \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("                                            \n");
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
