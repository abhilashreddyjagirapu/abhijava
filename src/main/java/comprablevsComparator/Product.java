package comprablevsComparator;
//
//Create a class named Product with variables like weight, price, and id.
//Implement the Comparable interface to compare products based on their price.


public class Product implements Comparable<Product>
{
	
	private float weight;
	private double price;
	private int id;
	

	

	public Product(float weight, double price, int id) {
		
		this.weight = weight;
		this.price = price;
		this.id = id;
	}




	public float getWeight() {
		return weight;
	}




	public void setWeight(float weight) {
		this.weight = weight;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	
	public int compareTo(Product o) {
		
		if(this.price > o.price ) return 1;
        else if(this.price < o.price) return -1;
        return 0;
		
	}
	
	
	public static void main(String[] args) {
		
		Product p1=new Product(79.2f,45,101);
		Product p2=new Product(79.2f,37,102);
		
		int result = p1.compareTo(p2);
		
		if(result == 0)
			System.out.println("Both Are having same Price");
		else if(result>0)
		System.out.println("p1 price is more than p2");
		else
			System.out.println("p2 price is more than p1");
		
	}
	

}
