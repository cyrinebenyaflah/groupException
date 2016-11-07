package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Quiz
 *
 */
@Entity

public class Quiz implements Serializable {

	
	private int idQuiz;
	private String nameQuiz;
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
   
}
