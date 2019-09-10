import java.io.IOException;

public class Servlet extends javax.servlet.http.HttpServlet {
    private static final String NOMBRE1
    private static final String VUE = "/WEB-INF/index.jsp";


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
       Calculator calculator = new Calculator();
       Int nombre1= request.getParameter(nombre1);
       Int nombre2= request.getParameter(nombre2);


       request.setAttribute(NOMBRE1, nombre1);
        request.setAttribute(NOMBRE2, nombre2);
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
}
