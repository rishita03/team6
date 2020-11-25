package com.cg.oicrs.service;

import java.sql.SQLException;
import com.cg.oicrs.dao.IUserRepo;
import com.cg.oicrs.dao.UserRepoImpl;
import com.cg.oicrs.model.UserRole;

public class UserServiceImpl implements IUserService{

	IUserRepo repo;
	
	public UserServiceImpl()  {
	 repo=new UserRepoImpl();
	}
	
	
	public UserRole addUser(UserRole user) throws SQLException {
		
		return repo.addUser(user);
	}

	public boolean isValidUser(String userName, String password, String roleCode) throws SQLException {
		
		
		UserRole user = repo.getUserByUserName(userName);
		if(user.getPassword().equals(password) && user.getRoleCode().equals(roleCode)) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public boolean deleteUser(String userName) throws SQLException {
		
		return repo.deleteUser(userName);
	}


	public UserRole getUserRole(String userName, String password) throws SQLException {
		
		return repo.getUserByUserName(userName);
	}

}
