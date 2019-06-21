import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetInsertion {
 public static void main(String[] args) throws Exception {
        Connection con = Data.connect();
        String sql = "SELECT * FROM emp";
        Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
        }
        System.out.println("Adding A New Row : ");
        //add an empty row
        rs.moveToInsertRow();
        //modify the values 
        rs.updateInt("eno", 116);
        rs.updateString("ename", "FFF");
        rs.updateInt("sal", 95000);
        //save the row to database
        rs.insertRow();
        System.out.println("ROW ADDED");
        rs.beforeFirst();
        while (rs.next()) {
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
        }
        con.close();
    }    
}
