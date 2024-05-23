package com.first;

class BankDetails{
	private String account_holder;
	private int CVV;
	private double blance;
	private int otp;
	public String getAccount_holder() {
		return account_holder;
	}
	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}
	public int getCVV() {
		return CVV;
	}
	public void setCVV(int cVV) {
		CVV = cVV;
	}
	public double getBlance() {
		return blance;
	}
	public void setBlance(double blance) {
		this.blance = blance;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	
}

public class EncapsulationDemo {
	public static void main(String[] args) {
		BankDetails bankdetails = new BankDetails();
		bankdetails.setAccount_holder("Shan khan");
		bankdetails.setCVV(420);
		bankdetails.setBlance(129000);
		bankdetails.setOtp(345);
		
		System.out.println(bankdetails.getAccount_holder());
		System.out.println(bankdetails.getCVV());
		System.out.println(bankdetails.getBlance());
		System.out.println(bankdetails.getOtp());
	}

}
