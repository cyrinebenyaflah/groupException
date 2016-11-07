package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Product
 *
 */
@Entity

public class Product implements Serializable {

	
	private int idProduct;
	private int idSeller;
	private int idCategory;
	private String productPhoto;
	private int quatity;
	private String productName;
	private float estimationPrice;
	private DeliveryMan delivaryman;
	private Seller seller;
	private Expert expert;
	private static final long serialVersionUID = 1L;

	public Product() {
		super();
	}   
	@Id    
	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}   
	public int getIdSeller() {
		return this.idSeller;
	}

	public void setIdSeller(int idSeller) {
		this.idSeller = idSeller;
	}   
	public int getIdCategory() {
		return this.idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}   
	public String getProductPhoto() {
		return this.productPhoto;
	}

	public void setProductPhoto(String productPhoto) {
		this.productPhoto = productPhoto;
	}   
	public int getQuatity() {
		return this.quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}   
	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}   
	public float getEstimationPrice() {
		return this.estimationPrice;
	}

	public void setEstimationPrice(float estimationPrice) {
		this.estimationPrice = estimationPrice;
	}
@ManyToOne
	public DeliveryMan getDelivaryman() {
		return delivaryman;
	}
	public void setDelivaryman(DeliveryMan delivaryman) {
		this.delivaryman = delivaryman;
	}
	@ManyToOne
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	@ManyToOne
	public Expert getExpert() {
		return expert;
	}
	public void setExpert(Expert expert) {
		this.expert = expert;
	}
	
   
}
