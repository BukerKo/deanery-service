package com.gmail.buer2012.deaneryservice.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Group {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String name;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Student> students;
}
