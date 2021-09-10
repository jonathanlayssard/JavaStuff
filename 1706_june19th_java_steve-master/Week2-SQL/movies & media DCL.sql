--DCL: Data Control
--movies_db
CREATE USER movies_db IDENTIFIED BY p4ssw0rd; --SQL is not case sensitive 

GRANT CONNECT, RESOURCE TO movies_db;

--media_db
CREATE USER media_db IDENTIFIED BY p4ssw0rd;
GRANT CONNECT, RESOURCE TO media_db;