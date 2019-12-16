package com.gmail.buer2012.deaneryservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Deanery {
    
    @Id
    @GeneratedValue
    private Long Id;
    
    @Column
    private String name;
    
    @Column
    private String deanName;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Department> departments;
    
}
