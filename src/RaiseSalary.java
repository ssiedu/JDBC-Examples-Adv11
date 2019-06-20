
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class RaiseSalary {
    public static void main(String[] args) throws Exception {
        //take two inputs
        //eno whose salary is to be raised
        //amount by which the salary to be raise
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Eno  : ");
        int eno=sc.nextInt();
        System.out.println("Enter Amount : ");
        int amount=sc.nextInt();
        String sql="update emp set sal=sal+? where eno=?";
        
        Connection con=Data.connect();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,amount);
        ps.setInt(2, eno);
        int n=ps.executeUpdate();
        if(n==0){
            System.out.println("Wrong ECode");
        }else{
            System.out.println(n+" row modified");
        }
        con.close();
        
    }
}
