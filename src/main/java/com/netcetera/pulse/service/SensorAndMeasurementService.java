package com.netcetera.pulse.service;

import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.netcetera.pulse.dto.SensorDto;
import com.netcetera.pulse.model.Measurement;
import com.netcetera.pulse.model.Sensor;

public interface SensorAndMeasurementService {
    
    ResponseEntity<String> addNewSensor(Sensor sensor);

    ResponseEntity<List<SensorDto>> getAllSensors();

    ResponseEntity<String> addNewMeasurement (Measurement measurement);

    ResponseEntity<List<Measurement>> getMeasurementsBySensor (Long sensorId, Date startDate, Date endDate);

}
