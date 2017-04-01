/**
 * 
 */
package com.zhangmingshuai;

/**
 * CreateDate：2017-5-8下午07:02:35
 * Location：HIT
 * Author: Zhang Mingshuai
 * TODO
 * return
 */
public class StudentBean {
	
	private String number;
	private String name;
	private String age_begin;
	private String age_end;
	private String sex;
	private String classString;
	private String department;
	private String address;
	private boolean numberCheck;
	private boolean nameCheck;
	private boolean ageCheck;
	private boolean sexCheck;
	private boolean classCheck;
	private boolean deptCheck;
	private boolean addrCheck;

	public boolean isNumberCheck() {
		return numberCheck;
	}
	public void setNumberCheck(boolean numberCheck) {
		this.numberCheck = numberCheck;
	}
	public boolean isNameCheck() {
		return nameCheck;
	}
	public void setNameCheck(boolean nameCheck) {
		this.nameCheck = nameCheck;
	}
	public boolean isAgeCheck() {
		return ageCheck;
	}
	public void setAgeCheck(boolean ageCheck) {
		this.ageCheck = ageCheck;
	}
	public boolean isSexCheck() {
		return sexCheck;
	}
	public void setSexCheck(boolean sexCheck) {
		this.sexCheck = sexCheck;
	}
	public boolean isClassCheck() {
		return classCheck;
	}
	public void setClassCheck(boolean classCheck) {
		this.classCheck = classCheck;
	}
	public boolean isDeptCheck() {
		return deptCheck;
	}
	public void setDeptCheck(boolean deptCheck) {
		this.deptCheck = deptCheck;
	}
	public boolean isAddrCheck() {
		return addrCheck;
	}
	public void setAddrCheck(boolean addrCheck) {
		this.addrCheck = addrCheck;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge_begin() {
		return age_begin;
	}
	public void setAge_begin(String ageBegin) {
		age_begin = ageBegin;
	}
	public String getAge_end() {
		return age_end;
	}
	public void setAge_end(String ageEnd) {
		age_end = ageEnd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getClassString() {
		return classString;
	}
	public void setClassString(String classString) {
		this.classString = classString;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
