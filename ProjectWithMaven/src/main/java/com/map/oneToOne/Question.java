package com.map.oneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	 @Id
	 @Column(name="question_id")
     private int question_Id;
	 private String question;
	 @OneToOne
	 private Answer answer;
	@Override
	public String toString() {
		return "Question [question_Id=" + question_Id + ", question=" + question + ", answer=" + answer + "]";
	}
	public int getQuestion_Id() {
		return question_Id;
	}
	public void setQuestion_Id(int question_Id) {
		this.question_Id = question_Id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int question_Id, String question, Answer answer) {
		super();
		this.question_Id = question_Id;
		this.question = question;
		this.answer = answer;
	}
}
