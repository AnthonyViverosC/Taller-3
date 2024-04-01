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

@WebServlet(name = "sv_recibeDatos", urlPatterns = {"/sv_recibeDatos"})
public class sv_recibeDatos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             try{
        int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        double promedio = Double.parseDouble(request.getParameter("promedio"));
        Alumno alumno = new Alumno(id, nombre, apellido, promedio); 
        
        request.setAttribute("atribAlumn", alumno);
        request.getRequestDispatcher("muestraDatos.jsp").forward(request, response);
    }finally{
            out.close();
        }
      
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
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