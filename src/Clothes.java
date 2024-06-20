
public class Clothes extends Products
{
	private String size;
	private String material;
	
	public Clothes(String id, String name, double price, String size, String material)
	{
		super(id, name, price); 
		this.size = size;
		this.material = material; 
	}
	
	
	public String getSize()
	{
		return size; 
	}
	
	public String getMaterial()
	{
		return material;
	}
	
	public void displayProduct() 
	{
		super.displayProduct();
		System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        
	}
}
