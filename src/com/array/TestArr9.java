package com.array;

class Student {
	int sid;
	String sName;

}

public class TestArr9 {

	public static void main(String[] args) {

//		Declaration
		Student[] student = new Student[4];

//		creation
		student[0] = new Student();
		student[1] = new Student();
		student[2] = new Student();
		student[3] = new Student();
//		student[4]=new Student();

//		initialization
		student[0].sid = 101;
		student[0].sName = "Teja";

		student[1].sid = 102;
		student[1].sName = "Anjali";

		student[2].sid = 103;
		student[2].sName = "Vinay";

		student[3].sid = 104;
		student[3].sName = "navya";
		
//		declaration
		for(Student name:student) {
			System.out.println("StudentId    : "+name.sid+" ");
			System.out.println("Student Name : "+name.sName);
			
			
			
		}
		
	}

}
