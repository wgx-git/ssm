package com.wgx.serviceImpl;

import com.wgx.entity.Student;
import com.wgx.mapper.StudentMapper;
import com.wgx.service.StudentService;

public class StudentServiceImpl implements StudentService{
	private StudentMapper studentMapper;
	
	public StudentMapper getStudentMapper() {
		return studentMapper;
	}

	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	@Override
	public Student queryStudentByNo(int stuNo) {
		// TODO Auto-generated method stub
		studentMapper.queryStudentByStuno(stuNo);
		return studentMapper.queryStudentByStuno(stuNo);
	}

}
