CREATE TYPE weather_state AS ENUM ('SUNNY', 'RAINY', 'FOGGY');

CREATE TABLE weather_report (
    id SERIAL PRIMARY KEY,
    date TIMESTAMP NOT NULL,
    temperature_celcium SMALLINT NOT NULL,
    weather_state weather_state NOT NULL,
    city VARCHAR(50) NOT NULL
);