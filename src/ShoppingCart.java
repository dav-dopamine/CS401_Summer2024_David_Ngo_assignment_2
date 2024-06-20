
import java.util.ArrayList;
import java.util.List; 


public class ShoppingCart 
{
	private List<Products>cart; 
	
	public ShoppingCart()
	{
		this.cart = new ArrayList<>(); 
	}
	
	public void addCart(Products product)
	{
		cart.add(product); 
		System.out.println(product.getName() + " added to cart.");
	}
	
	public void removeCart(Products product)
	{
		cart.remove(product); 
		System.out.println(product.getName() + " removed from cart.");

	}
	
	public void displayCart() 
	{
		double totalCost = 0.0;
		System.out.println("Cart items: ");
		
		for(int i = 0; i < cart.size(); i++)
		{
			Products product = cart.get(i);
	        product.displayProduct();
	        totalCost += product.getPrice();
	        System.out.println();
		}
		System.out.printf("Total Price: $%.2f%n", totalCost);
	}
	
}
