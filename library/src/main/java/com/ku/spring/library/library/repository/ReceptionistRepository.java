package com.ku.spring.library.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ku.spring.library.library.model.Receptionist;

@Repository
public interface ReceptionistRepository extends JpaRepository<Receptionist, Long>{

}
