/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Beans.UserBean;
import DB.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ProfileMaintainceService 
{
 public static List<UserBean> getEmployees(int currentaccount)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<UserBean> empSet=null;
		try
		{
				con=DBConnection.connect();
				pstmt=con.prepareStatement("select userid,username,usertype,name,email,contact,address,userstatus from usermaster where userid=?");
				pstmt.setInt(1,currentaccount);
                                rs=pstmt.executeQuery();
				empSet=new ArrayList<UserBean>();
				if(rs.next())
				{
					UserBean emp=new UserBean();
					emp.setUserid(rs.getInt("userid"));
					emp.setUsername(rs.getString("username"));
					//emp.setUserType(rs.getString("usertype"));
                                        emp.setName(rs.getString("name"));
                                        emp.setEmail(rs.getString("email"));
                                        emp.setContact(rs.getString("contact"));
                                        emp.setAddress(rs.getString("address"));
                                       // emp.setUserstatus(rs.getBoolean("userstatus"));
					empSet.add(emp);
				}
		}
		catch(Exception e)
		{
			System.out.println("Exception in  getEmployees()"+e);
		}
		finally		
		{
			try
			{
				pstmt.close();
				con.close();
				rs.close();
			}
			catch(Exception e)
			{
				System.out.println("Exception in finally getEmployees()"+e);
			}

		}
		
		return empSet; 
	}
   public static boolean updateEmployee(UserBean emp)
	{
		Connection con=null;
	PreparedStatement pstmt=null;
	try
	{
	con=DBConnection.connect();
	pstmt=con.prepareStatement("update usermaster set email=?,contact=?,address=? where userid=?");
	pstmt.setInt(4,emp.getUserid());
	pstmt.setString(1,emp.getEmail());
	pstmt.setString(2,emp.getContact());
        pstmt.setString(3,emp.getAddress());
	int result=pstmt.executeUpdate();
	return (result==1);
	}
	catch(Exception e)
		{
		System.out.println("Exception in updateEmployee"+e);
		}
		finally
		{
			try
			{
				pstmt.close();
				con.close();
			}
				catch(Exception e)
			{
		System.out.println("Exception in finally updateEmployee"+e);
				}

		}
		return false;

	}
}
