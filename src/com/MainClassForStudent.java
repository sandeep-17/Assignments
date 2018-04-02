package com.assignments;

public class MainClassForStudent {

	public static void main(String[] args) {
		
			Student alexObj=new Student();
			alexObj.studentName="Alex";
			alexObj.rollNo=01; 				//removed quotations from int value
			alexObj.contactNo=9629090705l;
			alexObj.studentLocation="California";
			alexObj.printStudentDetails();
			System.out.println(alexObj.getExamResult());
			
			Student chrisObj=new Student();
			chrisObj.studentName="Chris";
			chrisObj.rollNo=02;			//removed quotations from int value
			chrisObj.contactNo=9788628958l;
			chrisObj.studentLocation="Texas";
			chrisObj.examResult=true;
			chrisObj.printStudentDetails(); // changed the obj 
			System.out.println(chrisObj.getExamResult());
			
			Student chrisObj2=new Student();// changed the obj name because duplicate to previous one
			System.out.println(chrisObj2.getExamResult());//removed paramter from get method
		}
	
	//o/p:
		//Alex  California  1  9629090705
		//false
		//Chris  Texas  2  9788628958
		//true
		//false


}
