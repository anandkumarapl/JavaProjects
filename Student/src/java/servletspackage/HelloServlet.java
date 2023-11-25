/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletspackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lenovo
 */
public class HelloServlet extends HttpServlet {

    //Dispatcher Servlet
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        PrintWriter pw = response.getWriter();
//        pw.write("GET" + request.getRequestURI());
        String[] patterns = request.getRequestURI().split("/");
//        pw.write(Arrays.toString(patterns));
        String mypattern = patterns[2];
        if (mypattern.equals("one")) {
            one(request, response);
            return;
        }
        if (mypattern.equals("two")) {
            two(request, response);
            return;
        }

        PrintWriter pw = response.getWriter();
        pw.write("Not Found");
        pw.flush();
        pw.close();

//        pw.flush();
//        pw.close();
    }

    protected void one(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.write("One");
        pw.flush();
        pw.close();
    }

    protected void two(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.write("Two");
        pw.flush();
        pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.write("POST");
        pw.flush();
        pw.close();
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
