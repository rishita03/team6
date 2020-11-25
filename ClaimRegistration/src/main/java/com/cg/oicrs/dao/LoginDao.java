package com.cg.oicrs.dao;

import com.cg.oicrs.model.UserRole;

public interface LoginDao {
	public boolean validateUser(UserRole user);
	public String getRoleCode(UserRole user);
}