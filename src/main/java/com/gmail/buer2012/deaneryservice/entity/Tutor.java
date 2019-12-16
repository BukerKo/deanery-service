package com.gmail.buer2012.deaneryservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Tutor {
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String firstName;
    
    @Column
    private String lastName;
    
    @Column
    private String degree;
}
