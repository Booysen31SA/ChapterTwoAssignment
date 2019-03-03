package com.Booysen31SA.WithSpringFrameWork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "FunctionsSettings")
    public FunctionsInterface getFunctionSettings(){
        return new FunctionsWithSpringFrameWork();
    }
}
