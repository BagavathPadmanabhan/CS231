package com.assignment.model;

import com.assignment.iface.Payable;
import com.assignment.impclass.Company;

public class PhoneCompany extends Company implements Payable  {

	@Override
	public double calculateTax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return 0;
	}


}
