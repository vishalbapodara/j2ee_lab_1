import java.sql.*;
public class pro4 
{
	public static void main(String[] args) 
	{
        Connection conn = null;
 	    String url = "jdbc:ucanaccess://D:/j2ee/employee.accdb";
        try 
	    {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn = DriverManager.getConnection(url);

            String sql = "update emp set firstname = ? where lastname = ?";
            PreparedStatement pt = conn.prepareStatement(sql);
            
            pt.setString(1,"prakash");
            pt.setString(2,"chavda");

	        int val=pt.executeUpdate();

	        if(val>0)
	        {
                System.out.println("record updated......");
            }
            pt.close();
            conn.close();
        }  
	    catch (Exception e) 
	    {
            e.printStackTrace();
        }   
	}
}