package net.whateverstart.medic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.whateverstart.medic.dao.IDoctorRepository;

@SpringBootApplication
public class Application {
    @Autowired
    private IDoctorRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
