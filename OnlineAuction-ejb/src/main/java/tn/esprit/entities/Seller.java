package tn.esprit.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import tn.esprit.entities.User;

/**
 * Entity implementation class for Entity: Seller
 *
 */
@Entity

public class Seller extends User implements Serializable {

	
	private int numberProductSold;
	private List<Product> products;
	
	@OneToMany(mappedBy="seller")
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	private static final long serialVersionUID = 1L;

	public Seller() {
		super();
	}   
	public int getNumberProductSold() {
		return this.numberProductSold;
	}

	public void setNumberProductSold(int numberProductSold) {
		this.numberProductSold = numberProductSold;
	}
	
   
}
