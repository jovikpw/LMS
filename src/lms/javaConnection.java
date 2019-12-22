/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

/**
 *
 * @author User
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaConnection {
   Connection conn;
   
   public static Connection ConnectDb(){
       try{
           Class.forName("org.sqlite.JDBC");
           Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\User\\Documents\\NetBeansProjects\\LMS\\LMS.sqlite");
            return conn;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
            return null;
       }
   }
}
