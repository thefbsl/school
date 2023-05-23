package org.circledev.school.facade;

import org.circledev.school.dto.StudentDto;
import org.circledev.school.request.CreateStudent;
import org.circledev.school.request.UpdateStudent;

import java.util.List;

public interface StudentFacade {
    public StudentDto createStudent(CreateStudent request);
    public List<StudentDto> getStudents();
    public StudentDto getStudentById(Long studentId);
    public StudentDto updateStudent(Long studentId, UpdateStudent request);
    public void deleteStudent(Long studentId);
}
