import java.io.IOException;

public class Servlet extends javax.servlet.http.HttpServlet {
    private static final String VUE = "/WEB-INF/index.jsp";
    boolean a=false;


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
       Calculator calculator = new Calculator();
       a=true;
       String nombre1= request.getParameter("nombre1");
       String nombre2= request.getParameter("nombre2");


       request.setAttribute("nombre1", nombre1);
        request.setAttribute("nombre2", nombre2);
        request.setAttribute("a", a);
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        a=false;
        request.setAttribute("a", a);
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
}
