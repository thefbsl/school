package org.circledev.school.service.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.circledev.school.exception.StudentNotFoundException;
import org.circledev.school.model.Student;
import org.circledev.school.repository.UserRepository;
import org.circledev.school.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final UserRepository userRepository;
    @Override
    public Student createStudent(Student student) {
        return userRepository.save(student);
    }

    @Override
    public List<Student> getStudents() {
        return userRepository.findAll();
    }

    @Override
    public Student getStudentById(Long studentId) {
        return userRepository.findById(studentId)
                .orElseThrow(() -> new StudentNotFoundException("User with " + studentId + " not found"));
    }

    @Override
    public Student updateStudent(Long studentId, Student newStudent) {
        Student currentStudent = userRepository.findById(studentId)
                .orElseThrow(() -> new StudentNotFoundException("User with " + studentId + " not found"));
        currentStudent.setFirstName(newStudent.getFirstName());
        currentStudent.setLastName(newStudent.getLastName());
        currentStudent.setEmail(newStudent.getEmail());
        userRepository.save(currentStudent);
        return currentStudent;
    }

    @Override
    public void deleteStudent(Long studentId) {
        userRepository.deleteById(studentId);
    }
}
