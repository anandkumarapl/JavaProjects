package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>Text to Speech</title>\n");
      out.write("  <link rel=\"icon\" type=\"image/x-icon\" href=\"https://3.bp.blogspot.com/-py5FbTZgvjo/YDi1bsQq16I/AAAAAAAACB0/BxejbJBcHA4AVfkB33WYC3YlVmxElM7BwCK4BGAYYCw/s1600/Varanasi%2BSoftware%2BJunction%2BPhone%2BLogo.png\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <h1>Text to Speech Example</h1>\n");
      out.write("  <p>Click the button below to hear a text-to-speech message:</p>\n");
      out.write("  <button id\n");
      out.write("          =\"speakButton\">Speak</button>\n");
      out.write("          \n");
      out.write("          ");

          String messege="hello anand pal";
          
      out.write("\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("    document.addEventListener('DOMContentLoaded', function () {\n");
      out.write("      // Check if the browser supports the Web Speech API\n");
      out.write("      if ('speechSynthesis' in window) {\n");
      out.write("        // Create a new SpeechSynthesisUtterance\n");
      out.write("        var message = new SpeechSynthesisUtterance(\"");
      out.print(messege);
      out.write("\");\n");
      out.write("\n");
      out.write("        // Set voice options (optional)\n");
      out.write("        message.voice = speechSynthesis.getVoices()[0]; // You can choose a specific voice\n");
      out.write("        message.rate = 1; // Speed of speech (0.1 to 10)\n");
      out.write("        message.pitch = 1; // Pitch of speech (0 to 2)\n");
      out.write("\n");
      out.write("        var speakButton = document.getElementById('speakButton');\n");
      out.write("\n");
      out.write("        speakButton.addEventListener('click', function () {\n");
      out.write("          // Speak the text when the button is clicked\n");
      out.write("          window.speechSynthesis.speak(message);\n");
      out.write("        });\n");
      out.write("      } else {\n");
      out.write("        console.error('Speech synthesis is not supported in this browser.');\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("</body>\n");
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
