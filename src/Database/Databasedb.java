/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;




import static Frames.IOfile.readAdminIDfile;
import static Frames.SendAll.setCust;
import java.math.BigInteger;
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
public class Databasedb {
 //ArrayList<dbList> no= new ArrayList<>();
   static ArrayList<dbList> no=new ArrayList<>();
    /**
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public void Stat() throws SQLException, ClassNotFoundException {
        
      // Class.forName("com.mysql.cj.jdbc.Driver");
        
        try(Connection con=DriverManager.getConnection(Connectivity.Connectivity.url+Connectivity.Connectivity.DatabaseName, Connectivity.Connectivity.useername, Connectivity.Connectivity.password);
                Statement stmt= con.createStatement();){
            db(stmt);
            con.close();
        }catch(SQLException e){
        }
        
    }

    private static void db(Statement stmt)throws SQLException {
        String query=Connectivity.SelectQ.Qcust+readAdminIDfile();
        ResultSet rs= stmt.executeQuery(query);
      
        while(rs.next()){
            BigInteger b=new BigInteger(rs.getString("custNumber"));
            
            String name=rs.getString("custName");
            Long noo= b.longValue();
            String id=rs.getString("custID");
            
            // System.out.println("Name: "+name+"\tNumber: "+noo+"\tid: "+id);
             dbList d=new dbList(name,noo,id);
            no.add(d);
            
       }
        setCust(no);
    }
   
  /*      Iterator itr=no.iterator();  
  while(itr.hasNext()){
      dbList d= (dbList)itr.next();
   System.out.println("Name: "+d.getName()+"\tNumber: "+d.getNo()+"\tid: "+d.getId());  
  }  
    }
    */

}