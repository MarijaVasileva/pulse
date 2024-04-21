package com.netcetera.pulse.dto;

import com.netcetera.pulse.model.Sensor;
import com.netcetera.pulse.model.SensorStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class SensorDto {

    private String sensorId;

    private String position;

    private String comments;
    
    private String type;
    
    private String description;

    private SensorStatus status;

    public SensorDto(Sensor s){
        this.sensorId = s.getSensorId().toString();
        this.position = s.getLatidide().toString() + ", " + s.getLongitute().toString();
        this.comments = s.getComments();
        this.type = s.getType().getValue();
        this.description = s.getDescription();
        this.status = s.getStatus();
    }
    
}
