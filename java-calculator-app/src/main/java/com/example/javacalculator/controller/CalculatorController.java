package com.example.javacalculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/calculator")
@RestController
public class CalculatorController {

    @GetMapping("/add")
    public ResponseEntity<String> add(@RequestParam int a, @RequestParam int b) {
        int result = a + b;
        return ResponseEntity.ok("Result: " + result);
    }

    @GetMapping("/sub")
    public ResponseEntity<String> subtract(@RequestParam int a, @RequestParam int b) {
        int result = a - b;
        return ResponseEntity.ok("Result: " + result);
    }

    @GetMapping("/multiply")
    public ResponseEntity<String> multiply(@RequestParam int a, @RequestParam int b) {
        int result = a * b;
        return ResponseEntity.ok("Result: " + result);
    }

    @GetMapping("/divide")
    public ResponseEntity<String> divide(@RequestParam int a, @RequestParam int b) {
        if (b == 0) {
            return ResponseEntity.ok("Error: Cannot divide by zero.");
        }
        double result = (double) a / b;
        return ResponseEntity.ok("Result: " + result);
    }
}

