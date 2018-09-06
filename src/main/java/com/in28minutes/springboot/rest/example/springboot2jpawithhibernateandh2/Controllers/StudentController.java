package com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2.Controllers;

import com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    private StudentRepository repository;


    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public void addStudent(){

    }

}
