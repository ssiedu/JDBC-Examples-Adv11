import java.sql.Connection;


public class DatabaseMetaDataExample {
    public static void main(String[] args) throws Exception {

        Connection con=Data.connect();
        //obtaining the information about Database
        java.sql.DatabaseMetaData dbmd=con.getMetaData();
        
        String s1=dbmd.getDatabaseProductName();
        String s2=dbmd.getDatabaseProductVersion();
        String s3=dbmd.getDriverName();
        String s4=dbmd.getDriverVersion();
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        
        con.close();
    }
}
