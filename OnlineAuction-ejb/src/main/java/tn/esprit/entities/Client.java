package tn.esprit.entities;

import java.io.Serializable;
import javax.persistence.*;
import tn.esprit.entities.User;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity

public class Client extends User implements Serializable {

	
	private int ticksAmount;
	
	private static final long serialVersionUID = 1L;

	public Client() {
		super();
	}   
	public int getTicksAmount() {
		return this.ticksAmount;
	}

	public void setTicksAmount(int ticksAmount) {
		this.ticksAmount = ticksAmount;
	}
   
}
