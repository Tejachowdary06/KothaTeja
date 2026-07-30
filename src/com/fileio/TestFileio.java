package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileio {

	public static void main(String[] args) throws IOException {
		System.out.println("Main Method Started");

//		we cannot create object for file class
//		If we want to create object we have several options
//		1)File(File parent, String child)
//		2)File(String pathname)
//		3)File(String parent, String child)
//		4)File(URI uri)
//		compiler is checking that there will be a chance to occur exception so throws IOException to ignore them

		File t = new File("C:\\Users\\tejak\\Downloads\\Test\\Teja1.txt");
//		Atomically creates a new, empty file named by this abstract pathname 
//		if and only if a file with this name does not yet exist.
		boolean status = t.createNewFile();

		if (status) {
			System.out.println("file is created successfully");
		} else {
			System.out.println("the file is already exist");
		}
		System.out.println("Main Method Ended ");
	}
}