package tn.esprit.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import tn.esprit.entities.User;

/**
 * Entity implementation class for Entity: Expert
 *
 */
@Entity

public class Expert extends User implements Serializable {

	
	private int numberAdvice;
	private List<Product> products;
	
	@OneToMany(mappedBy="expert")
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	private static final long serialVersionUID = 1L;

	public Expert() {
		super();
	}   
	public int getNumberAdvice() {
		return this.numberAdvice;
	}

	public void setNumberAdvice(int numberAdvice) {
		this.numberAdvice = numberAdvice;
	}
	
 
	
	
}
