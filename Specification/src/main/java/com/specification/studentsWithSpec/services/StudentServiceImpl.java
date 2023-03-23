package com.specification.studentsWithSpec.services;
import com.specification.studentsWithSpec.entity.Student;
import com.specification.studentsWithSpec.repository.StudentRepository;
import com.specification.studentsWithSpec.specification.StudentSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student saveStudents(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> getStudentsById(Long id) {
        Specification specification=Specification.where(StudentSpecification.hasId(id));
        return studentRepository.findAll(specification);
    }

    @Override
    public List<Student> getStudentsByFirstAndLastName(String firstName, String lastname) {
        Specification specification=Specification.where(StudentSpecification
                .hasLastName(lastname)
                .and(StudentSpecification.hasFirstName(firstName))
        );
        return studentRepository.findAll(specification);
    }

    @Override
    public List<Student> getStudentsByIdAndLastName(Long id, String name) {
        Specification specification=Specification.where(StudentSpecification
                .hasId(id)
                .and(StudentSpecification.hasFirstName(name))
        );
        return studentRepository.findAll(specification);
    }
}
