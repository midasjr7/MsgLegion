package Frames;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Midas
 */
public class IOfile {
  
      public static void WriteadminNamefile(String adminID){
        try(BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\ProgramData\\MsgLegionadminName"),"UTF-16"))){
            writer.write(adminID);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void WriteUserfile(String username){
        try(BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\ProgramData\\MsgLegionUserName"),"UTF-16"))){
            writer.write(username);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public static void WritePassfile(String pass){
        try(BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\ProgramData\\MsgLegionPass"),"UTF-16"))){
            writer.write(pass);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String readeruserfile(){
        String line1=null;
        try(BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\ProgramData\\MsgLegionUserName"),"UTF-16"))){
            String line;
            while((line=br.readLine())!=null){
               line1=line;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return line1;
    }
       public static String readerpassfile(){
           String l = null;
        try(BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\ProgramData\\MsgLegionPass"),"UTF-16"))){
            String line;
            while((line=br.readLine())!=null){
             l=line;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }
       
          public static String readAdminIDfile(){
        String line1=null;
        try(BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\ProgramData\\MsgLegionadminName"),"UTF-16"))){
            String line;
            while((line=br.readLine())!=null){
               line1=line;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return line1;
    }
       public static void deletefilepass(){
               try
        { 
            Files.deleteIfExists(Paths.get("C:\\ProgramData\\MsgLegionPass")); 
        } 
        catch(NoSuchFileException e) 
        { 
            System.out.println("No such file/directory exists"); 
        } 
        catch(DirectoryNotEmptyException e) 
        { 
            System.out.println("Directory is not empty."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Invalid permissions."); 
        } 
          
        System.out.println("Deletion successful."); 
    } 
     public static void deletefileuser(){
               try
        { 
            Files.deleteIfExists(Paths.get("C:\\ProgramData\\MsgLegionUserName")); 
            deletefileadmin();
        } 
        catch(NoSuchFileException e) 
        { 
            System.out.println("No such file/directory exists"); 
        } 
        catch(DirectoryNotEmptyException e) 
        { 
            System.out.println("Directory is not empty."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Invalid permissions."); 
        } 
          
        System.out.println("Deletion successful."); 
    }   
     public static void deletefileadmin(){
               try
        { 
            Files.deleteIfExists(Paths.get("C:\\ProgramData\\MsgLegionadminName")); 
        } 
        catch(NoSuchFileException e) 
        { 
            System.out.println("No such file/directory exists"); 
        } 
        catch(DirectoryNotEmptyException e) 
        { 
            System.out.println("Directory is not empty."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Invalid permissions."); 
        } 
          
        System.out.println("Deletion successful."); 
    } 
       
     /*    public static void Writefile(ArrayList a){
        try(BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Midas\\Documents\\Array.txt"),"UTF-16"))){
              Iterator itr=usern.iterator();
      while(itr.hasNext()){
           Username u=(Username)itr.next();
           String k=null;
           k="\t"+u.getUsername().toString() + "\t"+u.getPassword().toString();
            writer.write(k);
      }
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    
}
