CREATE TABLE locations (
    location_id INT PRIMARY KEY AUTO_INCREMENT,
    city VARCHAR(50) UNIQUE NOT NULL,
    country VARCHAR(50) DEFAULT 'Ireland'
);
