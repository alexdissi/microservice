package com.example.service_school.controller;

import com.example.service_school.model.School;
import com.example.service_school.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schools")
public class SchoolController {

    @Autowired
    private SchoolRepository repository;

    @PostMapping
    public School create(@RequestBody School school) {
        return repository.save(school);
    }

    @GetMapping
    public List<School> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<School> getById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
