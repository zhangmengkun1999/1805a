package com.zmk.bean;

public class Student {
	private Integer sid;
	private String sname;
	private String cname;
	private String gender;
	private Integer age;
	private Integer cid;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Student(Integer sid, String sname, String cname, String gender, Integer age, Integer cid) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.cname = cname;
		this.gender = gender;
		this.age = age;
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", cname=" + cname + ", gender=" + gender + ", age=" + age
				+ ", cid=" + cid + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
