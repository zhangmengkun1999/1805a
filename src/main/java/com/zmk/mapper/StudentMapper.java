package com.zmk.mapper;

import java.util.List;
import java.util.Map;

import com.zmk.bean.Student;

public interface StudentMapper {

	public List<Student> selall(Map<String,Object>map);
	
	public int del(Integer sid);

}
