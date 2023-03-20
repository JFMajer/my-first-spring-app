package com.spring.firstdemo.firstspringapp.common;

import com.spring.firstdemo.firstspringapp.common.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public String getDailyWorkout() {
        return "Practice fast bowling for 20 minutes";
    }
}
