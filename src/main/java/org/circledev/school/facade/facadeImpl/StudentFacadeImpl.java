package org.circledev.school.facade.facadeImpl;

import lombok.RequiredArgsConstructor;
import org.circledev.school.dto.StudentDto;
import org.circledev.school.facade.StudentFacade;
import org.circledev.school.mapper.StudentMapper;
import org.circledev.school.model.Student;
import org.circledev.school.request.CreateStudent;
import org.circledev.school.request.UpdateStudent;
import org.circledev.school.service.StudentService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class StudentFacadeImpl implements StudentFacade {
    private final StudentService studentService;
    private final StudentMapper studentMapper;
    @Override
    public StudentDto createStudent(CreateStudent request) {
        Student student = studentMapper.toEntity(request);
        Student savedStudent = studentService.createStudent(student);
        return studentMapper.toDto(savedStudent);
    }
    @Override
    public List<StudentDto> getStudents() {
        List<Student> students = studentService.getStudents();
        return students.stream().map(studentMapper::toDto).toList();
    }

    @Override
    public StudentDto getStudentById(Long studentId) {
        Student student = studentService.getStudentById(studentId);
        return studentMapper.toDto(student);
    }

    @Override
    public StudentDto updateStudent(Long studentId, UpdateStudent request) {
        Student student = studentMapper.toEntity(request);
        Student updatedStudent = studentService.updateStudent(studentId, student);
        return studentMapper.toDto(updatedStudent);
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentService.deleteStudent(studentId);
    }
}
