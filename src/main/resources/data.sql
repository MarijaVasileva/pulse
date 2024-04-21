INSERT INTO SENSOR (sensor_id, latidide, longitute, comments, type, description, status)
VALUES 
    (1, 51.5, 0.1278, 'London sensor', '0', 'Description for sensor in London', 'ACTIVE'),
    (2, 40.71, 74.0060, 'New York sensor', '1', 'Description for sensor in New York', 'ACTIVE'),
    (3, 34.05, -118.2437, 'Los Angeles sensor', '2', 'Description for sensor in Los Angeles', 'ACTIVE'),
    (4, 41.8781, -87.6298, 'Chicago sensor', '3', 'Description for sensor in Chicago', 'ACTIVE'),
    (5, 37.7749, -122.4194, 'San Francisco sensor', '4', 'Description for sensor in San Francisco', 'ACTIVE');


INSERT INTO MEASUREMENT (measurement_id, sensor_id, mes_date, type, mes_value)
VALUES 
    (1, 1, '2024-04-22 10:00:00', 'PM10', 10.5),
    (2, 1, '2024-04-22 10:15:00', 'PM25', 20.3),
    (3, 2, '2024-04-22 10:30:00', 'TEMPERATURE', 15.8),
    (4, 2, '2024-04-22 10:45:00', 'HUMIDITY', 18.6),
    (5, 3, '2024-04-22 11:00:00', 'NOISE', 22.1),
    (6, 3, '2024-04-22 11:15:00', 'PM10', 30.4),
    (7, 4, '2024-04-22 11:30:00', 'PM25', 25.9),
    (8, 4, '2024-04-22 11:45:00', 'TEMPERATURE', 17.2),
    (9, 5, '2024-04-22 12:00:00', 'HUMIDITY', 28.7),
    (10, 5, '2024-04-22 12:15:00', 'NOISE', 12.9);
