package ru.netology.hw_sql_hibernate;

import jakarta.transaction.Transactional;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.hw_sql_hibernate.repository.DataBaseRepository;

@SpringBootApplication
public class Runner implements CommandLineRunner {

    private final DataBaseRepository dataBaseRepository;

    public Runner(DataBaseRepository dataBaseRepository) {
        this.dataBaseRepository = dataBaseRepository;
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Runner.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

    @Override
    public void run(String... args) {
    }
}
