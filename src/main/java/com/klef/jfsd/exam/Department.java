package com.klef.jfsd.exam;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Department {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int departmentid;
	String departmentname;
	String hodname;
	String location;
	public int getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getHodname() {
		return hodname;
	}
	public void setHodname(String hodname) {
		this.hodname = hodname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
