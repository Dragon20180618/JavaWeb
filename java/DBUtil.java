package com.huey.util;
import java.io.Exception;
import java.sql.*;
import java.util.*;
public class DBUtil(){
	public static Connection getConnection(){
		Connection conn = null;
		try{
			Properties properties  = new Properties();
			properties.load(ClassLoader.getSystemResourceAsStream("mysql.properties"));
			String driverclass = properties.getProperty("driverclass");
			String url = properties.getProperty("url");
			String username=properties.getProperty("username");
			String password=properties.getProperty("password");
			Class.forName(driverclass);
			url+="?user="+username+"&password="+password;
			url+="&useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";
			conn.DriverManager.getConnection(url);
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return conn;
	}
	public static void closeResource(ResultSet rs,Statement st, Connection conn){
		try{
			if(rs!=null){
				rs.close();
			}
			if(st!=null){
				st.close();
			}
			if(conn!=null){
				conn.close();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public static int executeUpdate(String sql,Object... params){
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			conn = getConnection();
			ps=conn.prepareStatement(sql);
			return ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			closeResource(null,ps,conn);
		}
		return 0;
	}
}