package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Auction
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Auction implements Serializable {

	
	private int idAuction;
	private String auctionName;
	private java.util.Date dateDebut;
	private java.util.Date dateFin;
	private String auctionPhoto;
	private int saleAmount;
	private static final long serialVersionUID = 1L;

	public Auction() {
		super();
	}   
	@Id    
	public int getIdAuction() {
		return this.idAuction;
	}

	public void setIdAuction(int idAuction) {
		this.idAuction = idAuction;
	}   
	public String getAuctionName() {
		return this.auctionName;
	}

	public void setAuctionName(String auctionName) {
		this.auctionName = auctionName;
	} 
	@Column(name = "dateDebut")
	public Date getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}   
	@Column(name = "dateFin")
	public Date getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}   
	public String getAuctionPhoto() {
		return this.auctionPhoto;
	}

	public void setAuctionPhoto(String auctionPhoto) {
		this.auctionPhoto = auctionPhoto;
	}
	public int getSaleAmount() {
		return saleAmount;
	}
	public void setSaleAmount(int saleAmount) {
		this.saleAmount = saleAmount;
	}
   
	
}
