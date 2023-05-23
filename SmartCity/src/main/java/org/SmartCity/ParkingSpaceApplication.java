package org.SmartCity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ParkingSpaceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ParkingSpaceApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(ReportsRepository repository) {
        return (args -> {
            insertJavaAdvocates(repository);
            System.out.println(repository.findAll());
        });
    }

    private void insertJavaAdvocates(ReportsRepository repository) {
        repository.save(new Reports(repository.toString()));
    }
}
