package dev.mcdd.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class HelloController {

    @GetMapping("/say-hello")
    public ResponseEntity<String> sayHello(@RequestParam(defaultValue = "mcdd") String username) {
        return ResponseEntity.ok(String.format("Hello %s", username));
    }

}
