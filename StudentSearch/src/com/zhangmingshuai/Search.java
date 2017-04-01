package com.zhangmingshuai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

import com.sun.org.apache.xpath.internal.Arg;


/**
 * CreateDate：2017-5-8下午09:32:48
 * Location：HIT
 * Author: Zhang Mingshuai
 * TODO
 * return
 */
public class Search {
	
	private StudentBean st;
	private DefaultTableModel tb;
	
	public  Search(DefaultTableModel tModel,StudentBean student) {
		this.tb = tModel;
		this.st = student;
	}
//	public  Search() {
//		
//	}
//	
	public String getResult() {
		
		String id;
		String name;
		String sex;
		String age;
		String clas;
		String dept;
		String addr;
		
		String result = new String();		//save as preparedstatemnet for sql
		StringBuffer re = new StringBuffer("select * from student where ");

		int flag = 0;
		if(st.isNumberCheck()){		//sid controller
			if(flag ==0){
				if(st.getNumber().indexOf("%")!=-1){
					re.append("(sid like '"+st.getNumber()+"') ");
				}
				else{
					re.append("(sid = "+st.getNumber()+") ");
				}
			}
			if(flag ==1){
				if(st.getNumber().indexOf("%")!=-1){
					re.append("and (sid like '"+st.getNumber()+"') ");
				}
				else{
					re.append("and (sid = "+st.getNumber()+") ");
				}
			}
			flag = 1;
		}
		
		if(st.isNameCheck()){		//sname controller
			if(flag ==0){
				if(st.getName().indexOf("%")!=-1){
					re.append("(sname like '"+st.getName()+"') ");
				}
				else{
					re.append("(sname= '"+st.getName()+"') ");
				}
			}
			if(flag ==1){
				if(st.getName().indexOf("%")!=-1){
					re.append("and (sname like '"+st.getName()+"') ");
				}
				else{
					re.append("and (sname = '"+st.getName()+"') ");
				}
			}
			flag = 1;
		}
		
		if(st.isAgeCheck()){		//sage controller
			if(flag ==0){
				re.append("(sage >= "+st.getAge_begin()+") ");
				re.append("and (sage <= "+st.getAge_end()+") ");				
			}
			if(flag ==1){
				re.append("and (sage >= "+st.getAge_begin()+") ");
				re.append("and (sage <= "+st.getAge_end()+") ");
			}
			flag = 1;
		}
		
		if(st.isSexCheck()){		//ssex controller
			if(flag ==0){
				if(st.getSex().indexOf("%")!=-1){
					re.append("(ssex like '"+st.getSex()+"') ");
				}
				else{
					re.append("(ssex= '"+st.getSex()+"') ");
				}
			}
			if(flag ==1){
				if(st.getSex().indexOf("%")!=-1){
					re.append("and (ssex like '"+st.getSex()+"') ");
				}
				else{
					re.append("and (ssex = '"+st.getSex()+"') ");
				}
			}
			flag = 1;
		}
		
		if(st.isClassCheck()){		//sclass controller
			if(flag ==0){
				if(st.getClassString().indexOf("%")!=-1){
					re.append("(sclass like '"+st.getClassString()+"') ");
				}
				else{
					re.append("(sclass= "+st.getClassString()+") ");
				}
			}
			if(flag ==1){
				if(st.getClassString().indexOf("%")!=-1){
					re.append("and (sclass like '"+st.getClassString()+"') ");
				}
				else{
					re.append("and (sclass = "+st.getClassString()+") ");
				}
			}
			flag = 1;
		}
		
		if(st.isDeptCheck()){		//sdept controller
			if(flag ==0){
				if(st.getDepartment().indexOf("%")!=-1){
					re.append("(sdept like '"+st.getDepartment()+"') ");
				}
				else{
					re.append("(sdept= "+st.getDepartment()+") ");
				}
			}
			if(flag ==1){
				if(st.getDepartment().indexOf("%")!=-1){
					re.append("and (sdept like '"+st.getDepartment()+"') ");
				}
				else{
					re.append("and (sdept = "+st.getDepartment()+") ");
				}
			}
			flag = 1;
		}
		
		if(st.isAddrCheck()){		//saddr controller
			if(flag ==0){
				if(st.getAddress().indexOf("%")!=-1){
					re.append("(saddr like '"+st.getAddress()+"') ");
				}
				else{
					re.append("(saddr= '"+st.getAddress()+"') ");
				}
			}
			if(flag ==1){
				if(st.getAddress().indexOf("%")!=-1){
					re.append("and (saddr like '"+st.getAddress()+"') ");
				}
				else{
					re.append("and (saddr = '"+st.getAddress()+"') ");
				}
			}
			flag = 1;
		}
		
		result = re.toString();	//change to String
		
		System.out.println(result);
		
		Connection my = GetConnection.get();
		try {
			PreparedStatement ps = my.prepareStatement(result);
			ResultSet row = ps.executeQuery();
			while (row.next()){
				id = row.getString(1);
				name = row.getString(2);
				age = row.getString(3);
				sex = row.getString(4);
				clas = row.getString(5);
				dept = row.getString(6);
				addr = row.getString(7);
				tb.addRow(new String[]{id,name,age,sex,clas,dept,addr});
				System.out.println(id+" "+name+" "+age+" "+sex+" "+clas+" "+dept+" "+addr);
			}
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Wrong SQL Statement!";
		}
	}
//	public static void main(String[] args) throws SQLException{
//		Search test = new Search();
//		test.getResult();
//	}
}
