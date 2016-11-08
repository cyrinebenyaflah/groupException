package tn.esprit.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import tn.esprit.entities.User;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity

public class Client extends User implements Serializable {

	
	private int ticksAmount;
	private List<Auction> auctions;
	private List<Quiz> quiz;
	private List<Subject> subjects;
	private List<Comment> comments;
	
	@OneToMany(mappedBy="client")
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
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
	@ManyToMany(mappedBy="clients")
	public List<Auction> getAuctions() {
		return auctions;
	}
	public void setAuctions(List<Auction> auctions) {
		this.auctions = auctions;
	}
	@ManyToMany
	public List<Quiz> getQuiz() {
		return quiz;
	}
	public void setQuiz(List<Quiz> quiz) {
		this.quiz = quiz;
	}
	@OneToMany(mappedBy="client")
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
  
	
	
}
