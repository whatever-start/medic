package net.whateverstart.medic.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet(String name) {
        return String.format("Greetings, %s!", name);
    }
}
