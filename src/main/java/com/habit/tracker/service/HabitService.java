package com.habit.tracker.service;

import com.habit.tracker.model.Habit;
import com.habit.tracker.model.HabitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitService {
    @Autowired
    HabitRepository habitRepository;

    public void saveHabit(Habit habit){
        habitRepository.save(habit);
    }

    public Habit getHabit(Long id){
        return habitRepository.findById(id).orElse(null);
    }

    public List<Habit> getAllHabits(){
        return habitRepository.findAll();
    }


}
