/*

Group by
Having
Order by
between
rownum

*/

--ROWNUM
SELECT * FROM BANK_USER
WHERE ROWNUM < 3;

--ORDER BY asc and desc
SELECT * FROM BANK_ACCOUNT
ORDER BY BA_BALANCE DESC;

--BETWEEN
SELECT * FROM BANK_ACCOUNT
WHERE BA_BALANCE BETWEEN 100 AND 300;


/*
The HAVING clause was added to SQL because 
  the WHERE keyword could not be used with aggregate functions.
*/

INSERT INTO bank_user VALUES(6, '2nd rex', '555', 'rex', 'ryan');

SELECT bu_first_name,COUNT(bu_id) AS "Number of Users"
FROM bank_user
GROUP BY bu_first_name
HAVING COUNT(BU_FIRST_NAME) > 1;