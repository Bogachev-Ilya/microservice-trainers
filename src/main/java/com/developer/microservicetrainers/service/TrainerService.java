package com.developer.microservicetrainers.service;

import com.developer.microservicetrainers.model.Trainer;

import java.util.List;

public interface TrainerService {
    List<Trainer> findAll();

    Trainer findTrainerById(Long trainerId);
}
