package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Comment
 *
 */
@Entity

public class Comment implements Serializable {

	
	private int idComment;
	private String content;
	private String note;
	private java.util.Date date;
	private Subject subject;
	private Client client;
	private Seller seller;
	private static final long serialVersionUID = 1L;

	public Comment() {
		super();
	}   
	@Id    
	public int getIdComment() {
		return this.idComment;
	}

	public void setIdComment(int idComment) {
		this.idComment = idComment;
	}   
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}   
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	@ManyToOne
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@ManyToOne
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	@ManyToOne
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
   
	
}
