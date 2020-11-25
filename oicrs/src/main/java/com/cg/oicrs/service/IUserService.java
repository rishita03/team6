package com.cg.oicrs.service;

import java.sql.SQLException;

import com.cg.oicrs.model.UserRole;

public interface IUserService {

public UserRole addUser(UserRole user) throws SQLException;
	
	public boolean isValidUser(String userName, String password, String roleCode) throws SQLException;
	
	public UserRole getUserRole(String userName, String password) throws SQLException;
	
	public boolean deleteUser(String userName) throws SQLException;
}
