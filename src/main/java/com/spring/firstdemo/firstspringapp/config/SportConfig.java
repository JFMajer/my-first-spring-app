package com.spring.firstdemo.firstspringapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import com.spring.firstdemo.firstspringapp.common.Coach;
import com.spring.firstdemo.firstspringapp.common.SwimCoach;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
