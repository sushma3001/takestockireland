CREATE TABLE employee (
    employee_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT UNIQUE,
    name VARCHAR(100) NOT NULL,
    initials VARCHAR(5) UNIQUE,
    mobile VARCHAR(15) UNIQUE,
    location_id INT,
    emp_group ENUM('FLOOR', 'STOCK_ROOM', 'DELI'),
    role ENUM('SUPERVISOR', 'CREW') NOT NULL,
    date_of_joining DATE,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (location_id) REFERENCES locations(location_id)
);
