package com.developer.microservicetrainers.repository;

import com.developer.microservicetrainers.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

    List<Lesson> findAllByRoomId(Long roomId);
    List<Lesson> findAllByLessonDate(LocalDateTime lessonDate);


}
