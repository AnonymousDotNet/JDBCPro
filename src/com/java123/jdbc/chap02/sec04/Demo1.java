package com.java123.jdbc.chap02.sec04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1 {
	// 数据库地址
	private static String dbUrl = "";
	// 用户名
	private static String dbName = "";
	// 密码
	private static String dbPassword = "";
	// 驱动名称
	private static String jdbcName = "com.mysql.jdbc.Driver";

	public static void main(String[] args) {
		/**
		 * 第一步，先加载驱动
		 */
		try {
			Class.forName(jdbcName);
			System.out.println("加载驱动成功");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("加载驱动失败");
		}

		Connection con = null;// 添加引用jdbc包
		try {
			// 获取数据库链接
			con = DriverManager.getConnection(dbUrl, dbName, dbPassword);
			System.out.println("获取数据库链接成功");
			System.out.println("进行数据库操作");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("获取数据库链接失败");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
