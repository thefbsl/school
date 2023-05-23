package org.circledev.school.mapper;

import org.circledev.school.dto.StudentDto;
import org.circledev.school.model.Student;
import org.circledev.school.request.CreateStudent;
import org.circledev.school.request.UpdateStudent;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    public Student toEntity(StudentDto studentDto){
        Student student = new Student();
        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());
        student.setEmail(studentDto.getEmail());
        return student;
    }

    public Student toEntity(CreateStudent request){
        Student student = new Student();
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setEmail(request.getEmail());
        return student;
    }

    public Student toEntity(UpdateStudent request){
        Student student = new Student();
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setEmail(request.getEmail());
        return student;
    }

    public StudentDto toDto(Student student){
        StudentDto studentDto = new StudentDto();
        studentDto.setStudentId(student.getStudentId());
        studentDto.setFirstName(student.getFirstName());
        studentDto.setLastName(student.getLastName());
        studentDto.setEmail(student.getEmail());
        return studentDto;
    }
}
