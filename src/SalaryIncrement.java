
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;




public class SalaryIncrement {
    public static void main(String args[]) throws Exception {
        //when we run the program , salary of every employee
        //should be increased by 1000 Rs.
        Connection con=Data.connect();
        String sql="update emp  set sal=sal+1000";
        Statement stmt=con.createStatement();
        int n=stmt.executeUpdate(sql);
        System.out.println(n+" rows modified");
        con.close();
        
    }
}
