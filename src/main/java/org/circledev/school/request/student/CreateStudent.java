package org.circledev.school.request.student;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateStudent {
    private String firstName;
    private String lastName;
    private String email;
}
