CREATE DATABASE IF NOT EXISTS sampledb;

USE sampledb;

CREATE TABLE employee (
	eid INT(50) NOT NULL AUTO_INCREMENT, 
	ename VARCHAR(200) DEFAULT NULL, 
	edesig VARCHAR(200) DEFAULT NULL,
	edept VARCHAR(100) DEFAULT NULL,
	esal INT(100) DEFAULT NULL,
	PRIMARY KEY (eid)
);

INSERT INTO employee (eid, ename, edesig, edept, esal) VALUES (1, 'tuna', 'Lead', 'Technology', 30000);

INSERT INTO employee (eid, ename, edesig, edept, esal) VALUES (2, 'muna', 'Associate', 'Human Resource', 24000);

INSERT INTO employee (eid, ename, edesig, edept, esal) VALUES (3, 'rohit', 'Associate', 'Technology', 27000);

INSERT INTO employee (eid, ename, edesig, edept, esal) VALUES (4, 'venkett', 'Manager', 'Technology', 42000);

INSERT INTO employee (eid, ename, edesig, edept, esal) VALUES (5, 'rahul', 'Senior Manager', 'Human Resource', 55000);

INSERT INTO employee (eid, ename, edesig, edept, esal) VALUES (6, 'JS', 'Lead', 'Administration', 24000);

SELECT * FROM employee;