package com.comparator;

import java.util.*;

public class StudentComparator {
	public static void main(String args[]) {
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(new Student(101, "Vijay", 23));
		s.add(new Student(106, "Ajay", 27));
		s.add(new Student(105, "Jai", 21));

		System.out.println("Sorting by Name");
		Collections.sort(s, new NameComparator());
		for (Student st : s) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("sorting by Age");
		Collections.sort(s, new AgeComparator());
		for (Student st : s) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}