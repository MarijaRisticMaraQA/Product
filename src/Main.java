import products.Chocolate;
import products.Product;
import products.Wine;

public class Main {

	public static void allProducts(Product[] products) {

		for (int i = 0; i < products.length; i++) {

			products[i].priceWithTax();
		}
	}
	public static void main(String[] args) {

		Product chocolate = new Chocolate("Sweet Dark Night", "123-456-789", 100, 90);
		Product wine = new Wine("Black Magic Wine", "987-654-321", 500, 0.75);

		Product [] products = {chocolate, wine};
		allProducts(products);
	}
}