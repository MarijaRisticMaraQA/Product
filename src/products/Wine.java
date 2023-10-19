package products;

public class Wine extends Product {

	private double weight;
	private static final double ADDITIONAL_TAX = 1.10;
	public Wine(String productName, String barCode, double firstPrice, double weight) {

		super(productName, barCode, firstPrice);
		this.weight = weight;
	}

	@Override
	public void priceWithTax() {

		finalPrice = priceWithAdditionalTax();

		System.out.println("Wine {" +
				"ProductName: '" + productName + '\'' +
				", BarCode: '" + barCode + '\'' +
				", FirstPrice: " + firstPrice +
				", FinalPrice: " + finalPrice +
				", Weight: " + weight +
				'}');
	}

	private double priceWithAdditionalTax() {

		double priceWithRegularTax = firstPrice * TAX;

		return priceWithRegularTax * ADDITIONAL_TAX;
	}
}
