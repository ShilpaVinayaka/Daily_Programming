---Refer the schema and create the Subject table

CREATE TABLE Subject (
subject_id NUMBER PRIMARY KEY, 
subject name VARCHAR(30),
subject_code VARCHAR(10), 
staff_id NUMBER references Staff (staff_id)
);
