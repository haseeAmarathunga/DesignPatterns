package com.transferObject;

public class TransferObjectPatternDemo {

	public static void main(String[] args) {
		StudentBO studentBusinessObject = new StudentBO();
		
		//print all students
		for(StudentTO student : studentBusinessObject.getAllStudents()) {
			System.out.println("StuId : "+student.getId()+" Name : "+student.getName());
		}	
		
		//update student
		StudentTO student = studentBusinessObject.getStudents(0);
		student.setName("Clash");
		studentBusinessObject.updateStudent(student);
		
		//get the student
		student = studentBusinessObject.getStudents(0);
		System.out.println("Get "+student.getId()+" : "+student.getName());

	}

}
