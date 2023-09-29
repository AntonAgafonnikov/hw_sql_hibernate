package ru.netology.hw_sql_hibernate;

import jakarta.transaction.Transactional;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Runner implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Runner.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

    @Override
    @Transactional
    public void run(String... args) {
    }
}
