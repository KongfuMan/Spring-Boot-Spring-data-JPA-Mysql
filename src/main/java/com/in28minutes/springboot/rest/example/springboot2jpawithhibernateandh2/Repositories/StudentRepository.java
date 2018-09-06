package com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2.Repositories;


import com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
