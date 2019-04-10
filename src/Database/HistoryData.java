/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import static Frames.IOfile.readAdminIDfile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Midas
 */

public class HistoryData {
   
    public static void connectInsert() throws ClassNotFoundException{
      //  Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con=DriverManager.getConnection(Connectivity.Connectivity.url+Connectivity.Connectivity.DatabaseName, Connectivity.Connectivity.useername, Connectivity.Connectivity.password);
                Statement stmt=con.createStatement();){
            Q(stmt);
            con.close();
        }catch(SQLException e){
        }
    }

    private static void Q(Statement stmt) throws SQLException {
     
        String query=Connectivity.InsertQ.insHist+"'"+StaticHistory.getMsg()+"'"+","+readAdminIDfile()+","+"curdate()"+")";
        stmt.executeUpdate(query);
    }
 
}
