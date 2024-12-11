package com.example.taskmanager.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/strings")
public class StringController {

    @GetMapping("/reverse")
    public ResponseEntity<String> reverse(@RequestParam String input) {
        return ResponseEntity.ok(new StringBuilder(input).reverse().toString());
    }

    @GetMapping("/count-vowels")
    public ResponseEntity<Long> countVowels(@RequestParam String input) {
        long count = input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
        return ResponseEntity.ok(count);
    }

    @GetMapping("/to-upper")
    public ResponseEntity<String> toUpperCase(@RequestParam String input) {
        return ResponseEntity.ok(input.toUpperCase());
    }
}