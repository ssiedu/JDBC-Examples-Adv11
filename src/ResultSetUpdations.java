
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetUpdations {

    public static void main(String[] args) throws Exception {
        Connection con = Data.connect();
        String sql = "SELECT * FROM emp";
        //Statement stmt = con.createStatement();
        Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
        }
        
        //to modify 3rd row
        //move your cursor to row-3
        rs.absolute(3);
        //call the updatter method to modify the col
        rs.updateInt("sal", 75000);
        //save the changes to database
        rs.updateRow();
        System.out.println("UPDATION COMPLETED");
        
        rs.beforeFirst();
        while (rs.next()) {
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
        }
        
        con.close();
    }
}
