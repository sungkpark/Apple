
public class IPhone extends Product {

	private String modemType;
	private boolean threeDTouch;
	
	/**
	 * Constructor
	 * @param name
	 * @param screensize
	 * @param processor
	 * @param modemType
	 * @param color
	 * @param memory
	 * @param threeDTouch
	 * @param price
	 */
	public IPhone(String name, double screensize, String processor, String modemType, String color, String memory, boolean threeDTouch, int price) {
		super(name, screensize, processor, color, memory, price);
		this.modemType = modemType;
		this.threeDTouch = threeDTouch;
	}
	
	/**
	 * Getter method for modem type
	 * @return
	 */
	public String getModemType() {
		return modemType;
	}
	
	public boolean getThreeDTouch() {
		return threeDTouch;
	}
	
	public String toString() {
		String result = "";
		result += "Apple " + getName() + " with " + getMemory() + " of memory\n		an " + getProcessor() + " processor and " + getScreensize() + " inch screen\n		" + getPrice() + " euros";   
		return result;
	}

	public String fileWriterToString() {
		String result = "";
		result = this.getName().toUpperCase() + ", " + this.getScreensize() + ", " + this.getProcessor() + ", " + this.getModemType() + ", " + this.getColor().toUpperCase() + ", " + this.getMemory() + ", " + Boolean.toString(this.getThreeDTouch()).toUpperCase() + ", " + this.getPrice();
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
