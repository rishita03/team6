package com.cg.oicrs.service;

import java.sql.SQLException;

import com.cg.oicrs.dao.ClaimDaoImpl;
import com.cg.oicrs.dao.IClaimDao;
import com.cg.oicrs.model.Claim;

public class ClaimServiceImpl implements IClaimService {

	IClaimDao repo;
	
	public ClaimServiceImpl() throws SQLException {
		
		repo = new ClaimDaoImpl(); 	
			
	}

	
	public Claim getClaimReport(int claimNumber) throws SQLException {
		
		return repo.getDetailedClaimReportView(claimNumber);
	}


	public Claim createClaim(Claim claim) throws SQLException {
		
		return repo.createClaim(claim);
	}
	

	

}