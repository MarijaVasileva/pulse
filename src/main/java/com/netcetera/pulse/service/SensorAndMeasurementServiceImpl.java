package com.netcetera.pulse.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.beans.factory.annotation.Autowired;

import com.netcetera.pulse.dto.SensorDto;
import com.netcetera.pulse.model.Measurement;
import com.netcetera.pulse.model.Sensor;
import com.netcetera.pulse.repository.MeasurementRepository;
import com.netcetera.pulse.repository.SensorRepository;

@Service
public class SensorAndMeasurementServiceImpl implements SensorAndMeasurementService {

    @Autowired
    SensorRepository sensorRepository;

    @Autowired
    MeasurementRepository measurementRepository;

    
    public ResponseEntity<String> addNewSensor(Sensor sensor){
        sensorRepository.save(sensor);
        return ResponseEntity.ok("Successfully added new sensor");
    }
    

    public ResponseEntity<List<SensorDto>> getAllSensors(){
        return ResponseEntity.ok(sensorRepository.findAll().stream().map(SensorDto::new).collect(Collectors.toList()));
    }

    public ResponseEntity<String> addNewMeasurement (Measurement measurement){
        
        if (!sensorRepository.existsById(measurement.getSensorId())){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sensor with id " + measurement.getSensorId() + " doesn't exist!");
        }

        measurementRepository.save(measurement);
        return ResponseEntity.ok("Successfully added new measurement");

    }

    public ResponseEntity<List<Measurement>> getMeasurementsBySensor (Long sensorId, Date startDate, Date endDate){
        
        if (!sensorRepository.existsById(sensorId)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sensor with id " + sensorId + " doesn't exist!");
        }
        if (startDate != null || endDate != null){
            if (startDate == null) startDate = new Date(0);
            if (endDate == null) endDate = new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000);
            return ResponseEntity.ok(measurementRepository.findBySensorIdAndMesDateGreaterThanEqualAndMesDateLessThanEqual(sensorId, startDate, endDate));
        }
        return ResponseEntity.ok(measurementRepository.findBySensorId(sensorId));

    }

}
