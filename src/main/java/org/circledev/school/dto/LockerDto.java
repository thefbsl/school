package org.circledev.school.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LockerDto {
    private Long lockerId;
    private Integer lockerNumber;
    private StudentDto studentDto;
}
