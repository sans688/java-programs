package java_prep;
//Calculate the quantity of petrol and 
//diesel in a budget of 1546.12 Rs according to respective prices 84.11, 74.91
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double petrol = 84.11;
		double diesel = 74.91;
		double wallet_budget = 1546.12;
		double quantity_petrol=wallet_budget/petrol;
		double quantity_diesel=wallet_budget/diesel;
		System.out.println("Quantity Petrol:"+quantity_petrol);
		System.out.println("Quantity Diesel:"+quantity_diesel);
		
		float petrol1 = 84.11f;
		float diesel1 = 74.91f;
		float wallet_budget1 = 1546.12f;
		float quantity_petrol1=wallet_budget1/petrol1;
		float quantity_diesel1=wallet_budget1/diesel1;
		System.out.println("Quantity Petrol:"+quantity_petrol1);
		System.out.println("Quantity Diesel:"+quantity_diesel1);
	}

}
