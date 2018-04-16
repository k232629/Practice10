package practice10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import practice10.etity.Student;
import practice10.service.StudentsService;


@Controller
public class HomeController {
	@Autowired
	private StudentsService studentsService;

	@RequestMapping({ "/", "/home" })
	public String showHomePage(Model model) {
		Student st = new Student();
		st.setCourse(2);
		st.setPib("Slavik Stepanov");
		st.setStudentId(1);
		studentsService.saveStudent(st);
		model.addAttribute("mainText", "Spring practice 10");
		model.addAttribute("studentsList", studentsService.getAllStudents());
		return "home";
	}
}
