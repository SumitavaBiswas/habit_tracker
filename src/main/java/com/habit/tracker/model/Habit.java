package com.habit.tracker.model;

import lombok.Data;
import org.springframework.data.annotation.Persistent;

import javax.persistence.Id;

@Data
@Persistent
public class Habit {
    @Id
    private Long id;
    private String Name;
}
