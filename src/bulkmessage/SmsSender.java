/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulkmessage;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
/**
 *
 * @author Midas
 */
 
public class SmsSender {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =bulkmessage.Key.accountsid;
    public static final String AUTH_TOKEN =bulkmessage.Key.authkey;

    public static boolean send(String from,String to,String msg) throws ClassNotFoundException  {
    
         try{
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        from="+91"+from;
        to=bulkmessage.Key.twiliono;
       
        Message message = Message
                .creator(new PhoneNumber(from), // to
                        new PhoneNumber(to), // from
                        msg)
                .create();
       // StaticHistory.setSid(message.getSid());
       // connectInsert();   
          System.out.println(message.getSid());}catch(com.twilio.exception.ApiException e){
             e.printStackTrace();
             return false;
         }
          return true;
      }
    
    
     public static boolean sendAll(String from,String msg) throws ClassNotFoundException  {
    
         try{
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        from="+91"+from;
       String to=bulkmessage.Key.twiliono;
       
        Message message = Message
                .creator(new PhoneNumber(from), // to
                        new PhoneNumber(to), // from
                        msg)
                .create();
      //  StaticHistory.setSid(message.getSid());
          
          System.out.println(message.getSid());}catch(com.twilio.exception.ApiException e){
             e.printStackTrace();
             return false;
         }
          return true;
      }
    

   
}
