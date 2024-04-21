package com.netcetera.pulse.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@Table(name = "SENSOR")
@NoArgsConstructor
@AllArgsConstructor
public class Sensor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "sensor_id_generator")
    @SequenceGenerator(name="sensor_id_generator", sequenceName = "sensor_id_seq", allocationSize=1, initialValue = 6)
    private Long sensorId;

    private BigDecimal latidide;

    private BigDecimal longitute;

    private String comments;
    
    private SensorType type;
    
    private String description;

    @Enumerated(EnumType.STRING)
    private SensorStatus status;

}