package com.wgx.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wgx.entity.Student;
import com.wgx.service.StudentService;

@RequestMapping("controller")
@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping("queryStudentByNo/{stuno}")
	public String queryStudentByNo(@PathVariable("stuno") Integer stuNo,Map<String,Student> map) {
		Student student=studentService.queryStudentByNo(stuNo);
		map.put("student",student);
		return "success.jsp";
	}
}
