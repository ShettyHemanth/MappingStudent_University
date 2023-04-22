//package com.hemanth.SpringBootMapping.MapperClass;
//
//import com.hemanth.SpringBootMapping.dto.StudentDto;
//import com.hemanth.SpringBootMapping.model.Student;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Mapper
//{
//
//    public Student dtoToStudentMapping(StudentDto studentDto)
//    {
//        Student s=new Student();
//        s.setName(studentDto.getName());
//        s.setUsn(studentDto.getUsn());
//        s.setBranch(studentDto.getBranch());
//        s.setEmail(studentDto.getEmail());
//        s.setUniversity(studentDto.getUniversity());
//
//        return  s;
//    }
//
//    public StudentDto studentToDto(Student student)
//    {
//        StudentDto s=new StudentDto();
//        s.setName(student.getName());
//        s.setBranch(student.getBranch());
//        s.setUsn(student.getUsn());
//        s.setEmail(student.getEmail());
//        s.setUniversity(student.getUniversity());
//
//        return s;
//    }
//}
