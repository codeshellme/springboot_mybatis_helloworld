package com;

import com.service.TestService;
import org.springframework.context.annotation.ComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;

//@SpringBootApplication
//@MapperScan("com.dao.*")
@ComponentScan("com.*")
public class SpringbootApplication implements CommandLineRunner {

    @Autowired
    private TestService testService;

    public SpringbootApplication() {
        System.out.println("SpringbootApplication init ...");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testService.test();
    }
}