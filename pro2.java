import java.sql.*;
class pro2
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

            String sql = "select * from emp";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next())
            {
                String fnm = rs.getString(2);
                String lnm = rs.getString(3);
                String des = rs.getString(4);

                System.out.println("FName : " + fnm);
                System.out.println("LName : " + lnm);
                System.out.println("Desig : " + des);
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
