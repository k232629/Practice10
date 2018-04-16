package practice10.dao;

import practice10.etity.Student;

import java.util.List;

public interface StudentsDao {

	Student addStudent(Student student);

	Student getStudentById(int studentId);

	List<Student> getAllStudents();

	void saveStudent(Student student);

}
