package com.cg.oicrs.service;

import com.cg.oicrs.dao.LoginDao;
import com.cg.oicrs.dao.LoginDaoImpl;
import com.cg.oicrs.dao.ProfileCreationDao;
import com.cg.oicrs.dao.ProfileCreationDaoImpl;
import com.cg.oicrs.model.UserRole;

public class UserServiceImpl implements UserService {

	LoginDao logDao = new LoginDaoImpl();
	ProfileCreationDao pDao = new ProfileCreationDaoImpl();

	public boolean validateUser(UserRole user) {
		return logDao.validateUser(user);
	}

	public String getRoleCode(UserRole user) {
		return logDao.getRoleCode(user);
	}

	@Override
	public int profileCreation(UserRole newUser) {
		return pDao.profileCreation(newUser);
	}
}