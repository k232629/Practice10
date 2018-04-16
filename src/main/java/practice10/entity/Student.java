package practice10.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "students")
@NamedQueries({
		@NamedQuery(name = Student.getAllStudents, query = "SELECT student FROM Student student")})
public class Student implements Serializable {
	public static final String getAllStudents = "Student.getAllStudents";
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int studentId;
	private String pib;
	private int course;

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {

		this.studentId = studentId;
	}
	public String getPib() {

		return pib;
	}
	public void setPib(String pib) {

		this.pib = pib;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {

		this.course = course;
	}

}
