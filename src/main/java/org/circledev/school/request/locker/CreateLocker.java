package org.circledev.school.request.locker;

import lombok.Getter;
import lombok.Setter;
import org.circledev.school.dto.StudentDto;

@Getter
@Setter
public class CreateLocker {
    private Integer lockerNumber;
    private Long studentId;
}

