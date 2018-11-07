
public class IPad extends Product {

	private boolean fourGPresence;
	
	/**
	 * Constructor
	 * @param name
	 * @param screensize
	 * @param processor
	 * @param fourGPresence
	 * @param color
	 * @param memory
	 * @param price
	 */
	public IPad(String name, double screensize, String processor, boolean fourGPresence, String color, String memory, int price) {
		super(name, screensize, processor, color, memory, price);
		this.fourGPresence = fourGPresence;
	}
	
	public boolean getFourGPresence() {
		return fourGPresence;
	}

	public String fourGToString() {
		String result;
		if(getFourGPresence()==true) {
			result = "with WiFi and 4G technology";
		}
		else {
			result = "with WiFi but no 4G technology";
		}
		return result;
	}
	
	public String toString() {
		String result = "";
		result += "Apple " + getName() + " with " + getMemory() + " of memory\n		an " + getProcessor() + " processor and " + getScreensize() + " inch screen\n		" + this.fourGToString() + "\n		" + getPrice() + " euros";   
		return result;
	}
	
	public String fileWriterToString() {
		String result = "";
		result = this.getName().toUpperCase() + ", " + this.getScreensize() + ", " + this.getProcessor() + ", " + Boolean.toString(this.getFourGPresence()).toUpperCase() + ", " + this.getColor().toUpperCase() + ", " + this.getMemory() + ", " + this.getPrice();
		return result;
	}
	
	public static void main(String[] args) {

	}

	

}
