package adapter.bankAdapters;

import adapter.externalBankAPI.ICICIBankApi;

public class ICICIBankAdapter implements BankAPI{

	
	ICICIBankApi iciciBank = new ICICIBankApi();
	@Override
	public void checkBalance() {
		iciciBank.balanceCheck();
		
	}

	@Override
	public void transferMoney() {
		iciciBank.sendMoney();
		
	}

}
