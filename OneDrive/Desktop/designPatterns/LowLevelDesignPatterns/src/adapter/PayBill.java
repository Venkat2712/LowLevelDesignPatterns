package adapter;

import adapter.bankAdapters.BankAPI;

public class PayBill {
	
	
	public void payBill(BankAPI bankAPi) {
		bankAPi.transferMoney();
		System.out.println("payed the Bill");
	}

}
