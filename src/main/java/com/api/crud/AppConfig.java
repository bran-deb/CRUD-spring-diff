package com.api.crud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.api.crud.service.IUserService;
import com.api.crud.service.UserServiceImp;

@Configuration
public class AppConfig {

    @Bean(name = "userService")
    IUserService getUserRepository() {
        return new UserServiceImp();
    }
}
