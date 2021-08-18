import java.sql.*;
class Atest
 {
   public static void main(String[] args) throws ClassNotFoundException ,SQLException
     {
       Class.forName("oracle.jdbc.OracleDriver");
       Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","2425");

       Statement st=cn.createStatement();
       int f=st.executeUpdate("insert into emp values(432,'shashi')");
       
       if(f>0)
        {
          System.out.println("created");
        }
        else
          {
            System.out.println("not created");
           }
     }
  } 