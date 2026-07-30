package com.fileio;

import java.io.File;

public class FileExistMethod {

	public static void main(String[] args) {

		System.out.println("file exist method is called");

		File t = new File("C:\\Users\\tejak\\Downloads\\Test\\Teja.txt");
		
		boolean exs = t.exists();
		if (exs) {
			System.out.println("is exist");
		} else {
			System.out.println("not exist");
		}

		System.out.println("file exist method is ended");
	}

}
