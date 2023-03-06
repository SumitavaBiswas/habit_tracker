package com.habit.tracker.service;

import com.habit.tracker.model.DailyLog;
import com.habit.tracker.model.DailyLogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DailyLogService {
    @Autowired
    DailyLogRepository repository;

    public void saveDailyLog(DailyLog dailyLog){
        repository.save(dailyLog);
    }

    public DailyLog getDailyLog(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<DailyLog> getAllDailyLogs(){
        return repository.findAll();
    }
}
