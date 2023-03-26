package com.spring.firstdemo.firstspringapp.common;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("BasketballCoach: inside method doMyStartupStuff");
    }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("BasketballCoach: inside method doMyCleanupStuff");
    }

    public String getDailyWorkout() {
        return "Practice your jump shot for 20 minutes";
    }
}
