package com.vacoe.personal.service.impl;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vacoe.personal.dao.StudentDao;
import com.vacoe.personal.models.Student;
import com.vacoe.personal.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    public Student findStudent(Long rollNumber) throws ServiceException {
        Student student = studentDao.findOne(rollNumber);
        return student;
    }
}
