package com.gmail.buer2012.deaneryservice.repository;

import com.gmail.buer2012.deaneryservice.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
