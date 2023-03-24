package com.spring.firstdemo.firstspringapp.common;

import com.spring.firstdemo.firstspringapp.common.Coach;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public String getDailyWorkout() {
        return "Practice fast bowling for 20 minutes!";
    }
}
