package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Question {

	private String ques1;
	@Autowired
	@Qualifier("a1")
	private Answer answer;
	

	public String getQues1() {
		return ques1;
	}

	public void setQues1(String ques1) {
		this.ques1 = ques1;
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


	public Question(String ques1, Answer answer) {
		super();
		this.ques1 = ques1;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question1=\n" + ques1 + ",\n answer is:\n" + answer ;
	}



	
	
}
