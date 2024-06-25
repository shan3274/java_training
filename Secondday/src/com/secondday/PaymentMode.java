package com.secondday;

public class PaymentMode {
	
	public String process_payment(String mode1,String mode2) {
		return "Selected "+ mode1 +"/"+mode2;
	}
	public String process_payment(String mode3) {
		return "Selected " + mode3;
	}

	public static void main(String[] args) {
		PaymentMode paymentMode = new PaymentMode();
		   
		System.out.println(paymentMode.process_payment("digital payment"));
	}
}
