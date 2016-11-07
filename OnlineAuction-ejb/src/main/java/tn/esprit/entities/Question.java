package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Question
 *
 */
@Entity

public class Question implements Serializable {

	
	private int idQuestion;
	private int idQuiz;
	private String question;
	private String suggestion1;
	private String suggestion2;
	private String answer;
	private static final long serialVersionUID = 1L;

	public Question() {
		super();
	}   
	@Id    
	public int getIdQuestion() {
		return this.idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}   
	public int getIdQuiz() {
		return this.idQuiz;
	}

	public void setIdQuiz(int idQuiz) {
		this.idQuiz = idQuiz;
	}   
	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}   
	public String getSuggestion1() {
		return this.suggestion1;
	}

	public void setSuggestion1(String suggestion1) {
		this.suggestion1 = suggestion1;
	}   
	public String getSuggestion2() {
		return this.suggestion2;
	}

	public void setSuggestion2(String suggestion2) {
		this.suggestion2 = suggestion2;
	}   
	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
   
}
