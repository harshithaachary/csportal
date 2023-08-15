package com.axis.bank.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="customerComplaints")
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_complaint_token")
    private Long id;
    
    private String fullName;
    private String accountNumber;
    private String contactInformation;
    private String complaintCategory;

    private String issueDescription;
    private LocalDateTime eventDateTime;
    private String eventLocation;
    public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Complaint(Long id, String fullName, String accountNumber, String contactInformation,
			String complaintCategory, String issueDescription, LocalDateTime eventDateTime, String eventLocation) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.accountNumber = accountNumber;
		this.contactInformation = contactInformation;
		this.complaintCategory = complaintCategory;
		this.issueDescription = issueDescription;
		this.eventDateTime = eventDateTime;
		this.eventLocation = eventLocation;
	}
	@Override
	public String toString() {
		return "Complaint [id=" + id + ", fullName=" + fullName + ", accountNumber=" + accountNumber
				+ ", contactInformation=" + contactInformation + ", complaintCategory=" + complaintCategory
				+ ", issueDescription=" + issueDescription + ", eventDateTime=" + eventDateTime + ", eventLocation="
				+ eventLocation + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getContactInformation() {
		return contactInformation;
	}
	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}
	public String getComplaintCategory() {
		return complaintCategory;
	}
	public void setComplaintCategory(String complaintCategory) {
		this.complaintCategory = complaintCategory;
	}
	public String getIssueDescription() {
		return issueDescription;
	}
	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}
	public LocalDateTime getEventDateTime() {
		return eventDateTime;
	}
	public void setEventDateTime(LocalDateTime eventDateTime) {
		this.eventDateTime = eventDateTime;
	}
	public String getEventLocation() {
		return eventLocation;
	}
	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}
	
}