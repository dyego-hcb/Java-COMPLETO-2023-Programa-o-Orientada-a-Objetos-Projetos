package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock()
	{
		return price * quantity;
	}
	public void addProducts(int quantity)
	{
		this.quantity += quantity; 
	}
	public void removeProducts(int quantity)
	{
		this.quantity -= quantity;
	}
	public String toString()
	{
		return ("DETAIS ABOUT PRODUTCT: \nNAME: " + this.name + "\nPRICE: R$ " + String.format("%.2f", this.price) + "\nQUANTITY: " + this.quantity + "\nVALUE TOTAL IN STOCK: R$ " + String.format("%.2f", totalValueInStock()));
	}
}
