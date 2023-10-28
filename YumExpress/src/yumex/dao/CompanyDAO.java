/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumex.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import yumex.dbutil.DBConnection;

/**
 *
 * @author HP
 */
public class CompanyDAO {
    public static String getNewId() throws SQLException{
      Connection conn=DBConnection.getConnection();
      Statement st=conn.createStatement();
      ResultSet rs=st.executeQuery("Slect max(company_id) from companies");
      rs.next();
      String id=rs.getString(1);
      String compId="";
      if(id!=null){
      id=id.substring(4);
       compId ="CMP"+(Integer.parseInt(id)+1);
      }
      else{
          compId="CMP-101";
      }
      return compId;
    }
    public static void main(String[] args) {
        
    }
}
