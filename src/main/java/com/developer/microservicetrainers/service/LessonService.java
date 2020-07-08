package com.developer.microservicetrainers.service;

import com.developer.microservicetrainers.model.Lesson;
import com.developer.microservicetrainers.model.Room;

import java.time.LocalDateTime;
import java.util.List;

public interface LessonService {
    List<Lesson> findLessonsByRoomId(Long roomId);

    List<Lesson> findLessonsByDate(LocalDateTime localDateTime);

    Lesson saveLesson(Lesson lesson);

    Room saveRoom(Room room);
}
