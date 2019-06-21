import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowData {

    public static void main(String[] args) throws Exception {
        //We are fetching the details of emp earning
        //more than or equals 70000.
        Connection con=Data.connect();
        String sql="SELECT * FROM emp";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        //cursor is on beforeFirst pos
        
        while(true){
            boolean b=rs.next();
            if(b==false)break;
            
            int s1=rs.getInt("eno");
            String s2=rs.getString("ename");
            int s3=rs.getInt("sal");
            //calculate bonus for emp i.e. 5% of sal
            int bonus=s3*5/100;
            
            //String s1=rs.getString(1);
            //String s2=rs.getString(2);
            //String s3=rs.getString(3);
            
            System.out.println(s1+","+s2+","+s3+","+bonus);
            
        }
        
        
        
        
        
        /*
        //now read the data from ResultSet object
        
        //step-1 move the cursor to desired row (the row you wish to read)
        
            rs.next();//move the cursor to first row from B.First
            
        
        //step-2 call getter method to read the desired column.

        String s1=rs.getString(1);//reading the 1st col of current row
        String s2=rs.getString(2);//reading the 2nd col
        String s3=rs.getString(3);//reading the 3rd col
        System.out.println(s1+","+s2+","+s3);
        
        rs.next();  //move the cursor to 2nd row

        s1=rs.getString(1);//1st col of curr. row (2)
        s2=rs.getString(2);//2nd col of curr. row
        s3=rs.getString(3);//3rd col of curr. row
        System.out.println(s1+","+s2+","+s3);
        
        rs.next();  //move the cursor to 3rd row

        s1=rs.getString(1);//1st col of curr. row (3)
        s2=rs.getString(2);//2nd col of curr. row
        s3=rs.getString(3);//3rd col of curr. row
        System.out.println(s1+","+s2+","+s3);
        */
        con.close();
    }

}
