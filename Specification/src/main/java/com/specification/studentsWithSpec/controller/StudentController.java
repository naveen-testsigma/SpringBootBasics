package com.specification.studentsWithSpec.controller;
import com.specification.studentsWithSpec.entity.Student;
import com.specification.studentsWithSpec.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class StudentController {
    @Autowired // Dependency Injection happens here
    StudentService studentService;
    @PostMapping()
    public Student saveStudents(@RequestBody Student student) //We make use of @RequestBody because we here receive the data as JSON to get that we need this
    {
        return studentService.saveStudents(student);
    }
    @GetMapping()
    public List<Student> getStudents()
    {
        return studentService.getStudents();
    }
    @GetMapping("/{id}")
    public List<Student> getStudentsById(@PathVariable("id") Long id)
    {
        return studentService.getStudentsById(id);
    }
    @GetMapping("/{firstName}/{lastName}")
    public List<Student> getStudentsByFirstAndLastName(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastname)
    {
        return studentService.getStudentsByFirstAndLastName(firstName,lastname);
    }
    //http://localhost:8080/user/2?firstName="Monesh" is used to access this one
    @GetMapping("/{id}/{firstName}")
    public List<Student> getStudentsByIdtAndName(@PathVariable("id") Long id,@PathVariable("FirstName") String name)
    {
        return studentService.getStudentsByIdAndLastName(id,name);
    }



}