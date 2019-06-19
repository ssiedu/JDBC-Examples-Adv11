
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;



public class DataEntry {
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ECode :  ");
        int ecode=sc.nextInt();
        System.out.println("Enter Ename :  ");
        String ename=sc.next();
        System.out.println("Enter Salary : ");
        int salary=sc.nextInt();
        
        String sql="insert into emp values(?,?,?)";
        
        Connection con=Data.connect();
        
        //creating PreparedStatement object.
        //to send parameterized sql to DB
        PreparedStatement ps=con.prepareStatement(sql);
        //set the values for all parameters in sql
        ps.setInt(1, ecode);
        ps.setString(2, ename);
        ps.setInt(3, salary);
        //sending Sql to DB
        int n=ps.executeUpdate();//send the sql to DB
        
        System.out.println(n+" row affected");
        con.close();
    }
}
