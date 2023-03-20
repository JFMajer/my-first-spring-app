package com.spring.firstdemo.firstspringapp.rest;

import com.spring.firstdemo.firstspringapp.common.BasketballCoach;
import com.spring.firstdemo.firstspringapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach secondCoach;
    // dependency injection with qualifier using setter injection
    @Autowired
    public void setMyCoach(@Qualifier("basketballCoach") Coach myCoach) {
        this.myCoach = myCoach;
    }

    // dependency injection with qualifier using constructor injection
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach secondCoach) {
        this.secondCoach = secondCoach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/workout-cricket")
    public String getDailyWorkout2() {
        return secondCoach.getDailyWorkout();
    }

}
