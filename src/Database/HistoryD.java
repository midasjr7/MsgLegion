/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import static Frames.IOfile.readAdminIDfile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Midas
 */
public class HistoryD {
static ArrayList<History> histo=new ArrayList<>();
    
   public void conectSelect() throws ClassNotFoundException{
        //Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con=DriverManager.getConnection(Connectivity.Connectivity.url+Connectivity.Connectivity.DatabaseName, Connectivity.Connectivity.useername, Connectivity.Connectivity.password);
                Statement stmt=con.createStatement();){
            Q(stmt);
            con.close();
        }catch(SQLException e){
        }
    }

    private static void Q(Statement stmt) throws SQLException {
        String query=Connectivity.SelectQ.Qhistory+readAdminIDfile();
        ResultSet rs=stmt.executeQuery(query);
        while(rs.next()){
            String msg=rs.getString("msgbody");
            int adm=rs.getInt("adminID");
            String date=rs.getString("date");
            //Writehist(msg,date);
            History h=new History(msg,adm,date);
            histo.add(h);
           }
//        HistoryS S=new HistoryS();
//        S.setHList(histo);
    }
    
    public void clearHistory(){
        histo.removeAll(histo);
    }
}
