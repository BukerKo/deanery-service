package com.gmail.buer2012.deaneryservice.repository;

import com.gmail.buer2012.deaneryservice.entity.TimeTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface TimeTableRepository extends CrudRepository<TimeTable, Long> {
    
    List<TimeTable> findByGroup_Id(Long groupId);
}
