import java.io.IOException;
import java.util.Date;

public class Servlet extends javax.servlet.http.HttpServlet {
    private static final String VUE = "/WEB-INF/index.jsp";
    private static final String VUEX= "/WEB-INF/indexo.jsp";
    private Calculator calculator= new Calculator();
    private Double resultat;
    private java.util.Date heure= new Date();
    private double nombre1, nombre2;
    private String operation="",number1="", number2="", resultatCompl="";
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

         operation= request.getParameter("operation");
        number1= request.getParameter("nombre1");
         number2= request.getParameter("nombre2");
        if(!number1.equals(""))
            nombre1 = Double.parseDouble(number1);
         else
             nombre1=0.0;
         if(!number2.equals(""))
             nombre2 = Double.parseDouble(number2);
         else
             nombre2=0.0;


        resultat= calculator.result(operation, nombre1,nombre2);

        if(resultat==null) {
            resultatCompl = "operation impossible";
        }else {
            resultatCompl = String.valueOf(resultat);
        }
        request.setAttribute("heure", heure);
       request.setAttribute("operation", operation);
       request.setAttribute("resultatCompl",resultatCompl);
       request.setAttribute("nombre1", nombre1);
        request.setAttribute("nombre2", nombre2);
        this.getServletContext().getRequestDispatcher( VUEX ).forward( request, response );
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setAttribute("heure", heure);
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
}
