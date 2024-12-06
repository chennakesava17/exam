package redhat.redhat;

import java.sql.*;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )throws Exception
    {
      String url="jdbc:mysql://localhost:3306/klu";
        String uname="root";
        String pass ="admin";
        Connection con= DriverManager.getConnection(url,uname,pass);
       
        
        PreparedStatement ps = con.prepareStatement("insert into student values(?,?)");
        ps.setInt(1,4);
        ps.setString(2,"babu");
        ps.execute();
        System.out.println("Inserted............");
       
        
        /* PreparedStatement ps = con.prepareStatement("update student set name= ? where rollno=?");
        ps.setString(1,"Srinu");
        ps.setInt(2,4);
        ps.execute();
        System.out.println("Updated............");
        */
        
        /*PreparedStatement ps = con.prepareStatement("delete from student where rollno=?");
        ps.setInt(1,4);
        ps.execute();
        System.out.println("deleted............");
       */
        
    
    }
}