--DML: Data Manipulation Language

--INSERT data, test data: actor
INSERT INTO actor VALUES( 1, 'Adam Sandler', 'Big Daddy', null, '12345 lane rd', 1000);
INSERT INTO actor VALUES( 2, 'Tom Sandler', 'Short Daddy', null, '12344 lane rd', 1001);
INSERT INTO actor VALUES( 3, 'Jack Sandler', 'Tiny Daddy', null, '12343 lane rd', 1002);
INSERT INTO actor VALUES( 4, 'Mark Sandler', 'Daddy', null, '12342 lane rd', 1003);
INSERT INTO actor VALUES( 5, 'Mark Sandler', 'Daddy', null, '12342 lane rd', 1003);
INSERT INTO actor VALUES( 6, 'Mark Sandler', 'Daddy', null, '12342 lane rd', 1003);


--INSERT: role_type, a look up table
INSERT INTO ROLE_TYPE VALUES(1, 'Comedy');
INSERT INTO ROLE_TYPE VALUES(2, 'Drama');
INSERT INTO ROLE_TYPE VALUES(3, 'Action');

--INSERT: actor_role, a join table
INSERT INTO actor_role VALUES( 2,3);
INSERT INTO actor_role VALUES( 2, 1); --The combination must be unique 
INSERT INTO actor_role VALUES( 1,1); -- Adam, comedy
INSERT INTO actor_role VALUES(6, 50); 
        --50 & 50 is not found in actor & role_type
        --If we could insert, it would be called an Orphan Record
        --Orphan Record: a record with a foreign key value that points to nothing

--SELECT: READ
SELECT * FROM actor; --Bad practice to use * if you only need a select amount of columns
SELECT act_id, act_name FROM actor;

SELECT act_name, act_years_in_media FROM actor;

--Aggregate Functions: functions return a single value, calculated from values in a column.
SELECT AVG(act_years_in_media) FROM actor;
SELECT SUM(act_years_in_media) FROM actor;
SELECT COUNT(act_birth_date) AS "Valid Count of birth dates" FROM actor; --counts not null values in column
                      --use AS to specify an ALIAS 
--GROUP BY
SELECT act_name, SUM(act_years_in_media) 
FROM ACTOR
GROUP BY ACT_NAME; --to group together similar rows in a column

----SUBQUERY
/*
A Subquery or Inner query or Nested query is a query within another SQL query and embedded within the WHERE clause.

Can be used with the SELECT, INSERT, UPDATE, and DELETE statements
Can be used with operators like =, <, >, >=, <=, IN, BETWEEN etc.
*/
DELETE FROM actor WHERE act_id = 
(SELECT act_id 
 FROM actor 
 WHERE act_name = 'Mark Sandler' 
 AND act_years_in_media = 1003);
 
--SQL scalar functions return a single value, based on the input value.
SELECT LOWER(act_name), UPPER(act_film), LENGTH(act_name) AS "Length of Actor Name" FROM actor;
--LOWER
--UPPER
--Lengh
--Round

/*
      JOINS
*/
SELECT act_name, act_film FROM actor;
SELECT * FROM ACTOR_ROLE;
SELECT * FROM role_type;

--Show that adamn was in a comedy with a JOIN

--First we connected Actor Table with Actor_Role
SELECT a.act_name, a.act_film, a.act_id, ar.role_id 
FROM actor a
JOIN ACTOR_ROLE ar
ON a.act_id = ar.act_id;


--Now we connect Actor_Role with Role_Type
SELECT a.act_name, a.act_film, rt.ROLE_TYPE 
FROM actor a
JOIN ACTOR_ROLE ar ON a.act_id = ar.act_id -- JOIN  on the keys
INNER JOIN ROLE_TYPE rt ON ar.ROLE_ID = rt.ROLE_ID; --JOIN Primary Key with Foreign Key

/*
 INNER JOIN by default
 LEFT OUTER JOIN
 RIGHT OUTER JOIN
 FULL OUTER JOIN 
*/
SELECT a.act_name, a.act_film, rt.ROLE_TYPE 
FROM actor a
INNER JOIN ACTOR_ROLE ar ON a.act_id = ar.act_id -- JOIN  on the keys
INNER JOIN ROLE_TYPE rt ON ar.ROLE_ID = rt.ROLE_ID; --JOIN Primary Key with Foreign Key



