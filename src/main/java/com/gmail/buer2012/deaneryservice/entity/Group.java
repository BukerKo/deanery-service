package com.gmail.buer2012.deaneryservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "class")
@Data
@NoArgsConstructor
public class Group {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;

    @OneToMany(mappedBy = "group")
    private List<Student> students;
}
