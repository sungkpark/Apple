import java.util.Comparator;

public class Sort implements Comparator<Product> {
	
	@Override
	public int compare(Product p1, Product p2) {
		int x;
		if(p1.getPrice()>p2.getPrice()) {
			x = 1;
		}
		else if(p1.getPrice()==p2.getPrice()) {
			x = 0;
		}
		else {
			x = -1;
		}
		return x;
	}
	
}
