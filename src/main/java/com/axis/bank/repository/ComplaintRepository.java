package com.axis.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.bank.model.Complaint;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
    // Custom query methods if needed
}
