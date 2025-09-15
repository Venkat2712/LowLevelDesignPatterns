package adapter.bankFactory;

import adapter.bankAdapters.BankAPI;
import adapter.bankAdapters.ICICIBankAdapter;
import adapter.bankAdapters.YesBankAPIAdapter;

public class BankFactory {
	
	
	public static BankAPI getBankByName(String name) {
		BankAPI bankApi = null;
		if(name.equals("ICICI")) {
			bankApi = new ICICIBankAdapter();
		}
		else if(name.equals("YesBank")) {
			bankApi = new YesBankAPIAdapter();
		}
		
		return bankApi;
		
	}

}
