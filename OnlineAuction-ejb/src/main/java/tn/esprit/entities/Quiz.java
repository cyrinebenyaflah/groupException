package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Quiz
 *
 */
@Entity

public class Quiz implements Serializable {

	
	private int idQuiz;
	private String nameQuiz;
	private List<Question> questions;
	private List<Client> clients;
	private static final long serialVersionUID = 1L;

	public Quiz() {
		super();
	}   
	@Id    
	public int getIdQuiz() {
		return this.idQuiz;
	}

	public void setIdQuiz(int idQuiz) {
		this.idQuiz = idQuiz;
	}   
	public String getNameQuiz() {
		return this.nameQuiz;
	}

	public void setNameQuiz(String nameQuiz) {
		this.nameQuiz = nameQuiz;
	}
	@OneToMany(mappedBy="quiz")
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	@ManyToMany(mappedBy="quiz")
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
   
	
	
}
