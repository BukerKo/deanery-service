package com.gmail.buer2012.deaneryservice.repository;

import com.gmail.buer2012.deaneryservice.entity.Lesson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface LessonRepository extends CrudRepository<Lesson, Long> {
}
