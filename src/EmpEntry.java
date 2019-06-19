import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpEntry {
    public static void main(String[] args) {
            //when we run this program
            //one record should  be entered in emp table.
        try {            
            //step-1 (Loading JDBC Driver)
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver-Loaded-Successfully");
            //step-2 (Connection Establishment)
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyzdata", "root", "root");
            System.out.println("Connected Successfully");
            
            //step-3 (Draft your SQL)
            String sql="insert into emp values(113,'ccc',30000)";
            
            //step-4 (Send your SQL to DB)
            //using Statement or PreparedStatement object
            
            Statement stmt=con.createStatement();
            int n=stmt.executeUpdate(sql);
            
            //step-5 (close the connection)
            con.close();
            System.out.println("Row Affected : "+n);
            System.out.println("Operation Success");
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        
        
        
        
    }
}
