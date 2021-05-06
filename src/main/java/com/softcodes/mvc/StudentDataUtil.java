package com.softcodes.mvc;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

	public static List<Student> getStudents() {
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Ujjal", "Chowdhury", "ujjal.0011@yahoo.com"));
		students.add(new Student("Nazmus", "Saquib", "nazmus123@gmail.com"));
		students.add(new Student("Mark", "Rozario", "mark@hotmail.com"));
		
		return students;
	}

}
