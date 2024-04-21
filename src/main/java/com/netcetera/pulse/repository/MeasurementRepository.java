package com.netcetera.pulse.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netcetera.pulse.model.Measurement;

@Repository
public interface MeasurementRepository extends JpaRepository<Measurement, Long>{

    List<Measurement> findBySensorId(Long sensorId);

    List<Measurement> findBySensorIdAndMesDateGreaterThanEqualAndMesDateLessThanEqual(Long sensorId, Date startDate, Date endDate);

}
