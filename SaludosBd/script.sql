CREATE DATABASE IF NOT EXISTS saludos_22;

USE saludos_22;

CREATE USER IF NOT EXISTS '789xxx'@'localhost' IDENTIFIED BY '12345678';

GRANT ALL PRIVILEGES ON saludos_22.* TO '789xxx'@'localhost';

FLUSH PRIVILEGES;