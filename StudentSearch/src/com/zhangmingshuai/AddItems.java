package com.zhangmingshuai;
import java.sql.*;
/**
 * CreateDate：2017-5-8下午08:21:45
 * Location：HIT
 * Author: Zhang Mingshuai
 * TODO
 * return
 */
public class AddItems {

	/**
	 * CreateDate：2017-5-8下午08:21:45
	 * Location：HIT
	 * Author: Zhang Mingshuai
	 * TODO
	 * return
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection myConnection = GetConnection.get();
		String id = "1140110401";
		//String[] name = {"张旭","霍守康","金卓林","王志达","张旭","张茗帅","于洋","郭鑫","刘强","董浩洋"};
		//String[] name = {"宋振","肖华东","谢博迪","彭泽昊","李宁","何永超","袁怡轮","张韬庚","王智","宋金波"};
		//String[] name = {"小美","小东","小迪","小昊","小宁","小超","小轮","小张","小智","小宋"};
		//String[] name = {"大美","大东","大迪","大昊","大宁","大超","大轮","大张","大智","大宋"};
		String[] name = {"老美","老东","老迪","老昊","老宁","老超","老轮","老张","老智","老宋"};
		String[] addr = {"吉林长春","吉林白城","吉林通化","吉林四平","吉林白山","吉林松原","吉林松原","吉林延边","吉林松原","吉林长春"};
		for(int i = 0;i<10;i++){
			PreparedStatement stmt2 = myConnection.prepareStatement("insert into student"+" values(?,?,?,?,?,?,?)");
			stmt2.setString(1, id);
			stmt2.setString(2, name[i]);
			if(i%2==0){
				stmt2.setString(3, "17");
			}
			else {
				stmt2.setString(3, "23");
			};
			if(i%2==0){
				stmt2.setString(4, "男");
			}
			else {
				stmt2.setString(4, "女");
			}
			stmt2.setString(5, "1401104");
			stmt2.setString(6, "01");
			stmt2.setString(7, addr[i]);
			stmt2.executeUpdate();
			id = String.valueOf(Integer.valueOf(id)+1);
			System.out.println("success:"+i);
		}
	}

}
