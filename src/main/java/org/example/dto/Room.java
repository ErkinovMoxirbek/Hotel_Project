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
    private Integer room_number;
    private Integer floor;
    private TypeRoom type;
    private String amenities;
}
