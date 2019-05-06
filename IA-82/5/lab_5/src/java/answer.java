/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(urlPatterns = {"/answer"})
public class answer extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String aParam = request.getParameter("a");
            String bParam = request.getParameter("b");
            String cParam = request.getParameter("c");
            String dParam = request.getParameter("d");
            
              if( (aParam.equals("") || bParam.equals("")|| cParam.equals("")|| dParam.equals(""))){             
                out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>error</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align=\"center\">Enter parametr</h1>");
            out.println("</body>");
            out.println("</html>");        }      
            
         
            else{
            
            try{
                Double.parseDouble(aParam);
                Double.parseDouble(bParam);
                Double.parseDouble(cParam);
                Double.parseDouble(dParam);
            }
            catch(NumberFormatException e){
                out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>error</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align=\"center\">you can not enter letters</h1>");
            out.println("</body>");
            out.println("</html>"); 
                
            }
             double a = Double.parseDouble(aParam);
             double b = Double.parseDouble(bParam);
             double c = Double.parseDouble(cParam);
             double d = Double.parseDouble(dParam);
             double result = 2*Math.cbrt((Math.sin(a)/Math.tan(Math.abs(b-a)))+Math.log(c)/d);
            /* TODO output your page here. You may use following sample code. */
            if( result<0){
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet answer</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Wrong parametrs</h1>");
                out.println("</body>");
                out.println("</html>");
            }
            else{
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet answer</title>");            
            out.println("</head>");
            out.println("<body background=\"C:\\Users\\User\\Pictures\\tt.jpg\">");
            out.println("<h1> Result is " + result + "</h1>");
            out.println("</body>");
            out.println("</html>");
           
            }
            
            
        }
    }

    }// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
