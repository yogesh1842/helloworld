package com.example.filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) {
		File file = new File("data.txt");
		try {
			boolean createNewFile = file.createNewFile();
			System.out.println("File created = " + createNewFile);
		} catch (IOException e) {
			System.out.println("Exception occurred");
		}
	}
}
