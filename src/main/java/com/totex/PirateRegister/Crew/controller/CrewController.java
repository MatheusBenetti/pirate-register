package com.totex.PirateRegister.Crew.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CrewController {

    @GetMapping("/get-crews")
    public String getAllCrews() {
        return "Return crews";
    }

    @PostMapping("/create-crew")
    public String createCrew() {
        return "Crew created";
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
