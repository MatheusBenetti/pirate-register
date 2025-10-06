package com.totex.PirateRegister.Pirates.model;

import com.totex.PirateRegister.Crew.model.CrewModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_pirates")
public class PirateModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private double bounty;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "crew_id", nullable = true)
    private CrewModel crew;

    public PirateModel() {}

    public PirateModel(String name, int age, double bounty, CrewModel crew) {
        this.name = name;
        this.age = age;
        this.bounty = bounty;
        this.crew = crew;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setBounty(double bounty) {
        this.bounty = bounty;
    }

    public double getBounty() {
        return bounty;
    }

    public void setCrew(CrewModel crew) {
        this.crew = crew;
    }

    // Getter for Crew
    public CrewModel getCrew() {
        return crew;
    }
}
