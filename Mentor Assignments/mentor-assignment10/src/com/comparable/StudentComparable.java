package com.comparable;

import java.util.*;

public class StudentComparable {

	public static void main(String args[]) {
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(new Student(101, "Raj", 15));
		s.add(new Student(104, "Ram", 18));
		s.add(new Student(107, "Krishna", 13));

		Collections.sort(s);
		for (Student st : s) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}