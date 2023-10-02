package com.app;

public class Student {

	private Integer stdId;
	private String name;
	private static String clgName="Dhanamjaya";

	public Student(Integer stdId, String name, String clgName) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.clgName = clgName;
	}

	public Student() {
		super();
	}

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", clgName=" + clgName + "]";
	}
}
