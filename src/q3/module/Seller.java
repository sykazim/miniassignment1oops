package q3.module;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

public class Seller extends User {

	private static final Logger logger = Logger.getLogger(Seller.class.getName());

	private int sellerId;

	private List<Product> productList = new ArrayList<Product>();

	public void addProduct(Product product) {
		productList.add(product);
	}

	public void removeProduct(Product product) {
		productList.remove(product);
	}

	public void viewProducts() {
		productList.stream().forEach(product -> {
			logger.info(product.toString());
		});
	}

	@Override
	public int hashCode() {
		return Objects.hash(sellerId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return sellerId == other.sellerId;
	}

}
