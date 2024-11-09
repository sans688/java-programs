package com.company;

public class GroceryMart {
	private int custId;
	private String custName;
	private String custAddress;
	private int custPhone;
	private double AccBal;
	
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getCustId() {
		return this.custId;
	}
	
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustName() {
		return custName;
	}
	
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getCustAddress() {
		return custAddress;
	}
	
	public void setCustPhone(int custPhone) {
		this.custPhone = custPhone;
	}
	public int getCustPhone() {
		return custPhone;
	}
	
	public void setAccBal(double AccBal) {
		this.AccBal = AccBal;
	}
	public double getAccBal() {
		return AccBal;
	}
	
	public void shop(double amt) {
		if(amt <= AccBal) {
		double remBal = AccBal - amt;
		AccBal = remBal;
		System.out.println("Thanks for shopping now ur account has "+AccBal);
		}
		else {
			double lowAmt = amt - AccBal;
			System.out.println("you need to add more "+lowAmt+" Rs.");
		}
	}
	public void rechargeAcc(double recharge) {
		AccBal = AccBal + recharge;
		System.out.println("Amount is added successfully "+AccBal);
	}

}
