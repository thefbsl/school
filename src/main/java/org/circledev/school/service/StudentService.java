package org.circledev.school.service;


import org.circledev.school.model.Student;

import java.util.List;

public interface StudentService {
    public Student createStudent(Student student);
    public List<Student> getStudents();
    public Student getStudentById(Long studentId);
    public Student updateStudent(Long studentId, Student newStudent);
    public void deleteStudent(Long studentId);
}
