package com.fileio;

import java.io.File;

public class ForDeleteMethod {

	public static void main(String[] args) {
		System.out.println("main method started");

		File t = new File("C:\\Users\\tejak\\Downloads\\Test\\Teja1.txt");
		boolean del = t.delete();
		
		if (del) {
			System.out.println("deleted successfully");
		} else {
			System.out.println("not deleted");
		}
		System.out.println("Mian Method Ended");

	}
}
