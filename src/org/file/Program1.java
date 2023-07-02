package org.file;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Program1 {
public static void main(String[] args) throws IOException {
	//NOTE: Create a new file 
	//write the file with some 10 lines of text.
    File f = new File("C:\\Users\\harsi\\OneDrive\\Desktop\\FileOperation");
    boolean s= f.mkdir();
    System.out.println(s);
    File f1 = new File("C:\\Users\\harsi\\OneDrive\\Desktop\\FileOperation\\write.txt");
    boolean s1= f1.createNewFile();
    System.out.println(s1);
    FileUtils.write(f1," QUESTIONS(Theory) \n 1. What is mean by File? In which package it is available? \n 2.What are the methods avaiable in File? \n 3. While creating a file if you not mention the format then under which format it will save the File? \n 4.What are the difference between append and updating the file? \n 5. How to compare paths of two files? \n 6. How to create a new file? \n 7. how to get last modified date of a file? \n 8. How to create a file in a specified directory? \n 9. How to check a file exist or not? \n 10. How to make a file read-only? ", false);
    List<String> readlines = FileUtils.readLines(f1);
    System.out.println(readlines);
    System.out.println("done");
}

}

