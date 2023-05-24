package org.circledev.school.service.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.circledev.school.exception.ResourceNotFoundException;
import org.circledev.school.model.Locker;
import org.circledev.school.model.Student;
import org.circledev.school.repository.LockerRepository;
import org.circledev.school.repository.StudentRepository;
import org.circledev.school.service.LockerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LockerServiceImpl implements LockerService {
    private final LockerRepository lockerRepository;
    private final StudentRepository studentRepository;
    @Override
    public Locker createLocker(Locker locker, Long studentId) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));
        locker.setStudent(student);
        return lockerRepository.save(locker);
    }
    @Override
    public List<Locker> getLockers() {
        return lockerRepository.findAll();
    }
    @Override
    public Locker getLockerById(Long lockerId) {
        return lockerRepository.findById(lockerId)
                .orElseThrow(() -> new ResourceNotFoundException("Locker " + lockerId + " not found"));
    }
    @Override
    public void deleteLocker(Long lockerId) {
        lockerRepository.deleteById(lockerId);
    }
}
