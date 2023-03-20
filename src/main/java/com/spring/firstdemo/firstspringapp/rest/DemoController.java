package com.spring.firstdemo.firstspringapp.rest;

import com.spring.firstdemo.firstspringapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    public DemoController(Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
