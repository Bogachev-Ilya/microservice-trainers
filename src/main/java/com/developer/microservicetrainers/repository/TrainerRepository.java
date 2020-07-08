package com.developer.microservicetrainers.repository;

import com.developer.microservicetrainers.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {
}
