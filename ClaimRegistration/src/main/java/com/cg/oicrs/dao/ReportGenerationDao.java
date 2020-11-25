package com.cg.oicrs.dao;

import java.util.List;

import com.cg.oicrs.model.Claim;

public interface ReportGenerationDao {
	List<Claim> getAllclaimReport();
}