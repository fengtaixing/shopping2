package com.ktx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(UserApplication.class);
        application.addListeners(new ApplicationPidFileWriter());
        application.run();
    }
}
