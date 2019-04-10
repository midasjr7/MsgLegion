/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author Midas
 */
public class StaticHistory {
    
    private static Long number;
    private static String msg;
  

  

    public static Long getNumber() {
        return number;
    }

    public static void setNumber(Long number) {
        StaticHistory.number = number;
    }

    public static String getMsg() {
        return msg;
    }

    public static void setMsg(String msg) {
        StaticHistory.msg = msg;
    }

  
    StaticHistory(Long num,String msg,String admin){
        setNumber(num);
        setMsg(msg);
       
    }
   public StaticHistory(Long num,String msg){
        setNumber(num);
        setMsg(msg);
    }

}
