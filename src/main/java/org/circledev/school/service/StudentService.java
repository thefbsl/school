package org.circledev.school.service;


import org.circledev.school.model.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
    List<Student> getStudents();
    Student getStudentById(Long studentId);
    Student updateStudent(Long studentId, Student newStudent);
    void deleteStudent(Long studentId);
}
