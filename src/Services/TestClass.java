
package Services;

import Beans.UserBean;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
public class TestClass 
{
    public static void main(String [] args)
    {
    /*Set<UserBean> emp=UserMaintainceServices.getAllEmployees();
				Iterator<UserBean> itr=emp.iterator();
				while(itr.hasNext())
				{
				System.out.println(itr.next());
				}
                                try
                                {
                                    UserBean emp1=new UserBean();
                                    InputStreamReader isr=new InputStreamReader(System.in);
                                    BufferedReader br=new BufferedReader(isr);
                                    System.out.print("Enter User-Id,User-Name,Password,User-Type,name,email,contact,address,userstatus");
                                    emp1.setUserid(Integer.parseInt(br.readLine()));
                                    emp1.setUsername(br.readLine());
                                    emp1.setPassword(br.readLine());
                                    emp1.setUserType(br.readLine());
                                    emp1.setName(br.readLine());
                                    emp1.setEmail(br.readLine());
                                    emp1.setContact(br.readLine());
                                    emp1.setAddress(br.readLine());
                                    emp1.setUserstatus(true);
                                    if(UserMaintainceServices.addEmployee(emp1))
                                    {
					System.out.println(emp1);
                                    }
                                    else
                                    {
					System.out.println("Record not inserted ");
                                    }
                                }
                                catch(Exception e)
                                {
                                System.out.println("Exception in main()"+e.getMessage());
                                }*/
                                 try
                                {
                                    UserBean emp1=new UserBean();
                                    InputStreamReader isr=new InputStreamReader(System.in);
                                    BufferedReader br=new BufferedReader(isr);

                                                System.out.print("Enter id");
						int id=Integer.parseInt(br.readLine());
						UserBean emp2=UserMaintainceServices.searchById(id);
						if(emp2==null)
								System.out.println("Record not found ");
						    	else
							{
								System.out.println(emp2);
								System.out.print("Enter Email");
								emp2.setEmail(br.readLine());
								System.out.print("Enter Contact");
								emp2.setContact(br.readLine());
                                                                System.out.print("Enter Address");
                                                                emp2.setAddress(br.readLine());
								if(UserMaintainceServices.updateEmployee(emp2))
									System.out.print("Record Updated");
								else
									System.out.print("Record not Updated");
							}
                                }
                                 catch(Exception e)
                                {
                                System.out.println("Exception in main()"+e.getMessage());
                                }
                                }
}
    
