package com.habit.tracker.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class DailyLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany
    private Set<Habit> Habits;

}
