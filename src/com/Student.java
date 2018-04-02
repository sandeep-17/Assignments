package com.assignments;

public class Student {

	String studentName="Dave";
	public int rollNo;
	public long contactNo;
	public String studentLocation;
	public boolean examResult;

	// functions (or) methods
	public void comingToSchool() { 	// exchanged public and void 
			System.out.println(studentName);
	}

	public boolean getExamResult() { // return type is boolean so removed void
		return examResult;
	}

	public void playingSports() {
		System.out.println(studentName);
	}
	
	public void printStudentDetails()
	{
		System.out.println(studentName+" "+" "+studentLocation+" "+" "+rollNo+" "+" "+contactNo);
	}
}
