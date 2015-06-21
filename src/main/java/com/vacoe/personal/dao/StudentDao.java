package com.vacoe.personal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vacoe.personal.models.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Long> {
    
}
