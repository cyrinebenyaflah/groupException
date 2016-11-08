package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Subject
 *
 */
@Entity

public class Subject implements Serializable {

	
	private int idSubject;
	private String subjectName;
	private String note;
	private String content;
	private java.util.Date dateAdded;
	private List<Comment> comments;
	private Client client;
	private Seller seller;
	private static final long serialVersionUID = 1L;

	public Subject() {
		super();
	}   
	@Id    
	public int getIdSubject() {
		return this.idSubject;
	}

	public void setIdSubject(int idSubject) {
		this.idSubject = idSubject;
	}   
	public String getSubjectName() {
		return this.subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}   
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}   
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	@Column(name = "dateAdded")
	public java.util.Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(java.util.Date dateAdded) {
		this.dateAdded = dateAdded;
	}
	@OneToMany(mappedBy="subject")
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
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
