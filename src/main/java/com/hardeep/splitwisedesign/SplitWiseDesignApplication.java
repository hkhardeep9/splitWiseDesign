package com.hardeep.splitwisedesign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SplitWiseDesignApplication implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        SpringApplication.run(SplitWiseDesignApplication.class, args);
    }

}
