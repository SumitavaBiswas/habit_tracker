package com.habit.tracker.service;

import com.habit.tracker.model.Habit;
import com.habit.tracker.model.HabitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitService {
    @Autowired
    HabitRepository repository;

    public void saveHabit(Habit habit){
        repository.save(habit);
    }

    public Habit getHabit(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Habit> getAllHabits(){
        return repository.findAll();
    }


}
