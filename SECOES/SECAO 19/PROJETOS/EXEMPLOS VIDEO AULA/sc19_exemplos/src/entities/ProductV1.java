package entities;

public class ProductV1 implements Comparable<ProductV1> {

	private String name;
	private Double price;
	
	public ProductV1(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

	@Override
	public int compareTo(ProductV1 other) {
		return price.compareTo(other.getPrice());
	}
}