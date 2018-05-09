package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**@author edgar */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String sexo = request.getParameter("sexo");
        String[] results = request.getParameterValues("movie");
        for (String result : results) {
            System.out.println(result);
        }
        response.setContentType("text/html;charset=UTF8");
        PrintWriter out = response.getWriter();
        out.println("<DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>NEWSERVLET</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>HOLA SERVLET</h1>");
        out.println("<br>"+"El usuario es: "+ usuario+"<br>");
        out.println("<br>"+"La contraseña es: "+ password);
        out.println("<br>"+"Sexo: "+ sexo);
        out.println("<br>"+"Sus peliculas favoritas incluyen: "+ Arrays.toString(results));
        out.println("<div>DO POST</div>");
        out.println("</body>");
        out.println("</html>");
}
}
