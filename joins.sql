CREATE DATABASE bank_db;
USE bank_db;

CREATE TABLE trans (
    t_id INT PRIMARY KEY,
    t_amount INT,
    c_id INT NOT NULL
);

INSERT INTO trans VALUES
(1,10000,101),
(2,25000,102),
(3,41000,103),
(4,12000,104),
(5,30000,105);

ALTER TABLE trans
ADD UNIQUE(c_id);

CREATE TABLE cust (
    T_id INT PRIMARY KEY,
    name VARCHAR(20),
    t_amount INT,
    customer_id INT,
    FOREIGN KEY (customer_id) REFERENCES trans(c_id)
);