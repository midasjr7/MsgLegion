/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Frames.IOfile;
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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Midas
 */
public class IOHistory {
     public static void Writehist(String msg,String date){
        try(BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\ProgramData\\MsgLegionHistory"),"UTF-16"))){
            writer.write(msg);
            writer.newLine();
            WriteHistD(date);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
      public static void WriteHistD(String date){
        try(BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\ProgramData\\MsgLegionHdate"),"UTF-16"))){
            writer.write(date);
            writer.newLine();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IOfile.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      public static String readerHistfile(){
        String line1=null;
        try(BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\ProgramData\\MsgLegionHistory"),"UTF-16"))){
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
      public static String readerHistDfile(){
        String line1=null;
        try(BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\ProgramData\\MsgLegionHdate"),"UTF-16"))){
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
         public static void deletefilehist(){
               try
        { 
            Files.deleteIfExists(Paths.get("C:\\ProgramData\\MsgLegionHistory")); 
            Files.deleteIfExists(Paths.get("C:\\ProgramData\\MsgLegionHdate"));
          
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
}
