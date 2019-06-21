
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetDeletion {
public static void main(String[] args) throws Exception {
        Connection con = Data.connect();
        String sql = "SELECT * FROM emp";
        Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
        }
        
        System.out.println("DELETING A ROW");
        //step-1 (move the cursor to the row needs to be deleted
        rs.absolute(5);//moving the cursor to row-5
        //step-2 (deleteRow)
        rs.deleteRow();
        
        System.out.println("DATA AFTER REMOVE");
        rs.beforeFirst();
        
        while (rs.next()) {
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
        }
        con.close();
    }    
}
