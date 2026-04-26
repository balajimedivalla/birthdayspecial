package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.ResponseEntity;
import com.example.demo.model.ResponseRequest;
import com.example.demo.model.QuestionRequest;
import com.example.demo.repository.ResponseRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ResponseControllerr {

    @Autowired
    private ResponseRepository repository;

    // ✅ SAVE YES / NO
    @PostMapping("/save-response")
    public String saveResponse(@RequestBody ResponseRequest req) {

        System.out.println("Clicked: " + req.getResponse());

        ResponseEntity entity = new ResponseEntity();
        entity.setResponse(req.getResponse());

        repository.save(entity);

        return "Saved";
    }

    // ✅ NEW API FOR QUESTION
    @PostMapping("/save-question")
    public String saveQuestion(@RequestBody QuestionRequest req) {

        System.out.println("Question: " + req.getQuestion());

        ResponseEntity entity = new ResponseEntity();
        entity.setResponse(req.getResponse());
        entity.setQuestion(req.getQuestion());

        repository.save(entity);

        return "Saved Question";
    }
}