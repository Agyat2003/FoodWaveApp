/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumex.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class DBConnection {
     private static Connection conn;
    static{
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","yumexpress","foodie");
            JOptionPane.showMessageDialog(null,"Connected Successfully");
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Connection Failed");
            ex.printStackTrace();
            System.exit(0);
        }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void closeConnection(){
        try{
            conn.close();
        }
        catch(SQLException ex){
           JOptionPane.showMessageDialog(null," cannot close the Connection!");
            ex.printStackTrace();
        }
    
}
    
}
