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
import serverpackage.Hwk4ServerWS_Service;

/**
 *
 * @author Class
 */
@WebServlet(urlPatterns = {"/Hwk4Servlet"})
public class Hwk4Servlet extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Hwk4ServerWA/Hwk4ServerWS.wsdl")
    private Hwk4ServerWS_Service service;

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
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Hwk4Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Hwk4Servlet at " + request.getContextPath() + "</h1>");
            
            //reading inputs from the HTML form
            double inputnumber1 = Double.parseDouble(request.getParameter("number1TxtBx"));
            double inputnumber2 = Double.parseDouble(request.getParameter("number2TxtBx"));
            String inputmathop = request.getParameter("rb");
            
            out.println(hwk4ServerOp(inputnumber1, inputnumber2, inputmathop));
            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception e)
        {
            out.println("Error: " + e);
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

    private String hwk4ServerOp(double number1, double number2, java.lang.String operationsign) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        serverpackage.Hwk4ServerWS port = service.getHwk4ServerWSPort();
        return port.hwk4ServerOp(number1, number2, operationsign);
    }

    

    

}
