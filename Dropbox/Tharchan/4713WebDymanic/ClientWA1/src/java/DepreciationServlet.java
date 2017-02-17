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
import javax.xml.ws.WebServiceRef;
import serverpackage.ServerWS1_Service;

/**
 *
 * @author Class
 */
@WebServlet(urlPatterns = {"/DepreciationServlet"})
public class DepreciationServlet extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServerWA1/ServerWS1.wsdl")
    private ServerWS1_Service service;

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
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DepreciationServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DepreciationServlet at " + request.getContextPath() + "</h1>");
            
            //reading inputs from the HTML form
            double originalvalue = Double.parseDouble(request.getParameter("originalvalue"));
            double salvagevalue = Double.parseDouble(request.getParameter("salvagevalue"));
            int lifetime = Integer.parseInt(request.getParameter("lifetime"));
            
            //ready to display the operation result
            out.println(serverWO1(originalvalue, salvagevalue, lifetime));
            
            out.println("</body>");
            out.println("</html>");
        }
        catch (Exception e)
        {
            out.println("Input error: " + e);
        }
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

    private String serverWO1(double originalvalue, double salvagevalue, int lifetime) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        serverpackage.ServerWS1 port = service.getServerWS1Port();
        return port.serverWO1(originalvalue, salvagevalue, lifetime);
    }

}
