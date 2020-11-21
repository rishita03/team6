package com.cg.oicrs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.oicrs.dao.ClaimRepoImplementaion;
import com.cg.oicrs.dao.IClaimRepository;
import com.cg.oicrs.model.Claim;

/**
 * Servlet implementation class ClaimServlet
 */
public class ClaimCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//private ClaimRepoImplementaion claimRepoImplemenation = new ClaimRepoImplemetation();
    
	IClaimRepository service;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClaimCreate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int claimNumber = Integer.parseInt(request.getParameter("claimNumber"));
		String claimReason = request.getParameter("claimReason");
		String accidentLocationStreet = request.getParameter("accidentlocationStreet");
		String accidentCity = request.getParameter("accidentCity");
		String accidentState = request.getParameter("accidentState");
		int accidentZip = Integer.parseInt(request.getParameter("accidentZip"));
		String claimType = request.getParameter("claimType");
		int policyNumber = Integer.parseInt(request.getParameter("policyNumber"));
		
		Claim claim = new Claim();
		claim.setClaimNumber(claimNumber);
		claim.setClaimReason(claimReason);
		claim.setAccidentLocationStreet(accidentLocationStreet);
		claim.setAccidentCity(accidentCity);
		claim.setAccidentState(accidentState);
		claim.setAccidentZip(accidentZip);
		claim.setClaimType(claimType);
		claim.setPolicyNumber(policyNumber);
		
		
		
	}

}
