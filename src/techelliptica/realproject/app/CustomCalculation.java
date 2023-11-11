package techelliptica.realproject.app;

import java.util.ArrayList;
import java.util.List;

public class CustomCalculation {

	public static List<Item> allItems = new ArrayList<Item>();
	public static void addItem(String itemName, double itemPrice, int ItemQuantity) {

		Item itemObject = new Item();
		itemObject.setItemName(itemName);
		itemObject.setItemPrice(itemPrice);
		itemObject.setItemQuantity(ItemQuantity);

		double totalPrice = calculateTotalItemAmount(itemPrice, ItemQuantity);
		itemObject.setTotalPrice(totalPrice);
		allItems.add(itemObject);
		//calculateAllItemAmount(totalPrice);
		CustomCalculation.totalPrice = CustomCalculation.totalPrice + totalPrice;
	}




	/*	
	 * #############################################################
	 * User need to write Code below this block
	 */



	public static double totalPrice = 0.0d;
	public static double amountReturn = 0.0d;
	public static double calculateTotalItemAmount(double itemPrice, int ItemQuantity) {
		// TODO - Write Code below to calculate total Item Amount

		return itemPrice*ItemQuantity;
	}


	public static void calculateAllItemAmount(double amount) {
		// TODO - Write Code to calculate Total Price


	}

	public static double getAmountReturnToCustomer(double amountGivenByCustomer) {
		// TODO - write code to calculate amount return from shopkeeper to customer
		amountReturn = amountGivenByCustomer - totalPrice;
		return amountReturn;
	}


	public static int[][] getCoinReturnToCustomer(double returnAmount) {
		int[][] returnCoin =new  int[11][2];

		// TODO - Write Code to calculate minimum Coin Return 
		// Here we need to create one 2D array. with n number of row and 2 column
		// First column (0 index) will have coin name (already created below) 
		// second column (1 index) will have number of coins  (you have to add these coin numbers)


		returnCoin[0][0] = 1;
		returnCoin[1][0] = 2;
		returnCoin[2][0] = 5;
		returnCoin[3][0] = 10;
		returnCoin[4][0] = 20;
		returnCoin[5][0] = 50;
		returnCoin[6][0] = 100;
		returnCoin[7][0] = 200;
		returnCoin[8][0] = 500;
		returnCoin[9][0] = 1000;
		returnCoin[10][0] = 2000;

		while(returnAmount != 0) {
			for(int i = 0; i <returnCoin.length ; i++) {
				if(returnCoin[i][0] > returnAmount) {
					returnCoin[i-1][1] = returnCoin[i-1][1] +1;
					returnAmount = returnAmount - returnCoin[i-1][0];
					break;
				}
			}
			
		}
		
		return returnCoin;
	}




}
