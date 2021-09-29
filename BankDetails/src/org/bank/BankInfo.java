package org.bank;

public class BankInfo extends AxisBank{


	public void saving()
	{
		System.out.println("Savings Account Created");
	}

	public void fixed()
	{
		System.out.println("Fixed Deposit Created");
	}

	public static void main(String[] args) {

		BankInfo bankinfo = new BankInfo();
		bankinfo.saving();
		bankinfo.fixed();
		bankinfo.deposit();
	}
}
