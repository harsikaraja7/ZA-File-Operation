package org.file;

import java.io.File;

public class Program8 {
	public static void main(String[] args){
		File f = new File("C:\\Users\\harsi\\OneDrive\\Desktop\\java");
		boolean d =f.exists();
		System.out.println(d);
		f.mkdir();
	}
}
