
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CursorMovement {
     public static void main(String[] args) throws Exception {
        Connection con=Data.connect();
        String sql="SELECT * FROM emp";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        
        while(rs.next()){
        String s1=rs.getString(1);
        System.out.println(s1);
        }
        //afterLast
        rs.beforeFirst();
        while(rs.next()){
        String s2=rs.getString(2);
        System.out.println(s2);
        }
        rs.beforeFirst();
        while(rs.next()){
        String s3=rs.getString(3);
        System.out.println(s3);
        }
        //afterLast
        
        rs.absolute(4);
        
        System.out.println(rs.getString(1));
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        rs.next();//2nd
        s1=rs.getString(1);
        s2=rs.getString(2);
        s3=rs.getString(3);
        System.out.println(s1+","+s2+","+s3);
        //rs.next();//rd
        rs.previous();//1st
        s1=rs.getString(1);
        s2=rs.getString(2);
        s3=rs.getString(3);
        System.out.println(s1+","+s2+","+s3);
        */
        
        con.close();
        }
}
