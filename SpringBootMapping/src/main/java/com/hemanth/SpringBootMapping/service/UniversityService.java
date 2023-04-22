package com.hemanth.SpringBootMapping.service;

import com.hemanth.SpringBootMapping.controller.UniversityController;
import com.hemanth.SpringBootMapping.model.Student;
import com.hemanth.SpringBootMapping.model.University;
import com.hemanth.SpringBootMapping.repository.StudentRepository;
import com.hemanth.SpringBootMapping.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService
{




    @Autowired
    UniversityRepository ur;


    public University addUniversity(University university)
    {


        return ur.save(university);

    }

    public List<University> getUniversity()
    {
        return ur.findAll();


    }


    public String updateUniversity(University ut)
    {
        ur.save(ut);
        return "Updated University Details Successfully";

    }

    public String deleteUniversity()
    {
        ur.deleteAll();
        return "All University Deleted Successfully";
    }


    public void deleteUniversityBy(int id)
    {
        ur.deleteById(id);
        System.out.println("Deleted the students with the id"+id);

    }


}
