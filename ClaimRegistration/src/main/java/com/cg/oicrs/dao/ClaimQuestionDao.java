package com.cg.oicrs.dao;

import java.util.List;

import com.cg.oicrs.model.ClaimQuestions;

public interface ClaimQuestionDao {

	List<ClaimQuestions> getAllClaimQuestions(long policyNumber);
	String getClaimQuestions(int questionId);
}