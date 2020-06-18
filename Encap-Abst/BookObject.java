package PRP;
class Author
{
	String name;
	String email;
	char gender;
	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
}
class Book extends Author{
	String name;
	String bookName;
	double price;
	int qtyInStock;
	public Book(String name, String email, char gender,String bookName,double price,int qtyInStock) 
	{
		super(name, email, gender);
		this.bookName=bookName;
		this.price=price;
		this.qtyInStock=qtyInStock;
		
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", qtyIntStock=" + qtyInStock + "]";
	}
}
public class BookObject {
	public static void main(String[] args)
	{
		Book b=new Book("Chithalai Chathanar","Abc@gmail.com",'M',"Manimegalai", 25000.00,300);
		System.out.println("Author:"+b.getName());
		System.out.println("Email:"+b.getEmail());
		System.out.println("Gender:"+b.getGender());
		System.out.println("BookName:"+b.getBookName());
		System.out.println("Price:"+b.getPrice());
		System.out.println("Quantity in stock:"+b.getQtyInStock());
		
	}

}
