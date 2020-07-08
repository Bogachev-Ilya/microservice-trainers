package com.developer.microservicetrainers.service;

import com.developer.microservicetrainers.model.Trainer;
import com.developer.microservicetrainers.repository.LessonRepository;
import com.developer.microservicetrainers.repository.RoomRepository;
import com.developer.microservicetrainers.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {
    @Autowired
    private TrainerRepository trainerRepository;



    @Override
    public List<Trainer> findAll(){
        return trainerRepository.findAll();
    }

    @Override
    public Trainer findTrainerById(Long trainerId){
        return trainerRepository.findById(trainerId).orElse(null);
    }
}
