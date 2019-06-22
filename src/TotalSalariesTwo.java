
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TotalSalariesTwo {
      public static void main(String args[]) throws Exception {
        Connection con=Data.connect();
        String sql="select pcode,SUM(sal) from emp GROUP BY pcode";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        
        while(rs.next()){
            System.out.println(rs.getString(1)+"\t"+rs.getString(2));
        }
        con.close();
    }
}
