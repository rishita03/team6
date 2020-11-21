package com.cg.oicrs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.oicrs.exception.UserNotFoundException;
import com.cg.oicrs.model.Claim;

public abstract class ClaimRepoImplementaion implements IClaimRepository {
	
	Connection conn;
	PreparedStatement psmt;
	ResultSet resultSet;
	
	public ClaimRepoImplementaion() {
		
		try {
			
			conn = DatabaseConnection.getConnection();
			
		}catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public Claim createClaim(Claim claim) throws SQLException{
		
		psmt=conn.prepareStatement("insert into claim values(?,?,?,?,?,?,?,?)");
		psmt.setInt(1, claim.getClaimNumber());
		psmt.setString(2, claim.getClaimReason());
		psmt.setString(2, claim.getAccidentLocationStreet());
		psmt.setString(3, claim.getAccidentCity());
		psmt.setString(4, claim.getAccidentState());
		psmt.setInt(5, claim.getAccidentZip());
		psmt.setString(6, claim.getClaimType());
		
		psmt.executeUpdate();
		
		return claim;
		
	}
	
	public Claim updateClaim(Claim claim) throws SQLException{
		
		Claim updateClaim = getDetailedClaimReportView(claim.getClaimNumber());
		
		psmt=conn.prepareStatement("update claim set claimNumber=?, claimReason=?, accidentLocationStreet=?, accidentCity=?, accidentState=?, accidentZip=?, claimType=?, policyNumber=?");
		psmt.setInt(1, claim.getClaimNumber());
		psmt.setString(2, claim.getClaimReason());
		psmt.setString(3, claim.getAccidentLocationStreet());
		psmt.setString(4, claim.getAccidentCity());
		psmt.setString(5, claim.getAccidentState());
		psmt.setInt(6, claim.getAccidentZip());
		psmt.setString(7, claim.getClaimType());
		psmt.setInt(8, claim.getPolicyNumber());
		
		psmt.executeUpdate();
		
		return claim;
	}
	
	public boolean deleteClaim(int claimNumber) throws SQLException{
		
		Claim claim = getDetailedClaimReportView(claimNumber);
		
		psmt=conn.prepareStatement("delete from claim where claim=?");
		psmt.setInt(1, claimNumber);
		int isdeleted=psmt.executeUpdate();
		
		return isdeleted>0;
	}
	
	public Claim getDetialedClaimReportView(int claimNumber) throws SQLException{
		
		psmt=conn.prepareStatement("select * from claim where claimNumber=?");
		psmt.setInt(1, claimNumber);
		resultSet=psmt.executeQuery();
		
		if(!resultSet.next()) {
			
			throw new UserNotFoundException("User with Caim Number ["+claimNumber+"] does not exist");
			
		}
		
		Claim claim=new Claim();
		claim.setClaimNumber(resultSet.getInt("claimNumber"));
		claim.setClaimReason(resultSet.getString("claimReason"));
		claim.setAccidentLocationStreet(resultSet.getString("accidentLocationStreet"));
		claim.setAccidentCity(resultSet.getString("accidentCity"));
		claim.setAccidentState(resultSet.getString("accidentState"));
		claim.setAccidentZip(resultSet.getInt("accidentZip"));
		claim.setClaimType(resultSet.getString("claimType"));
		claim.setPolicyNumber(resultSet.getInt("policyNumber"));
		
		return claim;
		
	}

	public static void claimCreation(Claim claim) {
		// TODO Auto-generated method stub
		
	}

}
