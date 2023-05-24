package org.circledev.school.service;

import org.circledev.school.model.Locker;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LockerService {
    public Locker createLocker(Locker locker, Long studentId);
    public List<Locker> getLockers();
    public Locker getLockerById(Long lockerId);
    public void deleteLocker(Long lockerId);
}
