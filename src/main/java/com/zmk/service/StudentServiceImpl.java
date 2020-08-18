package com.zmk.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zmk.bean.Student;
import com.zmk.mapper.StudentMapper;

@Service
public class StudentServiceImpl implements StudentService {
	@Resource
	private StudentMapper studentMapper;
	
	
	@Override
	public List<Student> selall(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return studentMapper.selall(map);
	}


	@Override
	public int del(Integer sid) {
		// TODO Auto-generated method stub
		return studentMapper.del(sid);
	}


	


	

}
