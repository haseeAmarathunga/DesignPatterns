package com.transferObject;
import java.util.*;

//business Object
public class StudentBO {
	//this is working as a database
	List<StudentTO> students;
	
	public StudentBO()
	{
		students = new ArrayList<StudentTO>();
		StudentTO stu1 =new StudentTO("Hasee",0);
		StudentTO stu2 =new StudentTO("Kamal",1);
		
		students.add(stu1);
		students.add(stu2);		
	}
	
	public void deleteStudent(StudentTO student) {
		students.remove(student.getId());
		System.out.println("student "+student.getId()+" deleted.");
	}
	
	public List<StudentTO> getAllStudents(){
		return students;
	}
	
	public StudentTO getStudents(int id) {
		return students.get(id);
	}
	
	public void updateStudent(StudentTO student) {
		students.get(student.getId()).setName(student.getName());
		System.out.println("Student "+student.getId() + " Updated.");
	}
}
