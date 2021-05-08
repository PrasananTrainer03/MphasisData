package com.java.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Employ")
public class Employ {
private int empno,basic;
private String dept,name,desig;
private String gender;

@Column(name="gender")
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Id
@Column(name="empno")
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
@Column(name="basic")
public int getBasic() {
	return basic;
}
public void setBasic(int basic) {
	this.basic = basic;
}
@Column(name="dept")
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Column(name="name")
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Column(name="desig")
public String getDesig() {
	return desig;
}
public void setDesig(String desig) {
	this.desig = desig;
}


}
