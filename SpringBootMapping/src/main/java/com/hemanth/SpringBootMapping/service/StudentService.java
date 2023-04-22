package com.hemanth.SpringBootMapping.service;


import com.hemanth.SpringBootMapping.model.Student;
import com.hemanth.SpringBootMapping.model.University;
import com.hemanth.SpringBootMapping.repository.StudentRepository;
import com.hemanth.SpringBootMapping.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService
{





    @Autowired
    StudentRepository sr;


    public Student addStudents(Student student)
    {


        return sr.save(student);

    }

    public List<Student> getStudent()
    {
        return sr.findAll();


    }


    public String updateStudent(Student st)
    {
        sr.save(st);
        return "Updated Student Details Successfully";

    }

    public String deleteStudent()
    {
        sr.deleteAll();
        return "All Students Deleted Successfully";
    }


    public void deleteStudentById(int id)
    {
        sr.deleteById(id);
        System.out.println("Deleted the students with the id"+id);

    }



}
