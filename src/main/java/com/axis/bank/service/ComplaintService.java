package com.axis.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.bank.model.Complaint;
import com.axis.bank.repository.ComplaintRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ComplaintService {

    private final ComplaintRepository complaintRepository;

    @Autowired
    public ComplaintService(ComplaintRepository complaintRepository) {
        this.complaintRepository = complaintRepository;
    }

    public Complaint submitComplaint(Complaint complaint) {
        return complaintRepository.save(complaint);
    }

    public List<Complaint> getAllComplaints() {
        return complaintRepository.findAll();
    }

    public Complaint getComplaintById(Long id) {
        return complaintRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Complaint not found with id: " + id));
    }

    // Other methods for handling complaints
}
