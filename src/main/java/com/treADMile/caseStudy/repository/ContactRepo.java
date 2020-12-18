package com.treADMile.caseStudy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treADMile.caseStudy.DTO.Contact;

public interface ContactRepo extends JpaRepository<Contact, Long>{
	List<Contact> findByUserId(String userId);
}
