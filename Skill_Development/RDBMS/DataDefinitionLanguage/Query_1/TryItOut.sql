Modify the given query appropriately in order to create the department table using the structure given below, considering the product table that you have already created.
CREATE TABLE department ( dept_id number (4)
prod_id number (4) REFERENCES Product(prod_id), 
dept_name varchar(25) UNIQUE, 
dept_head varchar(25) NOT NULL, 
PRIMARY KEY(dept_id)
);
