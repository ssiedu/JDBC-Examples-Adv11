
import java.sql.Connection;
import java.sql.Statement;

public class DDLDemo {
    public static void main(String args[]) throws Exception{
        //using this java code we are going to
        //create a table
        Connection con=Data.connect();
        String sql="create table dummy (col1 char, col2 char)";
        Statement stmt=con.createStatement();
        int n=stmt.executeUpdate(sql);
        con.close();
        System.out.println("Table Created Successfully");
    }
}
