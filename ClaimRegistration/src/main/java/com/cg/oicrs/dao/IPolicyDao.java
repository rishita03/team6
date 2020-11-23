package com.cg.oicrs.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.oicrs.model.Policy;

public interface IPolicyDao {
	
	public List<Policy> getAllPolicies() throws SQLException;
	Policy addPolicy(Policy policy) throws SQLException;
	
}