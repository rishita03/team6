package com.cg.oicrs.service;

import com.cg.oicrs.model.UserRole;

public interface UserService {
	public boolean validateUser(UserRole user);

	public String getRoleCode(UserRole user);

	public int profileCreation(UserRole user);
}
