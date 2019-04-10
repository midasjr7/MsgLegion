/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Midas
 */
public final class dbList {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private Long no;
    private int id;

    dbList(String name,Long no, String id) {
        setName(name);
        setId(Integer.parseInt(id));
        setNo(no);//To change body of generated methods, choose Tools | Templates.
    }

   dbList(String name,Long no) {
        setName(name);
        //setId(id);
        setNo(no);//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
