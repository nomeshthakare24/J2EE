package com.jspiders.filehandling.programs;

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo1 {
	
	public static void main(String[] args) {
		
		File file = new File("Demo.txt");
		
		try {
			file.createNewFile();
			System.out.println("File Created Successfully!");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File not created!");
		}	
	}
}
