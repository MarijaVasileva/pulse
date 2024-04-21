package com.netcetera.pulse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netcetera.pulse.model.Sensor;


@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long>{

}
