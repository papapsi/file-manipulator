/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanipulator;

import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author Sai
 */
public abstract class FileSystem {
    
    private Path path;
    private int fileSize;
    private String creationDate;
    private String lastModifiedDate;
    private BasicFileAttributes fileAttributes;
   
    public FileSystem(Path path, int fSize, String crDate, String lMDate)
    {
        setPath(path);
        setFileSize(fSize);
        setCreationDate(crDate);
        setLastModifiedDate(lMDate);
    }
    
    public FileSystem()
    {
        
    }
    
    public FileSystem(Path path)
    {
        setPath(path);
    }
    
    public FileSystem(Path path, BasicFileAttributes bFA){
        setPath(path);
        setFileAttributes(bFA);
    }
    /**
     * @return the path
     */
    public Path getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.setPath(path);
    }

    /**
     * @return the fileSize
     */
    public int getFileSize() {
        return fileSize;
    }

    /**
     * @param fileSize the fileSize to set
     */
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * @return the creationDate
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate the creationDate to set
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return the lastModifiedDate
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * @param lastModifiedDate the lastModifiedDate to set
     */
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * @return the fileAttributes
     */
    public BasicFileAttributes getFileAttributes() {
        return fileAttributes;
    }

    /**
     * @param fileAttributes the fileAttributes to set
     */
    public void setFileAttributes(BasicFileAttributes fileAttributes) {
        this.fileAttributes = fileAttributes;
    }

    /**
     * @param path the path to set
     */
    public void setPath(Path path) {
        this.path = path;
    }
    
    public void showAttributes()
    {
        printAttribute("Path ",this.path.toString());
        printAttribute("Is directory ",String.valueOf(getFileAttributes().isDirectory()));
        printAttribute("Creation Time ",getFileAttributes().creationTime().toString());
        printAttribute("Last modifieed ",getFileAttributes().lastModifiedTime().toString());
        printAttribute("Last accessed ",getFileAttributes().lastAccessTime().toString());
        printAttribute("Size in KB ", String.valueOf(getFileAttributes().size()));
            
    }
   
    private void printAttribute(String title, String value)
    {
        System.out.println(title+": "+value);
}
}
