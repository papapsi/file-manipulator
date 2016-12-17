/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanipulator;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Sai
 */
public class FileManipulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Directory searchDir;
        List<File> fileList;
        
        System.out.println("Which folder would you like to view:");
        
        try(Scanner input = new Scanner(System.in))
        {
            String folder = input.nextLine();
            searchDir = new Directory(Paths.get(folder));  //instantiate the object to the requested path.
      
            //set and print attributes
            searchDir.setFileAttributes(Files.readAttributes(searchDir.getPath(),BasicFileAttributes.class));
            searchDir.showAttributes();
            
            //listing files with the aid of a DirectoryStream
            fileList = new ArrayList<>();
            
            try(DirectoryStream<Path> dirStream = Files.newDirectoryStream(searchDir.getPath()))
            { for(Path p:dirStream){
                fileList.add(new File(p,Files.readAttributes(p, BasicFileAttributes.class)));
            }
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
            
            searchDir.setFiles(fileList);
            searchDir.listDirectory(); //list the directory kaboom!
            
        }
        catch(NoSuchFileException ex)
        {
            System.out.println("The specified path doesn't exist!"); 
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
         
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        

    }
    
}
