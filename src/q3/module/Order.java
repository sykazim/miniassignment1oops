package q3.module;

import java.time.LocalDate;
import java.util.List;

public class Order {

	private List<CartItem> items;
	
	private Customer customer;
	
	private LocalDate orderDate;

	public List<CartItem> getItems() {
		return items;
	}

	public void setItems(List<CartItem> items) {
		this.items = items;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	
	
	public double getTotalCost() {
		double totalCost = 0.0;
		for (CartItem item : items) {
			totalCost += item.getProduct().getPrice() * item.getQuantity();
		}

		return totalCost;
	}

	@Override
	public String toString() {
		return "Order [items=" + items + ", customer=" + customer + ", orderDate=" + orderDate + ", getTotalCost()="
				+ getTotalCost() + "]";
	}
	
	
	
}
