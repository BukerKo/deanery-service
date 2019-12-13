package com.gmail.buer2012.deaneryservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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
    private Integer age;
    
    @OneToOne(mappedBy = "tutor")
    private Lesson lesson;
}
