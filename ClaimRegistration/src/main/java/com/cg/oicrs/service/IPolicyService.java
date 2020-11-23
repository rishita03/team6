package com.cg.oicrs.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.oicrs.model.Policy;

public interface IPolicyService {

	public Policy addPolicy(Policy policy) throws SQLException;
	public List<Policy> getAllPolicies() throws SQLException;
}
