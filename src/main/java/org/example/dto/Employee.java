package org.example.dto;

import org.example.enums.Status;
import org.example.enums.TypeRoom;

import java.time.LocalDate;

public class Employee {
    private Integer id;
    private String name;
    private String surname;
    private String phone;
    private LocalDate birthDay;
    private Status status;
    private TypeRoom type;
}
