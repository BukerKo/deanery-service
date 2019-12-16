package com.gmail.buer2012.deaneryservice.repository;

import com.gmail.buer2012.deaneryservice.entity.Deanery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface DeaneryRepository extends CrudRepository<Deanery, Long> {
}
