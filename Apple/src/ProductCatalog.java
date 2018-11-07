 import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductCatalog {
	List<Product> products;
	
	public ProductCatalog() {
		 products = new ArrayList<Product>();
	}
	
	public void addProduct(Product p) {
		products.add(p);
	}
	
	public static ProductCatalog read(String fileName) throws FileNotFoundException{
		try {
			File file = new File(fileName);
			ProductCatalog pc = new ProductCatalog();
			int x = 0;
			Scanner sc = new Scanner(file);
			while(x==0) {
				pc.addProduct(Product.read(sc));
				if(!sc.hasNextLine()) {
					x++;
				}
			}
			return pc;
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException();
		}
	}
	
	public String toString() {
		String result = "";
		for(Product p: products) {
			result += p + "\n";
		}
		return result;
	}
	
	public String fileWriterToString() {
		String result = "";
		for(Product p: products) {
			result += p.fileWriterToString() + "\n";
		}
		return result;
	}
	
	public void sort() {
		products.sort(new Sort());
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		ProductCatalog pc = new ProductCatalog();
		pc = ProductCatalog.read("apple.txt");
		//System.out.println(pc.toString());	
		pc.sort();
		System.out.println(pc.toString());
	}
}
