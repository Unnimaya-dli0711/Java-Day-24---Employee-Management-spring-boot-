package com.example.EmployeeData.config;

import com.example.EmployeeData.utility.TokenUtility;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {
    @Bean
    public TokenUtility tokenUtillity(){
        return new TokenUtility();
    }
}
