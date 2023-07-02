package org.file;

import java.io.File;

public class Program10 {
public static void main(String[] args) {
	File f = new File("C:\\Users\\harsi\\OneDrive\\Desktop");
	String[] s = f.list();
	System.out.println(s);
	for (String list : s) {
		System.out.println(list);
	}
	File[] listFiles = f.listFiles();
	for(File l : listFiles) {
		System.out.println(l);
	}
}
}
