/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author edgar
 */
@WebServlet(name = "OtroServlet", urlPatterns = {"/OtroServlet"})
public class OtroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String sexo = request.getParameter("sexo");
        String movie = request.getParameter("movie");
        response.setContentType("text/html;charset=UTF8");
        PrintWriter out = response.getWriter();
        out.println("<DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>OTROSERVLET</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>OTRO SERVLET</h1>");
        out.println("<br>"+"El usuario es: "+ usuario+"<br>");
        out.println("<br>"+"La contraseña es: "+ password+"<br>");
        out.println("<br>"+"Sexo: "+ sexo);
        out.println(" <div>DO POST</div>");
        out.println("</body>");
        out.println("</html>");
    }

}
