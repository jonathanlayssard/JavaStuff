--DDL: Data Definition Language
--2 time/date datatypes to choose from DATE & TIMESTAMP
DROP TABLE actor;
DROP TABLE actor_role; --references to actor and role_type, must be delete first!
DROP TABLE role_type; 

CREATE TABLE actor(
 act_id INT,
 act_name VARCHAR2(50),
 act_film VARCHAR2(50),
 act_birth_date DATE, 
 act_address  VARCHAR2(100),
 act_years_in_media NUMBER(8,2),
  PRIMARY KEY(act_id)
);


CREATE TABLE role_type(
  role_id INT,
  role_type VARCHAR2(40) UNIQUE NOT NULL,
  PRIMARY KEY (role_id)
);


--actor_role is a Junction Table, Join Table
CREATE TABLE actor_role(
 act_id INT,
 role_id INT,
 PRIMARY KEY(act_id, role_id),
 FOREIGN KEY(act_id) REFERENCES actor(act_id),
 FOREIGN KEY(role_id) REFERENCES role_type(role_id)
 --What is a foreign key? 
 -- A constraint
 -- refers to a primary key in another table
 
 /*
      Example
      2, 3 refers 2 = Tom Sandler, 3 = Action
      3, 2 refers 3 = Jack Sandler, 2 = Drama
 */
);


