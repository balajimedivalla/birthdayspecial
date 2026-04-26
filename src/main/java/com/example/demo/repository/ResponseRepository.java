package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ResponseEntity;

public interface ResponseRepository extends JpaRepository<ResponseEntity, Integer> {
}