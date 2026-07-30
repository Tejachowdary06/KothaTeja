package com.fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class EmployeeDeSerilization2 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		System.out.println("Deserilization 1 is called");
		
		Employe e1=new Employe();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\tejak\\Downloads\\Test\\Java123.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employe obj=(Employe)ois.readObject();
		System.out.println(obj.username);
		System.out.println(obj.password);
		System.out.println(obj.age);
		System.out.println(obj.phone);
		
		ois.close();
		fis.close();
		
		System.out.println("Deserilization 2 is called");
	}

}
