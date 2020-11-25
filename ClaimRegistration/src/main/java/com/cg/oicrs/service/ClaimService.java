package com.cg.oicrs.service;

import java.util.List;

import com.cg.oicrs.model.Accounts;
import com.cg.oicrs.model.Claim;
import com.cg.oicrs.model.ClaimQuestions;

public interface ClaimService {
	List<ClaimQuestions> getAllClaimQuestions(long policyNumber);

	long insertClaimDetails(Claim claim);

	List<Claim> getAllClaims();

	List<Claim> getAllclaimReport();

	public Claim getClaimDetails(long policyNumber);

	String getClaimQuestions(int questionId);

	List<Accounts> getHandlerPolicyDetails(String userRole);

	List<Claim> getClaimHandlerCalim(String user_name);

	List<Claim> getInsuredClaim(String user_name);
}
