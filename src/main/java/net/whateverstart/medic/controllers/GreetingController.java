package net.whateverstart.medic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.whateverstart.medic.services.GreetingService;

@Controller
public class GreetingController {
    private final GreetingService service;
    
    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,
            Model model) {
        model.addAttribute("message", service.greet(name));
        return "greeting";
    }

}
