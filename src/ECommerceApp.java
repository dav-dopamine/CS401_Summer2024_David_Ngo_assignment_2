
public class ECommerceApp 
{
	public static void main(String[] args) 
	{
		
		
		ShoppingCart cart = new ShoppingCart();
		
		Books book1 = new Books("B1", "Eragon", 20.00, "Christopher Paolini", "Fantasy");
		Books book2 = new Books("B2", "The Fault in Our Stars", 15.00, "John Green", "Rommance");
		
		Electronics e1 = new Electronics("E1", "GPU", 1000.00, "NVIDIA GeForce RTX 3080", 12);
	    Electronics e2 = new Electronics("E2", "Smart phone", 899.00, "Iphone 15", 1);
	    
	    Clothes shirt1 = new Clothes("C1", "T-Shirt", 19.99, "L", "Cotton");
        Clothes shirt2 = new Clothes("C2", "Jeans", 39.99, "M", "Denim");
        
        
        cart.addCart(book1);
        cart.addCart(book2);
        cart.addCart(e1);
        cart.addCart(e2);
        cart.addCart(shirt1);
        cart.addCart(shirt2);
        
        // Display cart after adding items
        System.out.println();
        cart.displayCart();
        System.out.println();

        // removing electronics from the cart
        cart.removeCart(e1);
        cart.removeCart(e2);

        // Display cart after removing electronics
        System.out.println();
        cart.displayCart();
        System.out.println();

        // removing books from the cart
        cart.removeCart(book1);
        cart.removeCart(book2);

        // Display cart after removing books
        System.out.println();
        cart.displayCart();
        System.out.println();

        // adding electronics back to the cart
        cart.addCart(e1);
        cart.addCart(e2);

        // Displayu cart after adding electronics back
        System.out.println();
        cart.displayCart();
        System.out.println();
        
	}
}
