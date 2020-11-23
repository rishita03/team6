package com.cg.oicrs.dao;

import java.sql.SQLException;

import com.cg.oicrs.model.Claim;

public interface IClaimDao {

	public Claim createClaim(Claim claim) throws SQLException;
	
	public Claim getDetailedClaimReportView(int claimNumber) throws SQLException;
	
	public boolean deleteClaim(int claimNumber) throws SQLException;
	
	public Claim updateClaim(Claim claim) throws SQLException;
	
}
