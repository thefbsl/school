package org.circledev.school.student;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CreateStudentRequest {
    private String firstName;
    private String lastName;
    private String email;
}
