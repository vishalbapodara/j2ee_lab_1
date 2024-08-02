import java.sql.*;
class pro3
{
    public static void main(String[] args)
    {
        Connection conn = null;
        Statement stmt = null;
        String url = "jdbc:ucanaccess://D:/j2ee/employee.accdb";

        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();

            String sql = "select * from emp where empno > 2";
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