package com.cg.oicrs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cg.oicrs.exception.UserNotFoundException;
import com.cg.oicrs.model.Policy;


public class PolicyDaoImpl implements IPolicyDao {

	Connection con;
	PreparedStatement psmt;
	ResultSet rsPolicy;
	
	public PolicyDaoImpl() {
		try {
			con=ConnectionUtil.getConnection();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	public Policy addPolicy(Policy policy) throws SQLException {
		
		psmt=con.prepareStatement("insert into Policy values(?,?,?)");
		psmt.setLong(1, policy.getPolicyNumber());
		psmt.setFloat(2,  policy.getPolicyPremium());
		psmt.setInt(3, policy.getAccountNumber());
		psmt.executeUpdate();
		
		return policy;
	}
	
	
	public List<Policy> getAllPolicies() throws SQLException {
		
		
		psmt = con.prepareStatement("select * from policy");
		rsPolicy = psmt.executeQuery();
			
		List<Policy> policies = new ArrayList<Policy>();
			
		while(rsPolicy.next()) {
		
			Policy policy = new Policy();
			
			policy.setPolicyNumber(rsPolicy.getLong("policyNumber"));
			policy.setPolicyPremium(rsPolicy.getFloat("policyPremium"));
			policy.setAccountNumber(rsPolicy.getInt("accountNumber"));
			
			policies.add(policy);
		
		}
			
			
			return policies;
		
	}


}