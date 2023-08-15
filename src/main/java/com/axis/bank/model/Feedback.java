package com.axis.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String content;
    private int rating;
//    
//    @ManyToOne
//    @JoinColumn(name = "customer_id")
//    private Customer customer;
//    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", content=" + content + ", rating=" + rating + "]";
	}
	public Feedback(Long id, String content, int rating) {
		super();
		this.id = id;
		this.content = content;
		this.rating = rating;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

//    
//    @ManyToOne
//    @JoinColumn(name = "ticket_id")
//    private SupportTicket supportTicket;
    
    // Other fields, getters, setters
}