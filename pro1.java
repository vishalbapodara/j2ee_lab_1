import java.sql.*;
class pro1
{
    public static void main(String[] args)
    {
        Connection conn = null;
        Statement stmt = null;
        String url = "jdbc:mysql://localhost:3306/company";

        try
        {
            //Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            conn = DriverManager.getConnection(url,"root","tnrao");
            stmt = conn.createStatement();

            String sql = "insert into emp values(5,'lopa','clerk')";
            int val = stmt.executeUpdate(sql);
            
            System.out.println(val+ "record inserted successfully");
            stmt.close();
            conn.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
