package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.*;
import tn.esprit.entities.Auction;

/**
 * Entity implementation class for Entity: EnglishAuction
 *
 */
@Entity

public class EnglishAuction extends Auction implements Serializable {

	
	private int timer;
	private float minAddingAmount;
	private static final long serialVersionUID = 1L;

	public EnglishAuction() {
		super();
	}   
	

	public int getTimer() {
		return timer;
	}


	public void setTimer(int timer) {
		this.timer = timer;
	}


	public float getMinAddingAmount() {
		return this.minAddingAmount;
	}

	public void setMinAddingAmount(float minAddingAmount) {
		this.minAddingAmount = minAddingAmount;
	}
   
}
