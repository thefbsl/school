package org.circledev.school.service.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.circledev.school.exception.ResourceNotFoundException;
import org.circledev.school.model.Student;
import org.circledev.school.repository.StudentRepository;
import org.circledev.school.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("User with " + studentId + " not found"));
    }

    @Override
    public Student updateStudent(Long studentId, Student newStudent) {
        Student currentStudent = studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("User with " + studentId + " not found"));
        currentStudent.setFirstName(newStudent.getFirstName());
        currentStudent.setLastName(newStudent.getLastName());
        currentStudent.setEmail(newStudent.getEmail());
        studentRepository.save(currentStudent);
        return currentStudent;
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}
