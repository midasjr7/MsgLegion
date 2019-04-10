/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Midas
 */
public class CREATE {
    public static void crt(String name,Long number,String num) throws SQLException, ClassNotFoundException{
       /// Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con =DriverManager.getConnection(Connectivity.Connectivity.url+Connectivity.Connectivity.DatabaseName, Connectivity.Connectivity.useername, Connectivity.Connectivity.password);
                Statement stmt=con.createStatement();){
            
            String query=Connectivity.InsertQ.insCust+"'"+name+"'"+","+number+","+num+")";
            stmt.executeUpdate(query);
            con.close();
        }
    }
    
}
