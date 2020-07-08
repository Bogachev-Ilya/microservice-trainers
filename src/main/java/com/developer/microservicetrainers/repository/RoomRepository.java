package com.developer.microservicetrainers.repository;

import com.developer.microservicetrainers.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
