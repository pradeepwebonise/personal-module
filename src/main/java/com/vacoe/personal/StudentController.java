package com.vacoe.personal;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vacoe.personal.models.Student;
import com.vacoe.personal.service.StudentService;
import com.vacoe.personal.service.impl.StudentServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/rollNumber/{rollNumber}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    Student categoryList(@PathVariable Long rollNumber) throws JsonGenerationException, JsonMappingException, IOException {
        Student student = studentService.findStudent(rollNumber);
        System.out.println(new ObjectMapper().writeValueAsString(student));
        return student; 
    }
}
