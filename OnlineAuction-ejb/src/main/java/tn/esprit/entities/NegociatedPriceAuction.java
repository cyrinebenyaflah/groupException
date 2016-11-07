package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.*;
import tn.esprit.entities.Auction;

/**
 * Entity implementation class for Entity: NegociatedPriceAuction
 *
 */
@Entity

public class NegociatedPriceAuction extends Auction implements Serializable {

	
	private int timer;
	private int minAddingAmount;
	private float minSellingPrice;
	private static final long serialVersionUID = 1L;

	public NegociatedPriceAuction() {
		super();
	}  
	
	
	public int getTimer() {
		return timer;
	}


	public void setTimer(int timer) {
		this.timer = timer;
	}


	public int getMinAddingAmount() {
		return this.minAddingAmount;
	}

	public void setMinAddingAmount(int minAddingAmount) {
		this.minAddingAmount = minAddingAmount;
	}   
	public float getMinSellingPrice() {
		return this.minSellingPrice;
	}

	public void setMinSellingPrice(float minSellingPrice) {
		this.minSellingPrice = minSellingPrice;
	}
   
}
