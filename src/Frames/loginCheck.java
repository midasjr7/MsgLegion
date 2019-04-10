/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import static Frames.IOfile.WritePassfile;
import static Frames.IOfile.WriteUserfile;
import static Frames.IOfile.WriteadminNamefile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Midas
 */
public class loginCheck {
 //  static ArrayList<Username> usern=new ArrayList<>();
       public static void connection(String user) throws SQLException, ClassNotFoundException{
      // Class.forName("com.mysql.jdbc.Driver");
      try (Connection con = DriverManager.getConnection(Connectivity.Connectivity.url+Connectivity.Connectivity.DatabaseName, Connectivity.Connectivity.useername, Connectivity.Connectivity.password)) {
          Statement stmt=con.createStatement();
          User(stmt,user);
          con.close();
      }
     
                }
 
    private static void User(Statement stmt,String mail) throws SQLException {
        String query=Connectivity.SelectQ.Qadmin+"'"+mail+"'";
        ResultSet rs=stmt.executeQuery(query);
        while(rs.next()){
        String user=rs.getString("Email");
        String pass=rs.getString("Password");
        String Id=rs.getString("adminID");
        WriteadminNamefile(Id);
        WriteUserfile(user);
        WritePassfile(pass);
       
   }}
    
}
