package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "responses")
public class ResponseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String response;

    // ✅ NEW FIELD
    private String question;

    private LocalDateTime createdAt = LocalDateTime.now();

    public int getId() { return id; }

    public String getResponse() { return response; }
    public void setResponse(String response) { this.response = response; }

    // ✅ NEW GETTERS/SETTERS
    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }
}