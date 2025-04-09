package dev.mcdd.backend.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Test class for the {@link HelloController}
 */
@WebMvcTest({HelloController.class})
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {

    }

    @Test
    public void sayHello() throws Exception {
        mockMvc.perform(get("/api/users/say-hello")
                        .param("username", "mcdd"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello mcdd"));
    }
}
