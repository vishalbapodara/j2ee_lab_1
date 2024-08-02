import java.sql.*;

public class pro5 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String url = "jdbc:ucanaccess://D:/j2ee/employee.accdb";

        try {
           Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn = DriverManager.getConnection(url);

            String sql = "DELETE FROM emp WHERE Firstname = ?";
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, "lopa");

            int val = pstmt.executeUpdate();
            System.out.println(val + " record(s) deleted successfully");

            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}