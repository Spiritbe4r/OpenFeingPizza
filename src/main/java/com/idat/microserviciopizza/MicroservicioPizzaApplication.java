package com.idat.microserviciopizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MicroservicioPizzaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicioPizzaApplication.class, args);
    }

}
