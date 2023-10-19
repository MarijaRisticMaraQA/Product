package products;

public class Chocolate extends Product {

	private double weight;
	public Chocolate(String productName, String barCode, double firstPrice, double weight) {

		super(productName, barCode, firstPrice);
		this.weight = weight;
	}

	private double addingTax() {

		return firstPrice * TAX;
	}
	@Override
	public void priceWithTax() {

		finalPrice = addingTax();
		System.out.println("Chocolate {" +
				"ProductName: '" + productName + '\'' +
				", BarCode: '" + barCode + '\'' +
				", FirstPrice: " + firstPrice +
				", FinalPrice: " + finalPrice +
				", Weight: " + weight +
				'}');
	}
}
