package com.kerbag.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kerbag.fleetapp.models.VehicleMovement;

@Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {

}
