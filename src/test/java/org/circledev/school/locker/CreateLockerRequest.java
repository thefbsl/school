package org.circledev.school.locker;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CreateLockerRequest {
    private Integer lockerNumber;
    private Long studentId;
}
