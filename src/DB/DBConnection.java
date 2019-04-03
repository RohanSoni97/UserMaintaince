/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author User1
 */
import java.sql.*;
public class DBConnection {
    public static Connection connect()
    {
        Connection con=null;
        
        try
	{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/usermaster","root","");
	
        }
        catch(Exception e)
	{
	System.out.println("Exception in DBConnection"+e.getMessage());
	}
	return con;
    }
}