package database;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SouvikPRAT
 */
public class DBconnection {
Connection con=null;
public Connection connect(){
try
{    
    Class.forName("com.mysql.jdbc.Driver");  
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
}
catch(Exception e)
    {e.printStackTrace();}
return con;
  }
}