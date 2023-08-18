package entities;

import java.sql.Date;

public class Order {
	
	private Date date;
	private ProductV2 product;
	
	public Order(Date date, ProductV2 product) {
		super();
		this.date = date;
		this.product = product;
		this.product.name = "TV";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ProductV2 getProduct() {
		return product;
	}

	public void setProduct(ProductV2 product) {
		this.product = product;
	}
	
}
