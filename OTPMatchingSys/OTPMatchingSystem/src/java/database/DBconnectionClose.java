/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SouvikPRAT
 */
package database;
import java.sql.*;
public class DBconnectionClose{
    public void close(Connection con)
    {
        try{
        con.close();
        }catch(SQLException e)
        {e.printStackTrace();}
    }
    
}
