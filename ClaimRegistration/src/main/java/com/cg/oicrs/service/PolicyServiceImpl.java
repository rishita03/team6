package com.cg.oicrs.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.oicrs.dao.IPolicyDao;
import com.cg.oicrs.dao.PolicyDaoImpl;
import com.cg.oicrs.model.Policy;

public class PolicyServiceImpl implements IPolicyService {

	IPolicyDao policyRepo;
	
	public PolicyServiceImpl() throws SQLException {
		
		policyRepo = new PolicyDaoImpl();
	}
	
	public Policy addPolicy(Policy policy) throws SQLException {
		return policyRepo.addPolicy(policy);
	}

	public List<Policy> getAllPolicies() throws SQLException {
		return policyRepo.getAllPolicies();
	}

	
	
}