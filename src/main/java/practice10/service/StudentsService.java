package practice10.service;

import practice10.etity.Student;

import java.util.List;


public interface StudentsService {
	Student addStudent(Student student);

	Student getStudentById(int studentId);

	List<Student> getAllStudents();

	void saveStudent(Student student);
}
