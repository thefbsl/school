package org.circledev.school.mapper;

import lombok.RequiredArgsConstructor;
import org.circledev.school.dto.LockerDto;
import org.circledev.school.dto.StudentDto;
import org.circledev.school.model.Locker;
import org.circledev.school.request.locker.CreateLocker;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LockerMapper {
    private final StudentMapper studentMapper;
    public Locker toEntity(CreateLocker request){
        Locker locker = new Locker();
        locker.setLockerNumber(request.getLockerNumber());
        return locker;
    }

    public LockerDto toDto(Locker locker){
        LockerDto lockerDto = new LockerDto();
        StudentDto studentDto = studentMapper.toDto(locker.getStudent());
        lockerDto.setLockerId(locker.getLockerId());
        lockerDto.setLockerNumber(locker.getLockerNumber());
        lockerDto.setStudentDto(studentDto);
        return lockerDto;
    }
}
