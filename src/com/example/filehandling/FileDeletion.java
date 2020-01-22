package com.example.filehandling;

import java.io.File;

public class FileDeletion {
	public static void main(String[] args) {
		File file = new File("data.txt");
		boolean delete = file.delete();
		System.out.println("File deleted = " + delete);
	}
}
