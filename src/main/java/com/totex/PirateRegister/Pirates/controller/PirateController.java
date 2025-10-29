package com.totex.PirateRegister.Pirates.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PirateController {

    @GetMapping("/get-pirates")
    public String getAllPirates() {
        return "Test message";
    }

    @PostMapping("/create-pirate")
    public String createPirate() {
        return "pirate created";
    }

    @GetMapping("get-pirate/{id}")
    public String getPirateById(@PathVariable("id") Long id) {
        return "Pirate: ";
    }

    @PutMapping("update-pirate/{id}")
    public String updatePirate(@PathVariable("id") Long id) {
        return "Pirate id: " + id +  " updated";
    }

    @DeleteMapping("delete-pirate/{id}")
    public String deletePirate(@PathVariable("id") Long id) {
        return "Pirate id: " + id + " deleted";
    }

}
