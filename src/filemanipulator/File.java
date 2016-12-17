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
public class File extends FileSystem {
    
    public File(Path filePath)
    {
        super(filePath);
    }
     
    public File(Path filePath, BasicFileAttributes bFA)
    {
        super(filePath,bFA);
    }
    
    
}
