import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Product {

	private String name;
	private double screensize;
	private String processor;
	private String color;
	private String memory;
	private int price;
	
	/**
	 * This is the constructor
	 * @param name
	 * @param screensize
	 * @param processor
	 * @param color
	 * @param memory
	 * @param price
	 */
	public Product(String name, double screensize, String processor, String color, String memory, int price) {
		super();
		this.name = name;
		this.screensize = screensize;
		this.processor = processor;
		this.color = color;
		this.memory = memory;
		this.price = price;
	}
	
	/**
	 * This is the getter for name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * This is the getter for screen size
	 * @return screensize
	 */
	public double getScreensize() {
		return screensize;
	}
	
	/**
	 * This is the getter for processor
	 * @return processor
	 */
	public String getProcessor() {
		return processor;
	}
	
	/**
	 * This is the getter for color
	 * @return color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * This is the getter for memory
	 * @return memory
	 */
	public String getMemory() {
		return memory;
	}
	
	/**
	 * This is the getter for price
	 * @return price
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * This method reads in a single Product
	 * @param sc
	 * @return Product class of either iPhone or iPad
	 * @throws FileNotFoundException 
	 */
	public static Product read(Scanner sc) throws FileNotFoundException {
		String[] product = sc.nextLine().split(", ");
		if(product[0].contains("IPHONE")) {
			return new IPhone(product[0], Double.parseDouble(product[1]), product[2], product[3], product[4], product[5], Boolean.parseBoolean(product[6]), Integer.parseInt(product[7]));
		}
		else if(product[0].contains("IPAD")) {
			return new IPad(product[0], Double.parseDouble(product[1]), product[2], Boolean.parseBoolean(product[3]), product[4], product[5], Integer.parseInt(product[6]));
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	/**
	 * This is an abstract method to convert a product object to string
	 */
	public abstract String toString();
	
	/**
	 * This is an abstract method to convert a product object to string to write in the file
	 * @return nothing
	 */
	public abstract String fileWriterToString();
	
	/**
	 * This is the main method I used for testing throughout the program
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		IPhone iphone = new IPhone("iPhone 7", 4.7, "A10", "GSM", "black", "32GB", true, 700);
		System.out.println(iphone.toString());
		IPad ipad = new IPad("iPad air", 9.7, "A8", true, "Silver", "64GB", 400);
		System.out.println(ipad.toString());
		Scanner sc = new Scanner(System.in);
		System.out.println(read(sc));
	}

}
