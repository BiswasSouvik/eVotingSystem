/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import database.*;
import otp.*;
import javax.servlet.http.HttpSession;  
/**
 *
 * @author SouvikPRAT
 */
@WebServlet(urlPatterns = {"/UserEntry"})
public class UserEntry extends HttpServlet {
        Connection con=null;
        PreparedStatement ps1=null;
        RequestDispatcher rd=null;
        String firstname,lastname,name,emailid,phone,otpnumber;
        HttpSession session=null;
        int i=0;
        
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
        response.setContentType("text/html;charset=UTF-8");
        DBconnection db=new DBconnection();
        con=db.connect();
        phone=request.getParameter("mobile");
        System.out.println(phone);
        /*OtpSeeding otp=new OtpSeeding();
        otpnumber=otp.send(phone);
        try{
            
            System.out.println("<script>alert('enter valid Username');</script>");
            
            firstname=request.getParameter("firstname");
            lastname=request.getParameter("lastname");
            emailid=request.getParameter("emailid");
           
            name=firstname+" "+lastname;
            System.out.println("hello");
            ps1=con.prepareStatement("insert into entry (name,email,mobile,otp) values(?,?,?,?)"); 
            ps1.setString(1,name);
            ps1.setString(2,emailid);
            ps1.setString(3,phone);
            ps1.setString(4,otpnumber);
            i=ps1.executeUpdate();
            System.out.println(i);
            DBconnectionClose dbc=new DBconnectionClose();
            dbc.close(con);
            session=request.getSession();  
            session.setAttribute("name",name);  
            request.setAttribute("key",name);
                rd=request.getRequestDispatcher("otpmatch.html");
                rd.forward(request, response);
        
        }catch(Exception e){System.err.println(e);}*/
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
