package com.gmail.buer2012.deaneryservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Lesson {
    
    @Id
    @GeneratedValue
    private Long Id;
    
    @Column
    private String name;
    
    @OneToOne
    private Tutor tutor;
    
    @ManyToMany
    private List<Student> students;
}
