29/07/2026
-- 1) DDL (Data Definition Language) Statements
-- i) CREATE: Used to create a new table, database, or view in the database.
-- Creating a database
Syntax: CREATE DATABASE database_name;

CREATE DATABASE CollegeDB;

Syntax: CREATE TABLE table_name (
    ColumnName1 DATATYPE(SIZE),
    ColumnName2 DATATYPE(SIZE),
);

CREATE TABLE Student (
    id NUMBER(4)/id INT,
    name VARCHAR(20),
    mobile_no NUMBER(10)
);

-- ii) DESC: Used to display the structure of a table, including column names, data types, and constraints.
Syntax: DESC table_name;

DESC Student;

-- iii) DROP: Used to delete an existing table, database, or view from the database.
DROP DATABASE CollegeDB/(database_name);

DROP TABLE Student/(table_name);

31/07/2026
-- ALTER: Used to modify the structure of an existing table in the database.
Syntax: ALTER TABLE table_name ADD column_name DATATYPE(SIZE);

ALTER TABLE Student/(table_name) ADD email/(column_name) VARCHAR(50)/DATATYPE(SIZE);

ALTER TABLE Student/(table_name) MODIFY COLUMN email/(column_name) VARCHAR(100)/DATATYPE(SIZE);

ALTER TABLE Student/(table_name) RENAME COLUMN email/(old_column_name) TO new_email/(new_column_name);

05/08/2026
-- step: 1: Create a table named STUDENTS with the following columns:
CREATE TABLE STUDENTS (
    sid NUMBER,
    name VARCHAR(20),
    department VARCHAR(20),
    city VARCHAR(20),
    age NUMBER,
    marks NUMBER
);

DESC STUDENTS;

-- step: 2: Insert the following records into the STUDENTS table using different methods.

-- INSERT: Used to add new records into a table in the database.
Syntax: INSERT INTO table_name (column1, column2, ...) VALUES (value1, value2, ...);

-- method : 1
INSERT INTO STUDENTS (101,'Amit','MCA','Ahmedabad', 21, 25);

-- method : 2 Insert with column values.
INSERT INTO STUDENTS (sid, name, department, city, age, marks) VALUES (102, 'Rahul', 'MBA', 'Baroda', 22, 28);

-- method : 3 multiple values(not supported in oracle).
INSERT INTO STUDENTS VALUES (103,'Aman','BCA','Surat', 23, 27),(104, 'Ram', 'MSc', 'Patan', 20, 30),(105, 'Ravi', 'BCA','Pune', 24, 35);

-- step: 3: Save the changes made to the database using the COMMIT statement.
COMMIT;

-- Step: 4: Display all the records from the STUDENTS table.
SELECT * FROM STUDENTS;

-- Step: 5: Update the marks of the student with sid=101 to 30.
-- UPDATE: Used to modify existing records in a table in the database.
Syntax: UPDATE table_name SET column1 = value1, column2 = value2, ...

UPDATE STUDENTS SET name = 'Amit Shukla' WHERE sid = 102;

-- Step: 6: Delete the record of the student with sid=105 from the STUDENTS table.
-- DELETE: Used to remove existing records from a table in the database.
Syntax: DELETE FROM table_name WHERE condition;

DELETE FROM STUDENTS WHERE sid = 105;

08/08/2026
-- <i> create client_master table.
-- write the SQL statement to create the client_master table with the following Feilds.
CREATE TABLE client_master (
    client_no VARCHAR(6) ,
    name VARCHAR(20),
    address1 VARCHAR(30),
    address2 VARCHAR(30),
    city VARCHAR(15),
    state VARCHAR(15),
    pincode NUMBER(6),
    bal_due NUMBER(10,2),
);

-- <ii> create product_master table.
-- write the SQL statement to create the product_master table with the following Feilds.
CREATE TABLE product_master (
    product_no VARCHAR(6),
    description VARCHAR(20),
    profit_percent NUMBER(5,2),
    unit_measure VARCHAR(10),
    qty_on_hand NUMBER(8),
    recorder_lvl NUMBER(8),
    sell_price NUMBER(8,2),
    cost_price NUMBER(8,2)
);

-- <iii> create salesman_master table.
-- write the SQL statement to create the salesman_master table with the following Feilds.
CREATE TABLE salesman_master (
    salesman_no VARCHAR(6),
    salesman_name VARCHAR(20),
    address1 VARCHAR(30),
    address2 VARCHAR(30),
    city VARCHAR(20),
    pincode NUMBER(6),
    state VARCHAR(20),
    sal_amt NUMBER(8,2),
    tgt_to_get NUMBER(6,2),
    ytd_sales NUMBER(6,2),
    remarks VARCHAR(60)
);

-- <iv> create sales_order table.
-- write the SQL statement to create the sales_order table with the following Feilds.
CREATE TABLE sales_order (
    s_order_no VARCHAR(6),
    s_order_date DATE,
    client_no VARCHAR(6),
    dely_addr VARCHAR(25),
    salesman_no VARCHAR(6),
    dely_type CHAR(1),
    billed_yn CHAR(1),
    dely_date DATE,
    order_status VARCHAR(10)
);

-- <v> create sales_order_details table.
-- write the SQL statement to create the sales_order_details table with the following Feilds.
CREATE TABLE sales_order_details (
    s_order_no VARCHAR(6),
    product_no VARCHAR(6),
    qty_ordered NUMBER(8),
    qty_disp NUMBER(8),
    product_rate NUMBER(10,2)
);

12/08/2026
-- <i> add new column to client_master table.
-- write query to add a new column 'email' of type VARCHAR(30) to the client_master table.
ALTER TABLE client_master ADD email VARCHAR(30);

ALTER TABLE salesman_master MODIFY city VARCHAR(25);

ALTER TABLE salesman_master DROP COLUMN remarks;

ALTER TABLE sales_order_details RENAME TO order_details;

-- <ii> add primary key to client_master table.
-- write query to add a primary key constraint on the 'client_no' column of the client_master table.
ALTER TABLE client_master MODIFY client_no VARCHAR(6) PRIMARY KEY;

DROP TABLE product_master;

-- iii) insert data into client_master table.
INSERT INTO client_master VALUES ('C001', 'John Doe', '123 Main St', 'Apt 4B', 'New York', 'NY', 10001, 500.00, 'john.doe@email.com');

-- iv) update data in client_master table.
UPDATE client_master SET bal_due = 600.00 WHERE client_no = 'C001';

-- v) delete data from salesman_master table.
DELETE FROM salesman_master WHERE salesman_no = 'S001';

-- vi) select data from sales_order table.
SELECT * FROM sales_order;

19/08/2026
-- SQL Operators
CREATE TABLE employees (
    emp_id NUMBER,
    emp_name VARCHAR(50),
    salary NUMBER(10, 2),
    BONUS NUMBER(10, 2),
    department VARCHAR(50),
    total NUMBER(10, 2)
);
-- 1) Arithmetic Operators: Used to perform mathematical operations on numeric data types.
-- + (Addition) | - (Subtraction) | * (Multiplication) | / (Division) | % (Modulus)
Syntax: SELECT column1, column1 + column2 AS result FROM table_name;

SELECT emp_id, salary + 5 AS updated_salary FROM employees;
SELECT emp_id, salary - 5 AS updated_salary FROM employees;
SELECT emp_id, salary * 2 AS updated_salary FROM employees;
SELECT emp_id, salary / 2 AS updated_salary FROM employees;
SELECT emp_id, salary % 2 AS updated_salary FROM employees;

-- 2) Comparison Operators: Used to compare values and return a boolean result (true or false).
-- = (Equal to) | != (Not equal to) | > (Greater than) | < (Less than) | >= (Greater than or equal to) | <= (Less than or equal to)
Syntax: SELECT column1, column2 FROM table_name WHERE column1 = value;

SELECT * FROM employees WHERE salary > 50000;
SELECT * FROM employees WHERE salary < 50000;
SELECT * FROM employees WHERE salary >= 50000;
SELECT * FROM employees WHERE salary <= 50000;
SELECT * FROM employees WHERE salary = 50000;
SELECT * FROM employees WHERE salary != 50000;

22/08/2026
-- 3) Logical Operators: Used to combine multiple conditions in a WHERE clause.
-- AND | OR | NOT
Syntax: SELECT column1, column2 FROM table_name WHERE condition1 AND condition2;

SELECT * FROM employees WHERE salary > 50000 AND department = 'IT';
SELECT * FROM employees WHERE salary > 50000 OR department = 'IT';
SELECT * FROM employees WHERE NOT department = 'IT';

SELECT * FROM TAB; (show all tables in the database)

-- 4) Between Operator: Used to filter the result set within a certain range.
-- BETWEEN value1 AND value2
Syntax: SELECT column1, column2 FROM table_name WHERE column1 BETWEEN value1 AND value2;

SELECT * FROM employees WHERE salary BETWEEN 40000 AND 60000;

-- 5) IN Operator: Used to filter the result set based on a list of values.
-- IN (value1, value2, ...)
Syntax: SELECT column1, column2 FROM table_name WHERE column1 IN (value1, value2, ...);

SELECT * FROM employees WHERE department IN ('IT', 'HR', 'Finance');

-- 6) LIKE Operator: Used to filter the result set based on a pattern.
-- LIKE 'pattern'
Syntax: SELECT column1, column2 FROM table_name WHERE column1 LIKE 'pattern';

SELECT * FROM employees WHERE emp_name LIKE 'J%';
SELECT * FROM employees WHERE emp_name LIKE '%n';

-- 7) IS NULL Operator: Used to filter the result set for NULL values.
-- IS NULL
Syntax: SELECT column1, column2 FROM table_name WHERE column1 IS NULL;

SELECT * FROM employees WHERE department IS NULL;

26/08/2026
-- 1): Create table course.
CREATE TABLE course (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(50) NOT NULL UNIQUE,
    duration NUMBER CHECK(duration > 0),
    status VARCHAR(20) DEFAULT 'Active'
);

-- 2): Create table student.
CREATE TABLE student (
    std_id INT PRIMARY KEY,
    std_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE,
    age INT CHECK(age >= 18),
    marks FLOAT CHECK(marks >= 0 AND marks <= 100),
    course_id INT FOREIGN KEY,
    status VARCHAR(20) DEFAULT 'Active',
);

02/09/2026
-- Numeric Functions: Used to perform mathematical operations on numeric data types.
-- 1) ABS(): Returns the absolute value of a number.
Syntax: SELECT ABS(column_name) FROM table_name;

SELECT ABS(-10) AS output FROM dual;

-- 2) CEIL(): Returns the smallest integer greater than or equal to a number.
Syntax: SELECT CEIL(column_name) FROM table_name;

SELECT CEIL(10.5) AS Ceiling_Value FROM dual;

-- 3) FLOOR(): Returns the largest integer less than or equal to a number.
Syntax: SELECT FLOOR(column_name) FROM table_name;

SELECT FLOOR(10.5) AS Floor_Value FROM dual;

-- 4) COS(): Returns the cosine of a number (in radians).
Syntax: SELECT COS(column_name) FROM table_name;

SELECT COS(0) AS Cosine_Value FROM dual;

-- 5) COSH(): Returns the hyperbolic cosine of a number.
Syntax: SELECT COSH(column_name) FROM table_name;

SELECT COSH(1) AS Hyperbolic_Cosine FROM dual;

-- 6) EXP(): Returns e raised to the power of a number.
Syntax: SELECT EXP(column_name) FROM table_name;

SELECT EXP(2) AS Exponential_Value FROM dual;

-- 7) POWER(): Returns a number raised to the power of another number.
Syntax: SELECT POWER(column_name, exponent) FROM table_name;

SELECT POWER(2, 3) AS Power_Value FROM dual;

-- 8) MOD(): Returns the remainder of a division operation.
Syntax: SELECT MOD(column_name, divisor) FROM table_name;

SELECT MOD(10, 3) AS Modulus_Value FROM dual;

-- 9) ROUND(): Rounds a number to a specified number of decimal places.
Syntax: SELECT ROUND(column_name, decimal_places) FROM table_name;

SELECT ROUND(10.5678, 2) AS Rounded_Value FROM dual;

-- 10) TRUNC(): Truncates a number to a specified number of decimal places.
Syntax: SELECT TRUNC(column_name, decimal_places) FROM table_name;

SELECT TRUNC(10.5678, 2) AS Truncated_Value FROM dual;

-- 11) SQRT(): Returns the square root of a number.
Syntax: SELECT SQRT(column_name) FROM table_name;

SELECT SQRT(16) AS Square_Root FROM dual;

-- String Functions: Used to manipulate and perform operations on string data types.
-- 1) LOWER(): Converts a string to lowercase.
Syntax: SELECT LOWER(column_name) FROM table_name;

SELECT LOWER('HELLO') AS Lowercase_Value FROM dual;

-- 2) UPPER(): Converts a string to uppercase.
Syntax: SELECT UPPER(column_name) FROM table_name;

SELECT UPPER('hello') AS Uppercase_Value FROM dual;