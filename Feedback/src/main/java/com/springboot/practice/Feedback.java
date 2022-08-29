package com.springboot.practice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Feedback {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String feedback;
	
	public Feedback() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	
	
	public Feedback(String name, String email, String feedback) {
		super();
		this.name = name;
		this.email = email;
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "FeedbackEntity [id=" + id + ", name=" + name + ", email=" + email + ", feedback=" + feedback + "]";
	}
	
	
}
