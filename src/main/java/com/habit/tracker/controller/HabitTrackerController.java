package com.habit.tracker.controller;

import com.habit.tracker.model.Habit;
import com.habit.tracker.service.HabitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HabitTrackerController {
    @Autowired
    HabitService habitService;

    @CrossOrigin
    @PostMapping("/habit")
    public void addHabit(@RequestBody Habit habit){
        habitService.saveHabit(habit);
    }

    @GetMapping("/habit")
    public String showHabit(){
        return "HelloWorld";
    }
}
