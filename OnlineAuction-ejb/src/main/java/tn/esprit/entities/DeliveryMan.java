package tn.esprit.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import tn.esprit.entities.User;

/**
 * Entity implementation class for Entity: DeliveryMan
 *
 */
@Entity

public class DeliveryMan extends User implements Serializable {

	
	private int quatityProduct;
	private List<Product> products;
	
@OneToMany(mappedBy="delivaryman")
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	private static final long serialVersionUID = 1L;

	public DeliveryMan() {
		super();
	}   
	public int getQuatityProduct() {
		return this.quatityProduct;
	}

	public void setQuatityProduct(int quatityProduct) {
		this.quatityProduct = quatityProduct;
	}
	
	
	
}
