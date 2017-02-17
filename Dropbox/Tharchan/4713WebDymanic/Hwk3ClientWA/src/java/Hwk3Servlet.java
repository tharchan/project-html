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
import serverpackage.Hwk3ServerWS_Service;

/**
 *
 * @author Class
 */
@WebServlet(urlPatterns = {"/Hwk3Servlet"})
public class Hwk3Servlet extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Hwk3ServerWA/Hwk3ServerWS.wsdl")
    private Hwk3ServerWS_Service service;

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
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        try
        {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calculation of Sales Amount</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Hwk3Servlet at " + request.getContextPath() + "</h1>");
            
            //reading the inputs from the HTML form
            double inputpurchaseamount = Double.parseDouble(request.getParameter("purchaseamt"));
            String inputstate = request.getParameter("statelist");
            
            //ready to invoke the server's operation
            out.println(hwk3ServerOp(inputpurchaseamount, inputstate));
            
            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception err)
        {
            out.println("Service error: " + err);
            //Due to error redirecting back to the index page
            //response.sendRedirect("http://localhost:8080/Hwk3ClientWA");
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

    private String hwk3ServerOp(double salesamount, java.lang.String inputstate) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        serverpackage.Hwk3ServerWS port = service.getHwk3ServerWSPort();
        return port.hwk3ServerOp(salesamount, inputstate);
    }

    

}
