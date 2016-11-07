package tn.esprit.entities;

import java.io.Serializable;
import javax.persistence.*;
import tn.esprit.entities.Auction;

/**
 * Entity implementation class for Entity: AggregateDemandAuction
 *
 */
@Entity

public class AggregateDemandAuction extends Auction implements Serializable {

	
	private int quatityBeforeDrop;
	private float initialPrice;
	private int dropPrice;
	private static final long serialVersionUID = 1L;

	public AggregateDemandAuction() {
		super();
	}   
	public int getQuatityBeforeDrop() {
		return this.quatityBeforeDrop;
	}

	public void setQuatityBeforeDrop(int quatityBeforeDrop) {
		this.quatityBeforeDrop = quatityBeforeDrop;
	}   
	public float getInitialPrice() {
		return this.initialPrice;
	}

	public void setInitialPrice(float initialPrice) {
		this.initialPrice = initialPrice;
	}   
	public int getDropPrice() {
		return this.dropPrice;
	}

	public void setDropPrice(int dropPrice) {
		this.dropPrice = dropPrice;
	}
   
}
