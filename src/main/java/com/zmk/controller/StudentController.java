package com.zmk.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zmk.bean.Student;
import com.zmk.service.StudentService;

@Controller
public class StudentController {
	
	@Resource
	private StudentService studentService;
	
	
	@RequestMapping("list")
	public String selall(Model model,@RequestParam(defaultValue = "1")Integer pageNum) {
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		PageHelper.startPage(pageNum, 3);
		
		List<Student> list = studentService.selall(map);
		
		PageInfo<Student> page = new PageInfo<Student>(list);
		
		model.addAttribute("page",page);

		return "list";
	}
	
	
	@RequestMapping("del")
	public Integer del(Integer sid,Model model) {
		 int i = studentService.del(sid);
		return i;
	}
}
