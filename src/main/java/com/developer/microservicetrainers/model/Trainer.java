package com.developer.microservicetrainers.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "trainer")
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, unique = true)
    private Long id;
    @NotBlank(message = "введите имя сотрудника")
    private String name;
    @NotBlank(message = "введите фамилию сотрудника")
    private String surname;
    private String patronymic;
    private LocalDate birthday;
}
