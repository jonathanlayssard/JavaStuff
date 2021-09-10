--DML: Data Manipulation Language for movies_db
--INSERT
--SELECT
--UPDATE
--DETELE

--CREATE: INSERT
INSERT INTO movie VALUES(4,'Iron Man', 'Tom Myspace', 'Action',2004);
INSERT INTO movie VALUES(1,'Iron Man', 'Tom Myspace', 'Action',null); --allows duplicates without constraints: primiary key solves this
--Partial Insert
INSERT INTO movie (MOVIE_ID,TITLE) VALUES(5,'Batman');


--INSERT INTO returns? -The number of rows affect

--READ: SELECT
SELECT * FROM movie; --what does a select state return? -ResultSet

--UPDATE
UPDATE movie
SET title = 'Iron Man 2'
WHERE movie_id = 2; --UPDATE returns: Number of rows affected

--DETELE
DELETE movie
WHERE title = 'Iron Man';


COMMIT;


