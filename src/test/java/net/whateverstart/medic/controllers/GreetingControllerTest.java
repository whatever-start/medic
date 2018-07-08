package net.whateverstart.medic.controllers;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import net.whateverstart.medic.services.GreetingService;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = GreetingController.class)
public class GreetingControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private GreetingService service;

    @Test
    public void greeting() throws Exception {
        when(service.greet(anyString())).thenReturn("Greetings!");
        mockMvc.perform(get("/greeting").param("name", "anyone")).andExpect(status().isOk())
                .andExpect(content().string(containsString("Greetings!")));
    }

}
