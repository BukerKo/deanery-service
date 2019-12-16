package com.gmail.buer2012.deaneryservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.DayOfWeek;

@Entity
@Data
@NoArgsConstructor
public class TimeTable {
    
    @Id
    @GeneratedValue
    private Long Id;
    
    @Column
    private DayOfWeek dayOfWeek;

    @Column
    private String content;
    
    @OneToOne
    private Group group;
    
    
}
