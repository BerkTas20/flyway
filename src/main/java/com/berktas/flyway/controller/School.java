package com.berktas.flyway.controller;


import com.berktas.flyway.model.Schools;
import com.berktas.flyway.repositories.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/schools")
@RequiredArgsConstructor
public class School {

    private final SchoolRepository schoolRepository;

    @PostConstruct
    private void createIfNotExist(){
        Long count = schoolRepository.count();
        if(count == 0){
            Schools schools = new Schools();
            schools.setName("firstSchool");
            schoolRepository.save(schools);
        }
    }

    @GetMapping
    List<Schools> getAll(){
        return schoolRepository.findAll();
    }
}
