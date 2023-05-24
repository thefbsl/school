package org.circledev.school.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_lockers")
public class Locker {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long lockerId;
    @Column(
            unique = true,
            nullable = false
    )
    private Integer lockerNumber;
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
