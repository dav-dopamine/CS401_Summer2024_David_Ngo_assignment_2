
public class Products 
{
	
	private String id; 
	private String name;
	private double price; 
	
	
	public Products(String id, String name, double price)
	{
		this.id = id;
		this.name = name; 
		this.price = price; 
	}
	
	public String getID()
	{
		return id; 
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price; 
	}
	
	public void displayProduct() 
	{
		System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: $" + price);
	}
	
}
