package org.circledev.school.facade;

import org.circledev.school.dto.LockerDto;
import org.circledev.school.request.locker.CreateLocker;

import java.util.List;

public interface LockerFacade {
    public LockerDto createLocker(CreateLocker request);
    public List<LockerDto> getLockers();
    public LockerDto getLockerById(Long lockerId);
    public void deleteLocker(Long lockerId);
}
