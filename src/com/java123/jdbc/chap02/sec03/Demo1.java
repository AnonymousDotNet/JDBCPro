package com.java123.jdbc.chap02.sec03;

//加载mysql驱动示例
public class Demo1 {

	private static String jdbcName="com.mysql.jdbc.Driver";
	public static void main(String[] args) {
		try {
			Class.forName(jdbcName);
			System.out.println("加载驱动成功");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("加载驱动失败");
		}
	}
}
