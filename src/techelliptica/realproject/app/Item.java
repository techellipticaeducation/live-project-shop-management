package techelliptica.realproject.app;

public class Item {
	
	private String itemName;
	private double ItemPrice;
	private int ItemQuantity;
	private double totalPrice;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return ItemPrice;
	}
	public void setItemPrice(double itemPrice) {
		ItemPrice = itemPrice;
	}
	public int getItemQuantity() {
		return ItemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		ItemQuantity = itemQuantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	
}
