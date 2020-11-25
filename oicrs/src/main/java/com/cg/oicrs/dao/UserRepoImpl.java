package com.cg.oicrs.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.oicrs.exception.UserNotFoundException;
import com.cg.oicrs.model.UserRole;

public class UserRepoImpl implements IUserRepo{
	PreparedStatement psmt;
	ResultSet userResultSet;
	Connection connection;
	//private Connection con;

	public UserRepoImpl()  {
		try {
			connection=ConnectionUtil.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public UserRole addUser(UserRole user) throws SQLException {
		psmt=connection.prepareStatement("insert into login_page values(?,?,?)");
		psmt.setString(1, user.getUserName());
		psmt.setString(2, user.getPassword());
		psmt.setString(3, user.getRoleCode());
		
		int count=psmt.executeUpdate();
		return user;
	}
	
	
	public UserRole createUser(UserRole user) throws SQLException{
		psmt=connection.prepareStatement("insert into login_page values(?,?,?)");
		
		psmt.setString(1, user.getUserName());
		psmt.setString(2, user.getPassword());
		psmt.setString(3, user.getRoleCode());
				
		psmt.executeUpdate();
		
		return user;
	}
	
	public UserRole getUserByUserName(String userName) throws SQLException {
		psmt=connection.prepareStatement("select * from login_page where user_Name=?");
		psmt.setString(1, userName);
		userResultSet=psmt.executeQuery();
		if(!userResultSet.next()) {
			throw new UserNotFoundException("User with userName ["+userName+"] does not exist");
		}
		UserRole user=new UserRole();
		user.setUserName(userResultSet.getString("user_Name"));
		user.setPassword(userResultSet.getString("password"));
		user.setRoleCode(userResultSet.getString("role_Code"));
		return user;
	}


	public boolean deleteUser(String userName) throws SQLException {

		UserRole user = getUserByUserName(userName);
		//Connection con = null;
		psmt = connection.prepareStatement("delete from login_page where user=?");
		psmt.setString(1, userName);
		int isdeleted = psmt.executeUpdate();
		
		return isdeleted>0;
		
	}

	
}