package org.example.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "booking")
@Getter @Setter
@ToString
public class Booking {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "guest_id",nullable = false)
    private Integer guestId;
    @Column(name = "room_number", nullable = false)
    private Integer roomNumber;
    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;
    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;
    @Column(nullable = false)
    private Double reservation_price;
}
