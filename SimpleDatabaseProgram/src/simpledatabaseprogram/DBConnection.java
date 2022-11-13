
package simpledatabaseprogram;

import java.sql.*;
import javax.swing.*;

public class DBConnection {
      static Connection connect;
       static String status;
   
  public static void setConnection()
  {
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
          connect = DriverManager.getConnection("jdbc:mysql://localhost/library_system", "cole", "binibini");
        JOptionPane.showMessageDialog(null, "Succesfully Connected!");
      }catch(Exception e)
     {
        JOptionPane.showMessageDialog(null, "Connection Failed");
         e.printStackTrace();
          
      }
  }
    public static Connection getConnection()
    {
      
        return connect;
    }
    
     public static String getStatusConnection(){
        if(connect!=null){
           status = "Database Connectivity : Successfully Connected";
        }
        else{
             status = "Database Connectivity: Connection Failed";
        }
        return status;
        
    }

    
}
