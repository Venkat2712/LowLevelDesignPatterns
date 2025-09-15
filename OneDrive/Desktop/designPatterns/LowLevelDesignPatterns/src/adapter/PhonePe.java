package adapter;

import adapter.bankAdapters.BankAPI;

public class PhonePe {
	
	BankAPI bankApi;
	FastTagRecharge fastTagrecharge;
	PayBill payBill;
	
	public PhonePe(BankAPI bankAPI) {
		this.bankApi = bankAPI;
		fastTagrecharge = new FastTagRecharge();
		payBill = new PayBill();	
	}
	
	
	public void recharge() {
		fastTagrecharge.recharge(bankApi);
	}
	
	public void payingBill() {
		payBill.payBill(bankApi);
	}
	

}
