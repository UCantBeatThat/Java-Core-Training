package com.training.map.demo;

import java.util.*;

import com.training.domains.Student;
public class ManageStudents {

	public static void main(String[] args) {

		
		HashMap<Long,Student > studentList = new HashMap<>();
		
		
        Student ramesh = new Student(101, "Ramesh Kumar", 498);
		
		Student suresh = new Student(102, "Suresh Kumar", 495);
		
		// Auto Boxing Feature converts primitive long  returned from getId method into Wrapper class Long
		studentList.put(ramesh.getId(), ramesh);
		studentList.put(suresh.getId(), suresh);

		System.out.println(studentList.get(102L));
		
		
		// Get a Set View of the Map
		Set<Map.Entry<Long, Student>> setView = studentList.entrySet();
		
		// Each Entry in the Set becomes Map.Entry
		for(Map.Entry<Long, Student> eachEntry : setView) {
			
			// Can Access  the Key and Value of Each Entry which a instance  of Map.Entry
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}
	}

}
