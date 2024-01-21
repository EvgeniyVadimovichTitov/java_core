package org.example;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    //task_1 - full backup (with directory)
    public static void backupDirectory(File file){
        File into = new File(".\\backup");
        try{FileUtils.copyDirectory(file,into);}
        catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
    //task_1
        backupDirectory(new File("C:\\Users\\Евгений Титов\\Desktop\\програмирование учеба\\java_core\\java_core_end"));
    //task_2
        byte [] ar = new byte [] {27,3,3};
        try (FileOutputStream fos = new FileOutputStream(".\\test.txt");){
            fos.write(ar);

            FileUtils.writeByteArrayToFile(new File("test2.txt"), ar);
        } catch (IOException e) {
            e.getMessage();
        }

        try {
            Files.write(Paths.get(".\\test3.txt"), ar);
        }
        catch (IOException e){
            e.getMessage();
        }
        File f1= new File(".\\test.txt");
        File f2= new File("test2.txt");
        File f3= new File("test3.txt");
        System.out.println(f1.length()+" "+f2.length()+" "+f3.length());
    }
}