package com.specification.studentsWithSpec.services;


import com.specification.studentsWithSpec.entity.Student;

import java.util.List;

public interface StudentService {
    Student saveStudents(Student student);

    List<Student> getStudents();

    List<Student> getStudentsById(Long id);

    List<Student> getStudentsByFirstAndLastName(String firstName, String lastname);

    List<Student> getStudentsByIdAndLastName(Long id, String name);
}
