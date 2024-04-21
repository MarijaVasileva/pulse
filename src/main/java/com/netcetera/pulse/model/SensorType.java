package com.netcetera.pulse.model;

public enum SensorType {
    
    TYPE_0("0"),
    TYPE_1("1"),
    TYPE_2("2"),
    TYPE_3("3"),
    TYPE_4("4"),
    TYPE_20001("20001"),
    TYPE_20002("20002"),
    TYPE_20003("20003"),
    TYPE_20004("20004");

    private final String value;

    SensorType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static SensorType fromValue(String value) {
        for (SensorType type : SensorType.values()) {
            if (type.getValue().equals(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid SensorType value: " + value);
    }
}