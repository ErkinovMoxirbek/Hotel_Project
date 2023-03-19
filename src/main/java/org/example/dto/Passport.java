package org.example.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.xml.namespace.QName;
import java.time.LocalDate;
@ToString
@Getter
@Setter
@Table(name = "passport")
@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String number;
    @Column(name = "given_place",nullable = false)
    private String givenPlace;
    @Column(name = "given_date", nullable = false)
    private LocalDate givenDate;
    @Column(name = "exp_date", nullable = false)
    private LocalDate expDate;

}
