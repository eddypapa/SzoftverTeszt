package hu.uni_miskolc.hu.shopingCart.model;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import hu.uni_miskolc.hu.shopingCart.exceptions.EmptyNameException;
import hu.uni_miskolc.hu.shopingCart.exceptions.NegativePriceException;
import hu.uni_miskolc.hu.shopingCart.exceptions.NegativeQuantityException;

public class CartTest {

	Item testitem;
	Cart testcart;
	
	@Before
	public void setUpCart() {
		testcart = new Cart(1, LocalDate.now());
	}
	
	@Test
	public void testQuantityOf() throws NegativePriceException, EmptyNameException, NegativeQuantityException {
		Item item1 = new Item(1, "Teszt1", 100, 1, "Ez egy teszt item.");
		Item item2 = new Item(1, "Teszt2", 100, 1, "Ez egy masik teszt item.");
		int expected = 2;
		
		testcart.addItem(item1);
		testcart.addItem(item2);
		
		assertEquals(expected, testcart.getQuantityOf(1) , 1e-10 );
	}
	
	@Test
	public void testTotalPrice() throws NegativePriceException, EmptyNameException, NegativeQuantityException {
		Item item1 = new Item(1, "Teszt1", 100, 1, "Ez egy teszt item.");
		Item item2 = new Item(1, "Teszt2", 100, 1, "Ez egy masik teszt item.");
		int expected = 200;
		
		testcart.addItem(item1);
		testcart.addItem(item2);
		
		assertEquals(expected, testcart.getTotalPice() , 1e-10 );
	}
	
	@Test
	public void testAddItem() throws NegativePriceException, EmptyNameException, NegativeQuantityException {
		Item item = new Item(1, "Teszt1", 100, 1, "Ez egy teszt item.");
		testcart.addItem(item);
	}
}
