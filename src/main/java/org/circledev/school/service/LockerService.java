package org.circledev.school.service;

import org.circledev.school.model.Locker;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LockerService {
    Locker createLocker(Locker locker, Long studentId);
    List<Locker> getLockers();
    Locker getLockerById(Long lockerId);
    void deleteLocker(Long lockerId);
}
