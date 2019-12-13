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
public class Cathedra {
    
    @Id
    @Generated
    private Long id;

    @Column
    String name;
    
    @OneToMany(cascade = CascadeType.ALL)
    List<Student> students;
    
    @OneToMany(cascade = CascadeType.ALL)
    List<Tutor> tutors;
}
