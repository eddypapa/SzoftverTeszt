package hu.uni_miskolc.hu.shopingCart.model;

import org.junit.Before;
import org.junit.Test;

import hu.uni_miskolc.hu.shopingCart.exceptions.EmptyNameException;
import hu.uni_miskolc.hu.shopingCart.exceptions.NegativePriceException;
import hu.uni_miskolc.hu.shopingCart.exceptions.NegativeQuantityException;

public class ItemTest {
	
	Item testitem;
	
	@Before
	public void setUpItem() throws NegativePriceException, EmptyNameException, NegativeQuantityException {
		testitem = new Item(1, "Teszt", 100, 1, "Ez egy teszt item.");
	}

	@Test(expected = EmptyNameException.class)
	public void testEmptyNameExceptionSetMethod() throws EmptyNameException {
		testitem.setName("");
	}
	
	@Test(expected = EmptyNameException.class)
	public void testEmptyNameExceptionConstructor() throws EmptyNameException, NegativePriceException, NegativeQuantityException {
		Item item = new Item(1, "", 100, 1, "Ez egy teszt item.");
	}
	
	@Test(expected = NegativePriceException.class)
	public void testNegativePriceExceptionSetMethod() throws NegativePriceException {
		testitem.setPrice(-1);
	}
	
	@Test(expected = NegativePriceException.class)
	public void testNegativePriceExceptionConstructor() throws NegativePriceException, EmptyNameException, NegativeQuantityException {
		Item item = new Item(1, "Teszt", -1, 1, "Ez egy teszt item.");
	}
	
	@Test(expected = NegativeQuantityException.class)
	public void testNegativeQuantityExceptionSetMethod() throws NegativeQuantityException {
		testitem.setQuantity(-1);
	}
	
	@Test(expected = NegativeQuantityException.class)
	public void testNegativeQuantityExceptionConstructor() throws NegativeQuantityException, NegativePriceException, EmptyNameException {
		Item item = new Item(1, "Teszt", 100, -1, "Ez egy teszt item.");
	}

}
