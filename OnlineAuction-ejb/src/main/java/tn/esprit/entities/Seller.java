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
	private List<Auction> auctions;
    private List<Subject> subjects;
    private List<Comment> comments;
    
    @OneToMany(mappedBy="seller")
    public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	@OneToMany(mappedBy="seller")
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
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
	@OneToMany(mappedBy="seller")
	public List<Auction> getAuctions() {
		return auctions;
	}
	public void setAuctions(List<Auction> auctions) {
		this.auctions = auctions;
	}
	
   
}
