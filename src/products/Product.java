package products;

public abstract class Product {

	protected String productName;
	protected String barCode;
	protected double firstPrice;
	protected static final double TAX = 1.20;
	protected double finalPrice;

	public Product(String productName, String barCode, double firstPrice) {

		this.productName = productName;
		this.barCode = barCode;
		this.firstPrice = firstPrice;
	}

	public abstract void priceWithTax();

	@Override
	public String toString() {

		return "Product{" +
				"productName='" + productName + '\'' +
				", barCode='" + barCode + '\'' +
				", firstPrice=" + firstPrice +
				", finalPrice=" + finalPrice +
				'}';
	}
}
