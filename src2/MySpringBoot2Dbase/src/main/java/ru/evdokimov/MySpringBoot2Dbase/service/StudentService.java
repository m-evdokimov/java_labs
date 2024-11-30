package ru.evdokimov.MySpringBoot2Dbase.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.evdokimov.MySpringBoot2Dbase.entity.Student;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudent(int id);

    boolean updateStudent(Student student);

    boolean deleteStudent(int id);
}