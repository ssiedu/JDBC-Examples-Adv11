
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultSetMetaDataExample {
    public static void main(String args[]) throws Exception {
        
        Connection con=Data.connect();
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("SELECT * FROM EMP");
        ResultSetMetaData rsmd=rs.getMetaData();
        
        int n=rsmd.getColumnCount();
        
        System.out.println("_________________________________________");
 
        for(int i=1; i<=n; i++){
            System.out.print(rsmd.getColumnName(i)+"\t");
        }
        System.out.println("\n_________________________________________");
        
        
        while(rs.next()){
            for(int i=1; i<=n; i++){
                System.out.print(rs.getString(i)+"\t");
            }
            System.out.println("");
        }
        System.out.println("_________________________________________");
        
        
        con.close();
    }
}
