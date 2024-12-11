package com.example.taskmanager.controller;

import com.example.taskmanager.exception.MathOperationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/add")
    public ResponseEntity<Integer> add(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.ok(a + b);
    }

    @GetMapping("/subtract")
    public ResponseEntity<Integer> subtract(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.ok(a - b);
    }

    @GetMapping("/multiply")
    public ResponseEntity<Integer> multiply(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.ok(a * b);
    }

    @GetMapping("/divide")
    public ResponseEntity<?> divide(@RequestParam int a, @RequestParam int b) {
        if (b == 0) {
            throw new MathOperationException("Division by zero is not allowed.");
        }
        return ResponseEntity.ok(a / b);
    }
}