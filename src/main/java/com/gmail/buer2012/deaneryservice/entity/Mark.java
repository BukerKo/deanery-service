package com.gmail.buer2012.deaneryservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Mark {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private int value;
    
    @ManyToMany
    private List<Student> students;
    
}
