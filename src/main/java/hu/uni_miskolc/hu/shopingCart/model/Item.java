package hu.uni_miskolc.hu.shopingCart.model;

import hu.uni_miskolc.hu.shopingCart.exceptions.EmptyNameException;
import hu.uni_miskolc.hu.shopingCart.exceptions.NegativePriceException;
import hu.uni_miskolc.hu.shopingCart.exceptions.NegativeQuantityException;

public class Item {
	
	private int id;
	private String name;
	private int price;
	private int quantity;
	private String description;
	
	public Item(int id, String name, int price, int quantity, String description) throws NegativePriceException, EmptyNameException, NegativeQuantityException {
		super();
		this.id = id;
		setName(name);
		setPrice(price);
		setQuantity(quantity);
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws EmptyNameException {
		if (name.isEmpty()) {
			throw new EmptyNameException();
		}
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) throws NegativePriceException {
		if (price < 0) {
			throw new NegativePriceException();
		}
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) throws NegativeQuantityException {
		if (quantity < 0) {
			throw new NegativeQuantityException();
		}
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", description="
				+ description + "]";
	}	
}
