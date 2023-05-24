package org.circledev.school.facade.facadeImpl;

import lombok.RequiredArgsConstructor;
import org.circledev.school.dto.LockerDto;
import org.circledev.school.facade.LockerFacade;
import org.circledev.school.mapper.LockerMapper;
import org.circledev.school.model.Locker;
import org.circledev.school.request.locker.CreateLocker;
import org.circledev.school.service.LockerService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class LockerFacadeImpl implements LockerFacade {
    private final LockerService lockerService;
    private final LockerMapper lockerMapper;
    @Override
    public LockerDto createLocker(CreateLocker request) {
        Locker locker = lockerMapper.toEntity(request);
        Locker savedLocker = lockerService.createLocker(locker, request.getStudentId());
        return lockerMapper.toDto(savedLocker);
    }

    @Override
    public List<LockerDto> getLockers() {
        List<Locker> lockers = lockerService.getLockers();
        return lockers.stream().map(lockerMapper::toDto).toList();
    }

    @Override
    public LockerDto getLockerById(Long lockerId) {
        Locker locker = lockerService.getLockerById(lockerId);
        return lockerMapper.toDto(locker);
    }

    @Override
    public void deleteLocker(Long lockerId) {
        lockerService.deleteLocker(lockerId);
    }
}
