package com.wgx.mapper;

import com.wgx.entity.Student;

public interface StudentMapper {
	public void addStudent(Student student);
	public Student queryStudentByStuno(int stuno);
	
}
