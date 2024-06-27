package com.springrefresh.contactapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrefresh.contactapi.domain.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, String>{
    Optional<Contact> findById(String id);

}
