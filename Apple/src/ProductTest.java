import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProductTest {
	
	private IPhone iphone;
	private IPad ipad;
	
	@Before
	public void setUp() {
		iphone = new IPhone("iphone 7", 4.7, "A10", "GSM", "black", "32GB", true, 400);
		ipad = new IPad("ipad mini", 6.7, "A8", true, "silver", "64GB", 400);
	}

	@Test
	public void testProduct() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetName() {
		assertTrue("Name should be iphone 7",iphone.getName()=="iphone 7");
		assertTrue("Name should be ipad mini",ipad.getName()=="ipad mini");
	}

	@Test
	public void testGetScreensize() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProcessor() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetColor() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMemory() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPrice() {
		fail("Not yet implemented");
	}

	@Test
	public void testRead() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testFileWriterToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

}
