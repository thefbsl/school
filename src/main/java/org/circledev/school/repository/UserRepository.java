package org.circledev.school.repository;

import org.circledev.school.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Student, Long> {
}
