CREATE DATABASE guvi;
-- create the table employee
CREATE TABLE Employee (
    empcode INT PRIMARY KEY,
    empname VARCHAR(50),
    empage INT,
    empsalary DECIMAL(10, 2)
);
-- Dispay the values in table
SELECT * FROM employee;