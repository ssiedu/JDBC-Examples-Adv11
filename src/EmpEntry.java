
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


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
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        
        
        
        
    }
}
