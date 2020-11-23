package com.cg.oicrs.service;

import java.sql.SQLException;

import com.cg.oicrs.model.Claim;


public interface IClaimService {

	public Claim getClaimReport(int claimNumber)throws SQLException;
			
	public Claim createClaim(Claim claim) throws SQLException;
}