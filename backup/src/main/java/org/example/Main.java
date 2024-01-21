package org.example;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main {
    //task_1
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
    }
}