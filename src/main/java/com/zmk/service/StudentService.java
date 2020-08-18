package com.zmk.service;

import java.util.List;
import java.util.Map;

import com.zmk.bean.Student;

public interface StudentService {

	public List<Student> selall(Map<String,Object>map);
	
	public int del(Integer sid);

}
