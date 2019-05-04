/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.Cookie;

/**
 *
 * @author Даниил
 */
@WebServlet(urlPatterns = {"/CountServlet"})
public class CountServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            String forward = "mainPage.jsp";
            
            int fromA = Integer.parseInt(request.getParameter("fromA"));
            int fromB = Integer.parseInt(request.getParameter("fromB"));
            int fromC = Integer.parseInt(request.getParameter("fromC"));
            int fromD = Integer.parseInt(request.getParameter("fromD"));

            int toA = Integer.parseInt(request.getParameter("toA"));
            int toB = Integer.parseInt(request.getParameter("toB"));
            int toC = Integer.parseInt(request.getParameter("toC"));
            int toD = Integer.parseInt(request.getParameter("toD"));
            
            int stepA = Integer.parseInt(request.getParameter("stepA"));
            int stepB = Integer.parseInt(request.getParameter("stepB"));
            int stepC = Integer.parseInt(request.getParameter("stepC"));
            int stepD = Integer.parseInt(request.getParameter("stepD"));
            
            addCoockie(response, "fromA", fromA);
            addCoockie(response, "toA", toA);
            addCoockie(response, "stepA", stepA);
            
            addCoockie(response, "fromB", fromB);
            addCoockie(response, "toB", toB);
            addCoockie(response, "stepB", stepB);
            
            addCoockie(response, "fromC", fromC);
            addCoockie(response, "toC", toC);
            addCoockie(response, "stepC", stepC);
            
            addCoockie(response, "fromD", fromD);
            addCoockie(response, "toD", toD);
            //response = addCoockie(response, "stepD", stepD);
            Cookie c1 = new Cookie("stepD", String.valueOf(stepD));
            c1.setMaxAge(60*60*24); 
            response.addCookie(c1);
            
            
            ArrayList<Iteration> result = new ArrayList<>();
                        
            if (fromC >= 0) {
                for (int a = fromA; a <= toA; a += stepA) {
                    for (int b = fromB; b <= toB; b += stepB) {
                        for (int c = fromC; c <= toC; c += stepC) {
                            for (int d = fromD; d <= toD; d += stepD) {
                                result.add(new Iteration(a, b, c, d, calculateResult(a, b, c, d)));
                            }
                        }
                    }
                }
            } else {

            }
            request.getSession().setAttribute("Result", result);
            response.sendRedirect(forward);
        }
    }

    public double calculateResult(int a, int b, int c, int d) {
        return Math.pow(2 * Math.sin(a) + Math.cos(Math.abs(b * Math.pow(c, 0.5))), d);
    }
    
    public void addCoockie(HttpServletResponse response, String name, int value)
    {
            Cookie c = new Cookie(name, String.valueOf(value));
            c.setMaxAge(60*60*24); 
            response.addCookie(c);
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
