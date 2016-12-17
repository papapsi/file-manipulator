/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanipulator;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 *
 * @author Sai
 */
public class Directory extends FileSystem {
    
    
    private boolean isDirectory;
    private List<File> files;

    public Directory(Path dirPath)
    {
        super(dirPath);
    }
    /**
     * @return the isDirectory
     */
    public boolean isIsDirectory() {
        return isDirectory;
    }

    /**
     * @param isDirectory the isDirectory to set
     */
    public void setIsDirectory(boolean isDirectory) {
        this.isDirectory = isDirectory;
    }

    /**
     * @return the files
     */
    public List<File> getFiles() {
        return files;
    }

    /**
     * @param files the files to set
     */
    public void setFiles(List<File> files) {
        this.files = files;
    }
    
    public void listDirectory()
    {
         System.out.println("Here is the directory listing for: "+this.getPath().toString());
         System.out.println("===========================================");
         
        for(File f:files){
            System.out.format("%s | Created: %s | Last Modified: %s | Last Accessed: %s | Size: %s | \n",
                    f.getPath().getFileName().toString(),f.getFileAttributes().creationTime(),
                    f.getFileAttributes().lastModifiedTime(), f.getFileAttributes().lastAccessTime(),
                    f.getFileAttributes().size());
 
        }
    }
    
    
}
