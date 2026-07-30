package com.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employe implements Serializable {
	
	private static final long serialVersionUID = 27367268362863871L;
	String username = "teja";
	transient String password = "chowdary";
	int age = 21;
	transient long phone = 906304743l;
}

public class EmployeeSerilization1 {

	public static void main(String[] args) throws IOException {

		System.out.println("Serilization is 1 called");

		Employe em = new Employe();

		FileOutputStream fos = new FileOutputStream("C:\\Users\\tejak\\Downloads\\Test\\java123.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(em);
		oos.close();
		fos.close();

		System.out.println("Serilization is 2 called");
	}

}
