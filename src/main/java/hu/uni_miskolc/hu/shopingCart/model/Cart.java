package hu.uni_miskolc.hu.shopingCart.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private int id;
	private List<Item> items;
	private LocalDate time;
	
	public Cart(int id, LocalDate time) {
		super();
		this.id = id;
		this.items = new ArrayList<Item>();
		this.time = time;
	}
	
	public Cart(int id) {
		super();
		this.id = id;
		this.time = LocalDate.now();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getTime() {
		return time;
	}
	public void setTime(LocalDate time) {
		this.time = time;
	}
	public List<Item> getItems() {
		return items;
	}
	
	public void addItem (Item item) {
		items.add(item);
	}
	
	public int getTotalPice () {
		int sum = 0;
		for (Item i : items) {
			sum += i.getPrice();
		}
		return sum;
	}
	
	public int getQuantityOf (int id) {
		int quantityAll = 0;
		for (Item i : items) {
			if (i.getId() == id) {
				quantityAll += i.getQuantity();
			}
		}
		return quantityAll;
	}
}
