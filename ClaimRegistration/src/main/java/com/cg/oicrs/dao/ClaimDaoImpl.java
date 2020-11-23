package com.cg.oicrs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.oicrs.exception.UserNotFoundException;
import com.cg.oicrs.model.Claim;

public class ClaimDaoImpl implements IClaimDao {
	
	Connection con;
	PreparedStatement psmt;
	ResultSet rsClaim;

	public ClaimDaoImpl() {
		
		try {
			con = ConnectionUtil.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Claim getDetailedClaimReportView(int claimNumber) throws SQLException {
		
		psmt = con.prepareStatement("select * from claim where claimNumber=?");
		psmt.setInt(1, claimNumber);
		rsClaim = psmt.executeQuery();
		
		if(!rsClaim.next()) {
			throw new UserNotFoundException("User with Claim Number ["+claimNumber+"] does not exist");
		}
		
		Claim claim = new Claim();
		
		claim.setClaimNumber(rsClaim.getInt("claimNumber"));
		claim.setClaimReason(rsClaim.getString("claimReason"));
		claim.setAccidentLoactionStreet(rsClaim.getString("accidentLocationStreet"));
		claim.setAccidentCity(rsClaim.getString("accidentCity"));
		claim.setAccidentState(rsClaim.getString("accidentState"));
		claim.setAccidentZip(rsClaim.getInt("accidentZip"));
		claim.setClaimType(rsClaim.getString("claimType"));
		claim.setPolicyNumber(rsClaim.getInt("policyNumber"));
		
		return claim;
		
	}

	public Claim createClaim(Claim claim) throws SQLException {
		
		psmt=con.prepareStatement("insert into claim values(?,?,?,?,?,?,?,?)");
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

	public boolean deleteClaim(int claimNumber) throws SQLException {

		Claim claim = getDetailedClaimReportView(claimNumber);
		psmt = con.prepareStatement("delete from claim where claim=?");
		psmt.setInt(1, claimNumber);
		int isdeleted = psmt.executeUpdate();
		
		return isdeleted>0;
		
	}

	public Claim updateClaim(Claim claim) throws SQLException {
	
		Claim updateclaim = getDetailedClaimReportView(claim.getClaimNumber());
		psmt = con.prepareStatement("update claim set claimNumber=?, claimReason=?, accidentLoactionStreet=?, accidentCity=?, accidentState=?, accidentZip=?, claimType=?, policyNumber=?");
		
		
		psmt.setString(1, claim.getClaimReason());
		psmt.setString(2, claim.getAccidentLocationStreet());
		psmt.setString(3, claim.getAccidentCity());
		psmt.setString(4, claim.getAccidentState());
		psmt.setInt(5, claim.getAccidentZip());
		psmt.setString(6, claim.getClaimType());

		
		psmt.executeUpdate();
		
		return claim;
	}
	
	


}