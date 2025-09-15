package adapter;

import java.util.Scanner;

import adapter.bankAdapters.BankAPI;
import adapter.bankAdapters.YesBankAPIAdapter;
import adapter.bankFactory.*;

public class Client {
	
	
	public static void main(String Args[]) {
//		YesBankAPIAdapter ybAdapter = new YesBankAPIAdapter();
//		ybAdapter.checkBalance();
//		ybAdapter.transferMoney();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Bank name YesBank or ICICI :");
		String name = sc.nextLine();
		BankAPI bankApi = BankFactory.getBankByName(name);
		
		PhonePe phonepay = new PhonePe(bankApi);
		phonepay.recharge();
		phonepay.payingBill();
		
	}

}
