package com.spring.firstdemo.firstspringapp.common;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {
    public String getDailyWorkout() {
        return "Practice your jump shot for 20 minutes";
    }
}
