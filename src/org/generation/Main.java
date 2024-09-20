package org.generation;

import org.generation.clases.Student;
import org.generation.clases.StudentService;
import org.generation.exceptions.CourseNotFoundException;
import org.generation.exceptions.StudentNotFoundException;

public class Main {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		// TODO refactor this code to use encapsulation inside studentsService
		studentService.addStudent(new Student("Carlos", "1030", 31));
		studentService.addStudent(new Student("Ian", "1020", 28));
		studentService.addStudent(new Student("Elise", "1040", 26));
		studentService.addStudent(new Student("Santiago", "1050", 33));

		try {
			studentService.enrollStudents("Math", "1040");
		} catch (CourseNotFoundException | StudentNotFoundException e) {
			e.printStackTrace();
		}

		try {
			studentService.enrollStudents("Physics", "1020");
		} catch (CourseNotFoundException | StudentNotFoundException e) {
			e.printStackTrace();
		}

		studentService.showEnrolledStudents("Math");
		studentService.showEnrolledStudents("Physics");
		studentService.showAllCourses();
	}
}
