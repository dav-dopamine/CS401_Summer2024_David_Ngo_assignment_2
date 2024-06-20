
public class Electronics extends Products
{
	private String brand;
	private int warranty; 
	
	public Electronics(String id, String name, double price, String brand, int warranty)
	{
		super(id, name, price); 
		this.brand = brand;
		this.warranty = warranty; 
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public int getWarranty()
	{
		return warranty; 
	}
	
	public void displayProduct() 
	{
		super.displayProduct();
		System.out.println("Brand: " + brand);
        System.out.println("Warranty Period: " + warranty + " months");
        
	}
}
