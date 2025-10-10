package com.totex.PirateRegister.Pirates.repository;

import com.totex.PirateRegister.Pirates.model.PirateModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PiratesRepository extends JpaRepository<PirateModel, Long> {
}
