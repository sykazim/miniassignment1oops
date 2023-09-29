package q3.module;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ShoppingCart {
	
	private static final Logger logger = Logger.getLogger(ShoppingCart.class.getName());

	private List<CartItem> cartItems = new ArrayList<>();

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public void addProduct(Product product, int quantity) {
		CartItem cartItem = new CartItem(product, quantity);
		if (cartItems.contains(cartItem)) {
			int indexOf = cartItems.indexOf(cartItem);
			cartItem = cartItems.get(indexOf);
			cartItems.remove(cartItem);
			cartItem.setQuantity(cartItem.getQuantity() + quantity);
			cartItems.add(cartItem);
		} else {
			cartItems.add(cartItem);
		}
	}
	
	public void removeProduct(Product product, int quantity) {
		CartItem cartItem = new CartItem(product, quantity);
		if (cartItems.contains(cartItem)) {
			int indexOf = cartItems.indexOf(cartItem);
			cartItem = cartItems.get(indexOf);
			cartItems.remove(cartItem);
			if (cartItem.getQuantity() - quantity > 0) {
				cartItem.setQuantity(cartItem.getQuantity() - quantity);
				cartItems.add(cartItem);
			}
		} else {
			cartItems.add(cartItem);
		}
	}
	
	public void viewCart() {
		cartItems.stream().forEach(cartItem -> {
			logger.info(cartItem.toString());
		});
	}

}
