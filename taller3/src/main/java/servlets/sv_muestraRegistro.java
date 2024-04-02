
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import umariana.taller3.Alumno;

@WebServlet(name = "sv_muestraRegistro", urlPatterns = {"/sv_muestraRegistro"})
public class sv_muestraRegistro extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                try {

        int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        double promedio = Double.parseDouble(request.getParameter("promedio"));
        Alumno miAlumno = new Alumno(id, nombre, apellido, promedio);

       
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet muestraRegistro</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet muestraRegistro</h1>");
        out.println(miAlumno.getId() + "<br>");
        out.println(miAlumno.getNombre() + "<br>");
        out.println(miAlumno.getApellido() + "<br>");
        out.println(miAlumno.getPromedio() + "<br>");
        out.println("</body>");
        out.println("</html>");
    } finally{
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
