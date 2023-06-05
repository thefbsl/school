package org.circledev.school.facade;

import org.circledev.school.dto.LockerDto;
import org.circledev.school.request.locker.CreateLocker;

import java.util.List;

public interface LockerFacade {
    LockerDto createLocker(CreateLocker request);
    List<LockerDto> getLockers();
    LockerDto getLockerById(Long lockerId);
    void deleteLocker(Long lockerId);
}
