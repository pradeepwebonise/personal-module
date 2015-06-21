package com.vacoe.personal.service.impl;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vacoe.personal.dao.StudentDao;
import com.vacoe.personal.models.Student;

@Component
public class StudentServiceImpl {

    @Autowired
    private StudentDao studentDao;

    public Student findStudent(Long rollNumber) throws ServiceException {
        Student student = studentDao.findOne(rollNumber);
        return student;
    }
}
