package com.example.literature;

import com.example.literature.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteratureApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LiteratureApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Main main = new Main();
        main.showMenu();
    }
}
