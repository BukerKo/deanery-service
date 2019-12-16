package com.gmail.buer2012.deaneryservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Student {
    
    @Id
    @GeneratedValue
    private Long Id;
    
    @Column
    private String firstName;
    
    @Column
    private String lastName;
    
    @Column
    private String birthDate;

    @ManyToOne
    @JoinColumn(name="group_id")
    private Group group;

}
