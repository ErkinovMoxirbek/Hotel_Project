package org.example.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.enums.Status;
import org.example.enums.TypeRoom;

import javax.persistence.*;
import java.time.LocalDate;
@ToString
@Getter
@Setter
@Table(name = "employee")
@Entity
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(nullable = false)
    private String phone;
    @Column(name = "birth_day", nullable = false)
    private LocalDate birthDay;
    @Column(nullable = false)
    private Status status;
    @Column(nullable = false)
    private TypeRoom type;
}
