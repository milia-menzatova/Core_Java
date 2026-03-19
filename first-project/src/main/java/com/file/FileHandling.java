package com.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {

       /* //Create a new file - text file
        File fileObj = new File("Test.txt");
        fileObj.createNewFile();

        */

        /* //Write some information into the file
        FileWriter writer = new FileWriter("Test.txt");
        writer.write("This is for writing information to file");
        writer.close();

         */

        /*//Read the information from the file
        // File myFile = new File("Test.txt");
        Scanner sc = new Scanner(myFile);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);

         */

        //Delete the file
        File file = new File("Test.txt");
        if(file.delete()){
            System.out.println("File is deleted");
        }
        else {
            System.out.println("File is not deleted");
        }
        }
    }

