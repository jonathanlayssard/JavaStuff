package com.revature.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Flash_Card")
public class FlashCard {

	@Id
	@Column(name="fc_id")
	private int fcId;
	
	@Column(name="fc_question")
	private String question;
	
	@Column(name="fc_answer")
	private String answer;
	
	public FlashCard() {}

	public int getFcId() {
		return fcId;
	}

	public void setFcId(int fcId) {
		this.fcId = fcId;
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
		return "FlashCard [fcId=" + fcId + ", question=" + question + ", answer=" + answer + "]";
	}
	
	
}
