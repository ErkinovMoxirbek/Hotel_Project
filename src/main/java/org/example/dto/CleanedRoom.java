package org.example.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "cleaned_room")
@Getter @Setter @ToString

public class CleanedRoom {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Integer employee_id;
    @Column(name = "cleared_time",nullable = false)
    private LocalDateTime clearedTime;
    @Column(nullable = false)
    private Integer room_id;
    @Column(nullable = false)
    private String information;
}
