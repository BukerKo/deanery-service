package com.gmail.buer2012.deaneryservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
public class Student {
    
    @Id
    @GeneratedValue
    Long id;
    
    @Column
    String firstName;
    
    @Column
    String lastName;
    
    @Column
    Integer age = 18;

    @ManyToMany
    private List<Mark> marks;

}
