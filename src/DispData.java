
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DispData {
 public static void main(String[] args) throws Exception {
        Connection con=Data.connect();
        String sql="SELECT eno,ename,sal,sal*.15 FROM emp";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        
        while(true){
            boolean b=rs.next();
            if(b==false)break;
            String s1=rs.getString(1);
            String s2=rs.getString(2);
            String s3=rs.getString(3);
            String s4=rs.getString(4);
            System.out.println(s1+","+s2+","+s3+","+s4);
            
        }
        con.close();
    }
    
}
