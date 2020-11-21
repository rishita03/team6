package com.cg.oicrs.model;

public class Claim {
	
	private int claimNumber;
	private String claimReason;
	private String accidentLoactionStreet;
	private String accidentCity;
	private String accidentState;
	private int accidentZip;
	private String claimType;
	private int policyNumber;


	public Claim() {

	}

	public Claim(int claimNumber, String claimReason, String accidentLoactionStreet, String accidentCity,
	String accidentState, int accidentZip, String claimType, int policyNumber) {
	super();
	this.claimNumber = claimNumber;
	this.claimReason = claimReason;
	this.accidentLoactionStreet = accidentLoactionStreet;
	this.accidentCity = accidentCity;
	this.accidentState = accidentState;
	this.accidentZip = accidentZip;
	this.claimType = claimType;
	this.policyNumber = policyNumber;
	}


	public int getClaimNumber() {
	return claimNumber;
	}


	public void setClaimNumber(int claimNumber) {
	this.claimNumber = claimNumber;
	}


	public String getClaimReason() {
	return claimReason;
	}


	public void setClaimReason(String claimReason) {
	this.claimReason = claimReason;
	}


	public String getAccidentLoactionStreet() {
	return accidentLoactionStreet;
	}


	public void setAccidentLoactionStreet(String accidentLoactionStreet) {
	this.accidentLoactionStreet = accidentLoactionStreet;
	}


	public String getAccidentCity() {
	return accidentCity;
	}


	public void setAccidentCity(String accidentCity) {
	this.accidentCity = accidentCity;
	}


	public String getAccidentState() {
	return accidentState;
	}


	public void setAccidentState(String accidentState) {
	this.accidentState = accidentState;
	}


	public int getAccidentZip() {
	return accidentZip;
	}


	public void setAccidentZip(int accidentZip) {
	this.accidentZip = accidentZip;
	}


	public String getClaimType() {
	return claimType;
	}


	public void setClaimType(String claimType) {
	this.claimType = claimType;
	}


	public int getPolicyNumber() {
	return policyNumber;
	}


	public void setPolicyNumber(int policyNumber) {
	this.policyNumber = policyNumber;
	}


	@Override
	public String toString() {
	return "Claim [claimNumber=" + claimNumber + ", claimReason=" + claimReason + ", accidentLoactionStreet="
	+ accidentLoactionStreet + ", accidentCity=" + accidentCity + ", accidentState=" + accidentState
	+ ", accidentZip=" + accidentZip + ", claimType=" + claimType + ", policyNumber=" + policyNumber + "]";
	
	}

}
