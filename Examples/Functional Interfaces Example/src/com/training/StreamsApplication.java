package com.training;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.training.model.Student;

public class StreamsApplication {

	public static List<Student> getStudents(){
		
		Student student1 = new Student(101, "Ramesh", 81, 78976534);
		Student student2 = new Student(102, "Suresh", 42, 78976533);
		Student student3 = new Student(103, "Sundar", 83, 78976532);
		Student student4 = new Student(104, "Shiva", 61, 78976531);
		Student student5 = new Student(105, "Sukesh", 85, 78976530);
		Student student6 = new Student(106, "Rahul", 50, 78976535);
		
		return Arrays.asList(student1, student2, student3, student4, student5, student6);
	}
	
	public static void main(String[] args) {
		
		List<Student> students = getStudents();
		
		System.out.println("List of all students");
		
		students.forEach(System.out::println);
		
		System.out.println("\nMarks Scored more than 70");
		
		students.stream()
			.filter(eachStudent -> eachStudent.getMarkScored() > 70)
			.collect(Collectors.toList())
			.forEach(System.out::println);

		System.out.println("\nStudent List with Name and Phone Number");
		
//		students.stream()
//			.filter(eachStudent -> eachStudent.getMarkScored() > 60)
//			.collect(Collectors.toMap(Student::getName, Student::getMobileNumber))
//			.entrySet()
//			.forEach(System.out::println);
		
		students.stream()
			.filter(eachStudent -> eachStudent.getMarkScored() > 60)
			.collect(Collectors.toMap(Student::getName, Student::getMobileNumber))
			.entrySet()
			.forEach(eachStudent -> System.out.println(eachStudent.getKey() + ": " + eachStudent.getValue()));
		
		System.out.println("\nSorted List of Students wrt to Marks");
		
		students.stream()
			.sorted(Comparator.comparing(Student::getMarkScored).reversed())
			.forEach(System.out::println);
		
		System.out.println("\nUsing terminal operators");
		
		Comparator<Student> comparator = Comparator.comparing(Student::getMarkScored);
		
		Optional<?> highestMark = students.stream()
				.max(comparator);
		
		Optional<?> lowestMark = students.stream()
				.min(comparator);
		
		if(highestMark.isPresent()) {
			System.out.println("Highest Mark: " + highestMark.get());
		}
		
		if(lowestMark.isPresent()) {
			System.out.println("Lowest Mark: " + lowestMark.get());
		}
	}

}
