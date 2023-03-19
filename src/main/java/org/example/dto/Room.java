package org.example.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.enums.TypeRoom;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@Table(name = "room")
public class Room  {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Integer room_number;
    @Column(nullable = false)
    private Integer floor;
    @Column(nullable = false)
    private TypeRoom type;
    @Column(nullable = false)
    private String amenities;
}
