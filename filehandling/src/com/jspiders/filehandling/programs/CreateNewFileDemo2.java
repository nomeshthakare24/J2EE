package com.jspiders.filehandling.programs;

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo2 {
	
	
public static void main(String[] args) {
	

		
		File file = new File("C:\\Users\\nomes\\OneDrive\\Desktop\\Qspider\\J2EE\\"
				+ "filehandling\\Demo.txt");
		
		if(file.exists()) {
			System.out.println("File Already Exists!");
		}
		else {
		
		try {
			file.createNewFile();
			System.out.println("File Created Successfully!");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File not created!");
		}	
	}
}
}
