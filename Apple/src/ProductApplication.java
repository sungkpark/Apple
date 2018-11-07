import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class ProductApplication {
	public static void main(String[] args) throws IOException {
		int option;
		ProductCatalog pc = new ProductCatalog();
		pc = ProductCatalog.read("apple.txt");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(
					"Please make your choice:\n" + "1 - Show the entire Apple catalogue\n" + "2 – Add a new iPhone\n"
							+ "3 – Add a new iPad\n" + "4 - Show the entire Apple catalogue sorted by product\n"
							+ "5 – Show the entire Apple catalogue sorted by price (low à high)\n"
							+ "6 – Write to file\n" + "7 – Stop the program");
			option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println(pc.toString());
				break;
			case 2:
				sc.nextLine();
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Screen size: ");
				double screensize = sc.nextDouble();
				sc.nextLine();
				System.out.println("Processor: ");
				String processor = sc.nextLine();
				System.out.println("Modem type: ");
				String modemType = sc.nextLine();
				System.out.println("Color: ");
				String color = sc.nextLine();
				System.out.println("Storage: ");
				String memory = sc.nextLine();
				System.out.println("3D Touch presence: ");
				Boolean threeDTouch = sc.nextBoolean();
				System.out.println("Price: ");
				int price = sc.nextInt();
				IPhone iphone = new IPhone(name, screensize, processor, modemType, color, memory, threeDTouch, price);
				pc.addProduct(iphone);
				System.out.println("An iphone has been added to the catalog\n");
				break;
			case 3:
				sc.nextLine();
				System.out.println("Name: ");
				String name2 = sc.nextLine();
				System.out.println("Screen size: ");
				double screensize2 = sc.nextDouble();
				sc.nextLine();
				System.out.println("Processor: ");
				String processor2 = sc.nextLine();
				System.out.println("4G presence: ");
				Boolean fourGPresence = sc.nextBoolean();
				sc.nextLine();
				System.out.println("Color: ");
				String color2 = sc.nextLine();
				System.out.println("Storage: ");
				String memory2 = sc.nextLine();
				System.out.println("Price: ");
				int price2 = sc.nextInt();
				IPad ipad = new IPad(name2, screensize2, processor2, fourGPresence, color2, memory2, price2);
				pc.addProduct(ipad);
				System.out.println("An ipad has been added to the catalog\n");
				break;
			case 4:
				ProductCatalog productList = new ProductCatalog();
				for (int i = 0; i < pc.products.size(); i++) {
					if (pc.products.get(i).getName().contains("IPHONE")) {
						productList.addProduct((pc.products.get(i)));
					}
				}
				for (int i = 0; i < pc.products.size(); i++) {
					if (pc.products.get(i).getName().contains("IPAD")) {
						productList.addProduct((pc.products.get(i)));
					}
				}
				System.out.println(productList.toString());
				break;
			case 5:
				pc.sort();
				System.out.println(pc.toString());
				break;
			case 6:
				System.out.println("Catalog rewritten with new products\n");
				Writer fileWriter = new FileWriter(new File("apple.txt"));
				fileWriter.write(pc.fileWriterToString());
				fileWriter.close();
				break;
			case 7:
				return;
			}
		}
	}
}
