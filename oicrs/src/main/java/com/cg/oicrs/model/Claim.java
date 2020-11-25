package com.cg.oicrs.model;

public class Claim {

	private int claimNumber;
	private String claimReason;
	private String accidentLocationStreet;
	private String accidentCity;
	private String accidentState;
	private int accidentZip;
	private String claimType;
	private int policyNumber;
	
	

	
	public Claim(int claimNumber, String claimReason, String accidentLocationStreet, String accidentCity,
			String accidentState, int accidentZip, String claimType, int policyNumber) {
		super();
		this.claimNumber = claimNumber;
		this.claimReason = claimReason;
		this.accidentLocationStreet = accidentLocationStreet;
		this.accidentCity = accidentCity;
		this.accidentState = accidentState;
		this.accidentZip = accidentZip;
		this.claimType = claimType;
		this.policyNumber = policyNumber;
	}


	public Claim() {
		// TODO Auto-generated constructor stub
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


	public String getAccidentLocationStreet() {
		return accidentLocationStreet;
	}


	public void setAccidentLocationStreet(String accidentLocationStreet) {
		this.accidentLocationStreet = accidentLocationStreet;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accidentCity == null) ? 0 : accidentCity.hashCode());
		result = prime * result + ((accidentLocationStreet == null) ? 0 : accidentLocationStreet.hashCode());
		result = prime * result + ((accidentState == null) ? 0 : accidentState.hashCode());
		result = prime * result + accidentZip;
		result = prime * result + claimNumber;
		result = prime * result + ((claimReason == null) ? 0 : claimReason.hashCode());
		result = prime * result + ((claimType == null) ? 0 : claimType.hashCode());
		result = prime * result + policyNumber;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Claim other = (Claim) obj;
		if (accidentCity == null) {
			if (other.accidentCity != null)
				return false;
		} else if (!accidentCity.equals(other.accidentCity))
			return false;
		if (accidentLocationStreet == null) {
			if (other.accidentLocationStreet != null)
				return false;
		} else if (!accidentLocationStreet.equals(other.accidentLocationStreet))
			return false;
		if (accidentState == null) {
			if (other.accidentState != null)
				return false;
		} else if (!accidentState.equals(other.accidentState))
			return false;
		if (accidentZip != other.accidentZip)
			return false;
		if (claimNumber != other.claimNumber)
			return false;
		if (claimReason == null) {
			if (other.claimReason != null)
				return false;
		} else if (!claimReason.equals(other.claimReason))
			return false;
		if (claimType == null) {
			if (other.claimType != null)
				return false;
		} else if (!claimType.equals(other.claimType))
			return false;
		if (policyNumber != other.policyNumber)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Claim [claimNumber=" + claimNumber + ", claimReason=" + claimReason + ", accidentLocationStreet="
				+ accidentLocationStreet + ", accidentCity=" + accidentCity + ", accidentState=" + accidentState
				+ ", accidentZip=" + accidentZip + ", claimType=" + claimType + ", policyNumber=" + policyNumber + "]";
	}
	
	
	
	
	
	
	
}
