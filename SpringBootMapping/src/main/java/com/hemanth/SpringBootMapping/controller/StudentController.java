package com.hemanth.SpringBootMapping.controller;



import com.hemanth.SpringBootMapping.model.Student;
import com.hemanth.SpringBootMapping.model.University;
import com.hemanth.SpringBootMapping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController
{

    @Autowired
    StudentService ss;

    @RequestMapping(method = RequestMethod.POST,value = "/users")
    public Student addingStudent(@RequestBody Student student)
    {
        return ss.addStudents(student);

    }



    @RequestMapping(method = RequestMethod.GET,value = "/details")
    public List<Student> gettingStudents()
    {
        return ss.getStudent();
    }


    @RequestMapping(method = RequestMethod.PUT,value = "/update")
    public String upStudents(@RequestBody Student s)
    {
        return ss.updateStudent(s);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/delete")
    public String deleteStudents()
    {
        return ss.deleteStudent();
    }


    @RequestMapping(method = RequestMethod.DELETE,value = "/delete/{username}")
    public void deleteStudentsById(@PathVariable("username") int id)
    {
        ss.deleteStudentById(id);
    }



}
