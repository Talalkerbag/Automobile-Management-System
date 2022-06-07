package com.kerbag.fleetapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kerbag.fleetapp.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
