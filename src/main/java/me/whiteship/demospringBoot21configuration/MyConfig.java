package me.whiteship.demospringBoot21configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public Object myBean() {
        return new Object();
    }
}
