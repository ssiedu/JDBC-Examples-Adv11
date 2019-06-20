
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class DeleteRange {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Starting Eno  : ");
        int start=sc.nextInt();
        System.out.println("Enter Last Eno : ");
        int stop=sc.nextInt();
        
        String sql="delete from emp where eno between ? and ?";
        
        Connection con=Data.connect();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,start);
        ps.setInt(2, stop);
        int n=ps.executeUpdate();
        con.close();
        System.out.println(n+" rows removed");
    }
}
