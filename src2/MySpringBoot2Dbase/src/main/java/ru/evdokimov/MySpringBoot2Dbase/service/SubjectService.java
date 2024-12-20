package ru.evdokimov.MySpringBoot2Dbase.service;

import ru.evdokimov.MySpringBoot2Dbase.entity.Subject;
import java.util.List;

public interface SubjectService {
    List<Subject> getAllSubjects();
    Subject saveSubject(Subject subject);
    Subject getSubject(int id);
    boolean updateSubject(Subject subject);
    boolean deleteSubject(int id);
}