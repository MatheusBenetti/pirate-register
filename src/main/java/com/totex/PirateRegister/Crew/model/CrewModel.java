package com.totex.PirateRegister.Crew.model;

import com.totex.PirateRegister.Pirates.model.PirateModel;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_crew")
public class CrewModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String crewName;
    private double totalBounty;

    @OneToMany(mappedBy = "crew", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<PirateModel> pirates = new ArrayList<>();

    public CrewModel() {}

    public CrewModel(String crewName, double totalBounty, List<PirateModel> pirates) {
        this.crewName = crewName;
        this.totalBounty = totalBounty;
        if (pirates != null) {
            this.pirates.addAll(pirates);
        }
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCrewName(String crewName) {
        this.crewName = crewName;
    }

    public String getCrewName() {
        return crewName;
    }

    public void setTotalBounty(double totalBounty) {
        this.totalBounty = totalBounty;
    }

    public double getTotalBounty() {
        return totalBounty;
    }

    public void addPirate(PirateModel pirate) {
        if (pirate != null) {
            pirate.setCrew(this);
            this.pirates.add(pirate);
        }
    }

    public void setPirates(List<PirateModel> newPirates) {
        this.pirates.clear();
        if (newPirates != null) {
            newPirates.forEach(this::addPirate);
        }
    }

    public List<PirateModel> getPirates() {
        return pirates;
    }
}
