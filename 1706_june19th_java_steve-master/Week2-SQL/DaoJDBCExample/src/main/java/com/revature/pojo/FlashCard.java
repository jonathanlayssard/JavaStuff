package com.revature.pojo;

import java.io.Serializable;

//Domain, Model, POJO, JavaBean (a little stricter)
	//Domain: Object to Table mapping
			//ORM: Object Relational Mapping
			//Hibernate ORM Framework
public class FlashCard implements Serializable {
	/*
	 * JavaBean	
	 * 		1. fully private state
	 * 		2. getters and setters
	 * 		3. overriden toString
	 * 		4. implements Serializable 
	 * 
	 */
	
	private static final long serialVersionUID = -2751081200849164630L;
	
	//State
	private int id;
	private String question;
	private String answer;
	
	//NO-ARGS
	public FlashCard() {}

	public FlashCard(int id, String question, String answer) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "FlashCard [id=" + id + ", question=" + question + ", answer=" + answer + "]";
	}
	
	
	
}
