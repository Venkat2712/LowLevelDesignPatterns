package adapter;

import adapter.bankAdapters.BankAPI;

public class FastTagRecharge {
	
	public void recharge(BankAPI bankApi) {
		bankApi.transferMoney();
		System.out.println("recharged");
	
	}
	

}
