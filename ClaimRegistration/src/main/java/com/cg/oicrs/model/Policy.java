package com.cg.oicrs.model;

public class Policy {

	private long policyNumber;
	private float policyPremium;
	public int accountNumber;
	
	
	public long getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(long l) {
		this.policyNumber = l;
	}
	public float getPolicyPremium() {
		return policyPremium;
	}
	public void setPolicyPremium(float policyPremium) {
		this.policyPremium = policyPremium;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Policy() {
		// TODO Auto-generated constructor stub
	}
	public Policy(int policyNumber, float policyPremium, int accountNumber) {
		super();
		this.policyNumber = policyNumber;
		this.policyPremium = policyPremium;
		this.accountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "Policy [policyNumber=" + policyNumber + ", policyPremium=" + policyPremium + ", accountNumber="
				+ accountNumber + "]";
	}
	

}
