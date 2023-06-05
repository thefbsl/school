package org.circledev.school.facade;

import org.circledev.school.dto.StudentDto;
import org.circledev.school.request.student.CreateStudent;
import org.circledev.school.request.student.UpdateStudent;

import java.util.List;

public interface StudentFacade {
    StudentDto createStudent(CreateStudent request);
    List<StudentDto> getStudents();
    StudentDto getStudentById(Long studentId);
    StudentDto updateStudent(Long studentId, UpdateStudent request);
    void deleteStudent(Long studentId);
}
