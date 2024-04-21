package com.netcetera.pulse.model;

import lombok.Getter;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Entity
@Data
@Table(name = "MEASUREMENT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Measurement {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "measurement_id_generator")
    @SequenceGenerator(name="measurement_id_generator", sequenceName = "measurement_id_seq", allocationSize=1, initialValue = 11)
    private Long measurementId;

    private Long sensorId;

    private Date mesDate;

    @Enumerated(EnumType.STRING)
    private MeasurementType type;

    private BigDecimal mesValue;

}
