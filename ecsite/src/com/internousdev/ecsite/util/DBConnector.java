package com.internousdev.ecsite.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	//SQL接続に必要な情報を設定
		private static String driverName = "com.mysql.jdbc.Driver";
		private static String url = "jdbc:mysql://localhost/ecsite";

	//MySQLアクセス時のuserとpassの設定
		private static String user ="root";
		private static String password ="mysql";

		public Connection getConnection(){
			Connection con=null;

			try{
				Class.forName(driverName);
				con = (Connection)DriverManager.getConnection(url,user,password);
				//上記の情報を元に自分のパソコンからMySQLに接続する準備が整う
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}catch(SQLException e){
				e.printStackTrace();
			}
			return con;	//MySQLに接続できたのか情報を渡す
		}
}
