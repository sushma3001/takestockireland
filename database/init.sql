CREATE DATABASE IF NOT EXISTS takestock_db;
USE takestock_db;

SOURCE database/schema/01_users.sql;
SOURCE database/schema/02_locations.sql;
SOURCE database/schema/03_employee.sql;

SOURCE database/seed/01_locations_seed.sql;
SOURCE database/seed/02_users_seed.sql;
SOURCE database/seed/03_employee_seed.sql;
