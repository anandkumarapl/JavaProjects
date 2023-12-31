package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import database.Message;
import database.Utilities;
import java.sql.ResultSet;
import database.DbConnect;
import java.sql.PreparedStatement;

public final class searchmessage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <center><title>Search</title>\n");
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
            String sno = "", message = "", msgfrom = "", msgto = "",result = "";
            System.out.println(ispostback);
            if (ispostback) {
                try {
                    
                    msgfrom = request.getParameter("msgfrom");
                    
                    PreparedStatement ps = DbConnect.connect().prepareStatement("select * from message where msgfrom=?");
                    ps.setString(1, msgfrom);
              
                    ResultSet rs = ps.executeQuery();
                    if(!rs.next())
                    {
                        result = "MsgFrom " + msgfrom + " not found";
                                              response.sendRedirect("insertmessage.jsp");

                    }
                    else
                    {
                        
                        msgto="" + rs.getObject("msgto");
                        result = "Record Found ";
                    }
                    
                } catch (Exception ex) {
                    System.out.println(ex);
                      response.sendRedirect("insertmessage.jsp");
                    result = ex.getMessage();
                }
            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h1>Messages</h1>\n");
      out.write("        <form>\n");
      out.write("            <h3>");
      out.print(result);
      out.write("</h3>\n");
      out.write("            <form>\n");
      out.write("            <input type=\"hidden\" name=\"check\" value=\"2\">\n");
      out.write("           msgfrom.<input value=\"");
      out.print(msgfrom);
      out.write("\" name=\"msgfrom\" type=\"text\">\n");
      out.write("            msgto<input value=\"");
      out.print(msgto);
      out.write("\" name=\"msgto\" type=\"text\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"Search\"/>\n");
      out.write("            </form>\n");
      out.write("          \n");
      out.write("    </body>\n");
      out.write("</form>\n");
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
