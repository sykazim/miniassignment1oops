package q3.module;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer extends User {

	private List<Order> orders;
	private ShoppingCart cart = new ShoppingCart();
	
	public void addToCart(Product product, int quantity) {
		cart.addProduct(product, quantity);
	}
	
	public void removeFromCart(Product product, int quantity) {
		cart.removeProduct(product, quantity);
	}
	
	public void viewCart() {
		cart.viewCart();
	}
	
	public void placeOrder() {
		List<CartItem> items = new ArrayList<>();
		Order order = new Order();
		order.setCustomer(this);
		order.setOrderDate(LocalDate.now());
		cart.getCartItems().stream().forEach(cartItem -> {
			items.add(cartItem);
		});
		order.setItems(items);
		orders.add(order);

		cart.setCartItems(new ArrayList<CartItem>());
	}
}
