package com.vacoe.personal.service;

import org.hibernate.service.spi.ServiceException;

import com.vacoe.personal.models.Student;

public interface StudentService {

    public Student findStudent(Long rollNumber) throws ServiceException;

}