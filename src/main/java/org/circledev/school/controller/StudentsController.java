package org.circledev.school.controller;

import lombok.RequiredArgsConstructor;
import org.circledev.school.dto.StudentDto;
import org.circledev.school.facade.StudentFacade;
import org.circledev.school.request.CreateStudent;
import org.circledev.school.request.UpdateStudent;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students/")
@RequiredArgsConstructor
public class StudentsController {
    private final StudentFacade studentFacade;

    @PostMapping("/create/")
    public StudentDto createStudent(@RequestBody CreateStudent request){
        return studentFacade.createStudent(request);
    }

    @GetMapping("/get")
    public List<StudentDto> getStudents(){
        return studentFacade.getStudents();
    }

    @GetMapping("/get/{studentId}")
    public StudentDto getStudentById(@PathVariable Long studentId){
        return studentFacade.getStudentById(studentId);
    }

    @PutMapping("/update/{studentId}")
    public StudentDto updateStudent(@PathVariable Long studentId, @RequestBody UpdateStudent request){
        return studentFacade.updateStudent(studentId, request);
    }

    @DeleteMapping("/delete/{studentId}")
    public void deleteUser(@PathVariable Long studentId){
        studentFacade.deleteStudent(studentId);
    }
}
