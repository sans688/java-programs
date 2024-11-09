package com.company;

public class GroceryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroceryMart myAccount = new GroceryMart();
        myAccount.setCustName("Manish");
        myAccount.setAccBal(500.52);
        myAccount.setCustId(12345);
        myAccount.setCustPhone(98754356);
        myAccount.setCustAddress("India");

        myAccount.shop(498.52);
        myAccount.shop(100);

        myAccount.rechargeAcc(700);
        myAccount.shop( 670);
    
	}

}
