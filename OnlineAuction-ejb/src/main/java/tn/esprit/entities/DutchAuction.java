package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.*;
import tn.esprit.entities.Auction;

/**
 * Entity implementation class for Entity: DutchAuction
 *
 */
@Entity

public class DutchAuction extends Auction implements Serializable {

	
	private float initialPrice;
	private int timeReduce;
	private static final long serialVersionUID = 1L;

	public DutchAuction() {
		super();
	}   
	public float getInitialPrice() {
		return this.initialPrice;
	}

	public void setInitialPrice(float initialPrice) {
		this.initialPrice = initialPrice;
	}
	public int getTimeReduce() {
		return timeReduce;
	}
	public void setTimeReduce(int timeReduce) {
		this.timeReduce = timeReduce;
	}
	
	
   
}
