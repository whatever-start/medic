package net.whateverstart.medic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import net.whateverstart.medic.dao.IDoctorRepository;
import net.whateverstart.medic.model.Doctor;

@SpringBootApplication
@EnableMongoRepositories("net.whateverstart.medic.dao")
public class Application implements CommandLineRunner {
    @Autowired
    private IDoctorRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();

        // save a couple of customers
        repository.save(new Doctor("Alice", "Surgery"));
        repository.save(new Doctor("Bob", "Surgery"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Doctor doc : repository.findAll()) {
            System.out.println(doc);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Doctor found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByName("Alice"));

        System.out.println("Customers found with findByLastName('Surgery'):");
        System.out.println("--------------------------------");
        for (Doctor doc : repository.findByDepartment("Surgery")) {
            System.out.println(doc);
        }
    }

}
