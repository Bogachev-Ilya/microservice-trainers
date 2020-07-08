package com.developer.microservicetrainers.service;

import com.developer.microservicetrainers.model.Lesson;
import com.developer.microservicetrainers.model.Room;
import com.developer.microservicetrainers.repository.LessonRepository;
import com.developer.microservicetrainers.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class LessonServiceImpl implements LessonService {
    @Autowired
    private LessonRepository lessonRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<Lesson> findLessonsByRoomId(Long roomId){
        return lessonRepository.findAllByRoomId(roomId);
    }

    @Override
    public List<Lesson> findLessonsByDate(LocalDateTime localDateTime){
        return lessonRepository.findAllByLessonDate(localDateTime);
    }

    @Override
    public Lesson saveLesson(Lesson lesson){
        return lessonRepository.save(lesson);
    }

    @Override
    public Room saveRoom(Room room){
        return roomRepository.save(room);
    }
}
