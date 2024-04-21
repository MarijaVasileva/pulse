package com.netcetera.pulse.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netcetera.pulse.dto.SensorDto;
import com.netcetera.pulse.model.Measurement;
import com.netcetera.pulse.model.Sensor;
import com.netcetera.pulse.service.SensorAndMeasurementService;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @Autowired
    private SensorAndMeasurementService sensorService;
    

    @PostMapping("/sensors")
    public ResponseEntity<String> addNewSensor(@RequestBody Sensor sensor){
        return sensorService.addNewSensor(sensor);
    }

    @GetMapping("/sensors")
    public ResponseEntity<List<SensorDto>> getAllSensors(){
        return sensorService.getAllSensors();
    }

    @PostMapping("/measurements")
    public ResponseEntity<String> addNewMeasurement(@RequestBody Measurement measurement){
        return sensorService.addNewMeasurement(measurement);
    }

    @GetMapping("/measurements")
    public ResponseEntity<List<Measurement>> getMeasurementsBySensor(@RequestParam Long sensorId, 
            @RequestParam(value = "startDate", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date startDate,
            @RequestParam(value = "endDate", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date endDate){
        return sensorService.getMeasurementsBySensor(sensorId, startDate, endDate);
    }

}
