package adapter.bankAdapters;

import adapter.externalBankAPI.YesBankAPI;

public class YesBankAPIAdapter implements BankAPI {
	
	YesBankAPI yb = new YesBankAPI();

	@Override
	public void checkBalance() {
		yb.getBalance();

	}

	@Override
	public void transferMoney() {
		yb.moneyTransfer();
		
	}
	

}
