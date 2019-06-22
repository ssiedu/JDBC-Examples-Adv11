
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class BelowAvgList {
    public static void main(String args[]) throws Exception {
        Connection con=Data.connect();
       
        String sql="SELECT * FROM emp WHERE sal<(SELECT AVG(SAL) from emp)";
        
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        
        while(rs.next()){
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
        }
        
        
        con.close();
    }
}
