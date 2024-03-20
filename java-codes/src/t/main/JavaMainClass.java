package t.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import t.collection.Student;
import t.collection.StudentIdComparator;
import t.generics.GenericMethods;
import t.regex.RegEx;

public class JavaMainClass {

	public static void main(String[] args) {
		System.out.println("inside main method");
		String[] cities = { "Bengaluru", "Chennai" };
		Integer[] codes = { 12, 14, 15 };

		GenericMethods.print(cities);
		GenericMethods gm = new GenericMethods();
		gm.print(codes); // the static method print(Integer[]) from the type GenericMethods should be
							// accessed in a static way
		
		// Generic finishes here... working on collection framework
		System.out.println(">>>Generic finishes here... working on collection framework<<<");
		Student s1 = new Student(2, "Adam");
		Student s2 = new Student(1, "Zecab");
		Student s3 = new Student(3, "Mathew");
	
		List<Student> stds = new ArrayList<>();
		stds.add(s1); stds.add(s2); stds.add(s3);
		for(Student s:stds) {
			System.out.println(s.toString());
		}
		System.out.println("Sorting the list in natural order based on student name");
		Collections.sort(stds);
		for(Student s:stds) {
			System.out.println(s.toString());
		}
		
		System.out.println("TreeSet and TeeMap are alredy sorted");
		Set<Student> sortedStudent = new TreeSet<>();
		sortedStudent.add(s1);
		sortedStudent.add(s2);
		sortedStudent.add(s3);
		for(Student s:sortedStudent) {
			System.out.println(s.toString());
		}
		
		System.out.println("SORTING based on id with new comparator");
		Collections.sort(stds, new StudentIdComparator());
		for(Student s:stds) {
			System.out.println(s.toString());
		}
		
		System.out.println("TreeSet with new comparator");
		Set<Student> sortedStudent2 = new TreeSet<>(new StudentIdComparator());
		sortedStudent2.add(s1);
		sortedStudent2.add(s2);
		sortedStudent2.add(s3);
		for(Student s:sortedStudent2) {
			System.out.println(s.toString());
		}
		
		System.out.println("\nRegEx: validating name");
		System.out.println(RegEx.validateName("&"));
		System.out.println("\nRegEx: validating SSN");
		System.out.println(RegEx.validateSSN("123-85-3456")); //123-85-3456 correct format
		
	}

}

