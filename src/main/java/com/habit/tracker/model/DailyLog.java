package com.habit.tracker.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;

import java.util.Set;

@Data
@Persistent
public class DailyLog {

    @Id
    private Long id;
    private Set<Habit> Habits;

}
