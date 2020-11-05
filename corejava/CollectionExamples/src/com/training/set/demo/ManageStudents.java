package com.training.set.demo;
import java.util.*;

import com.training.domains.Student;

public class ManageStudents {

	private static 	HashSet<Student> studentList = new HashSet<>();
	
	private static TreeSet<Student> sortedStudentList = new TreeSet<>();
	
	public static boolean  addToSet(Student stud) {
		
		
		return studentList.add(stud);
	}
	
	public static boolean addToSortedSet(Student stud) {
		return sortedStudentList.add(stud);
	}
	public static void main(String[] args) {
		
				
		Student ramesh = new Student(101, "Ramesh Kumar", 498);
		
		Student chikaSuresh = new Student(102, "Suresh Kumar", 495);
		
		Student doddaSuresh = new Student(102, "Suresh Kumar", 495);

		System.out.println(addToSet(doddaSuresh));
		System.out.println(addToSet(chikaSuresh));
		System.out.println(addToSet(ramesh));
		
		
		System.out.println(addToSortedSet(ramesh));
		System.out.println(addToSortedSet(doddaSuresh));
		System.out.println(addToSet(chikaSuresh));
		
		System.out.println(sortedStudentList);
		
		
		
		
		
		
		
		
		
		
		
		
		// System.out.println(studentList);
		
		
	}
}
