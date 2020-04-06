/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;

/**
 *
 * @author imrul
 */
public class FileDemo1 {
    public static void main(String[] args) {
        File dir = new File("hello");
        dir.mkdir();
        String dirlocation = dir.getAbsolutePath();
        System.out.println(dirlocation);
        System.out.println(dir.getName());
        if(dir.exists()){
            System.out.println("folder exits");
        }
        dir.delete();
        
    }
}
