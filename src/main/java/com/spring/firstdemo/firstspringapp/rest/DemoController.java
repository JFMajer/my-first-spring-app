package com.spring.firstdemo.firstspringapp.rest;

import com.spring.firstdemo.firstspringapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach secondCoach;
    private Coach anotherCoach;

    // dependency injection with qualifier using setter injection
    @Autowired
    public void setMyCoach(@Qualifier("basketballCoach") Coach myCoach) {
        System.out.println("In constructor of basketballCoach: " + getClass().getSimpleName());
        this.myCoach = myCoach;
    }

    // dependency injection with qualifier using constructor injection
    @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach secondCoach,
            @Qualifier("cricketCoach") Coach anotherCoach
    ) {
        System.out.println("In constructor: of cricketCoach: " + getClass().getSimpleName());
        this.secondCoach = secondCoach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/workout-cricket")
    public String getDailyWorkout2() {
        return secondCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing two beans: " + (secondCoach == anotherCoach);
    }

}

// Dependency injection multiple beans with qualifier - constructor injection
//@Autowired
//public DemoController(
//    @Qualifier("cricketCoach") Coach secondCoach,
//    @Qualifier("basketballCoach") Coach myCoach
//) {
//    this.secondCoach = secondCoach;
//    this.myCoach = myCoach;
//}
//)
