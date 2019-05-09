package com.java123.jdbc.chap02.sec04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1 {
	// ���ݿ��ַ
	private static String dbUrl = "";
	// �û���
	private static String dbName = "";
	// ����
	private static String dbPassword = "";
	// ��������
	private static String jdbcName = "com.mysql.jdbc.Driver";

	public static void main(String[] args) {
		/**
		 * ��һ�����ȼ�������
		 */
		try {
			Class.forName(jdbcName);
			System.out.println("���������ɹ�");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("��������ʧ��");
		}

		Connection con = null;// �������jdbc��
		try {
			// ��ȡ���ݿ�����
			con = DriverManager.getConnection(dbUrl, dbName, dbPassword);
			System.out.println("��ȡ���ݿ����ӳɹ�");
			System.out.println("�������ݿ����");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("��ȡ���ݿ�����ʧ��");
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
