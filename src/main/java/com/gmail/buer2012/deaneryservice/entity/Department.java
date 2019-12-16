package com.gmail.buer2012.deaneryservice.entity;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Department {
    
    @Id
    @GeneratedValue
    private Long Id;

    @Column
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Group> classes;
}
