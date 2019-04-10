package Database;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Midas
 */
public final class History {
    private  Long num;
    private String messagebody;
    private int admin;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public  String getMessagebody() {
        return messagebody;
    }

    public  void setMessagebody(String messagebody) {
        this.messagebody = messagebody;
    }

    public Long getNum() {
        return num;
    }

    public  void setNum(Long num) {
        this.num = num;
    }

    public  int getAdmin() {
        return admin;
    }
    public void setAdmin(int adminu){
        this.admin=adminu;
    }
     History(){
          setNum(num);
        setMessagebody(messagebody);
        setAdmin(admin);
     }
    
     History(Long num,String msg){
       // setCustName(CustName);
        setNum(num);
        setMessagebody(msg);
       }
    History(String msg,int adminu,String date){
        setMessagebody(msg);
        setAdmin(adminu);
        setDate(date);
    }
    
}
