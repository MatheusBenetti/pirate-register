package com.totex.PirateRegister.Crew.repository;

import com.totex.PirateRegister.Crew.model.CrewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrewRepository extends JpaRepository<CrewModel, Long> {
}
