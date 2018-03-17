package com.lean.myBatis.executor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lean.myBatis.entity.User;
/*****
 * 
 * Title:SimpleExecutor
 * Description: 封装JDBC
 * Company: 
 * @author MrWang
 * @date 2018年3月17日 下午5:17:40
 */
public class SimpleExecutor implements Executor{

	@Override
	public <T> T query(String sql, Object parameter) {

		Connection connection = getConection();
		PreparedStatement prepareStatement = null;
		User user = new User();
		try {
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, (int)parameter);
			ResultSet rs = prepareStatement.executeQuery();
			while(rs.next()) {
				
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setAge(rs.getInt(3));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(prepareStatement!=null) {
					prepareStatement.close();
				}
				if(connection!=null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return (T) user;
	}

	private Connection getConection() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://192.168.190.10:3306/my";
		String username = "root";
		String pwd = "root";
		Connection connection=null;
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, pwd);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}
	
}
