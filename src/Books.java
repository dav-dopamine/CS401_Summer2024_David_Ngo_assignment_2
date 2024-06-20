
public class Books extends Products
{
	private String author;
	private String genre;
	
	public Books(String id, String name, double price, String author, String genre)
	{
		super(id, name, price); 
		this.author = author;
		this.genre = genre; 
		
	}
	
	public String getAuthor()
	{
		return author; 
	}
	
	public String getGenre()
	{
		return genre; 
	}
	
	public void displayProduct() 
	{
		super.displayProduct();
		System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        
	}
	
}
