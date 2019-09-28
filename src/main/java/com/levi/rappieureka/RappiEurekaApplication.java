package com.levi.rappieureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RappiEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RappiEurekaApplication.class, args);
    }

}
