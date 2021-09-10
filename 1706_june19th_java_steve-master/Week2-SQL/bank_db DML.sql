--DML: Data Manipulation Language
/*
            CRUD
  CREATE: INSERT
  READ:   SELECT
  UPDATE: UPDATE
  DELETE: DELETE

*/


-------------------------------------INSERT values
--BANK_TX_TYPE
INSERT INTO BANK_TX_TYPE VALUES(1, 'DEPOSIT');
INSERT INTO BANK_TX_TYPE VALUES(2, 'WITHNDRAW');

--BANK_USER
INSERT INTO BANK_USER VALUES(1, 'john', '123', 'rex', 'ryan');
INSERT INTO BANK_USER VALUES(2, 'tom', '124', 'tom', 'ryan');
INSERT INTO BANK_USER VALUES(3, 'ryan', '125', 'ryan', 'ryan');
INSERT INTO BANK_USER VALUES(4, 'mark', '126', 'mark', 'ryan');
INSERT INTO BANK_USER VALUES(5, 'No Acount Guy', '127', 'NAG', 'NLN');


--BANK_ACCOUNT
INSERT INTO BANK_ACCOUNT VALUES(1, 100, 4); --4 = mark
INSERT INTO BANK_ACCOUNT VALUES(2, 500, 2); --2 = tom
INSERT INTO BANK_ACCOUNT VALUES(3, 200, 1); --1 = john
INSERT INTO BANK_ACCOUNT VALUES(4, 500, 3); --3 = ryan


--BANK_TX
INSERT INTO BANK_TX VALUES(1, TO_DATE('2017-06-09','YYYY-MM-DD'), 25, 2, 1); 
                                                    --BA 2 = TOM, 1 = DEPOSIT
INSERT INTO BANK_TX VALUES(2, '29-JUN-17', 25, 2, 1);
                                                    --BA 2 = TOM, 1 = DEPOSIT
INSERT INTO BANK_TX VALUES(3, '28-JUN-17', 35, 4, 2);
                                                    --BA 4 = RYAN, 2 = WITHDRAW
INSERT INTO BANK_TX VALUES(4, '27-JUN-17', 25, 3, 2);
                                                    --BA 3 = JOHN, 2 = WITHDRAW

--DML: select

SELECT * FROM BANK_USER;
SELECT * FROM BANK_ACCOUNT;
SELECT * FROM BANK_TX_TYPE;
SELECT * FROM BANK_TX;


--JOINS
--SHOW USERS BANK ACOUNT BALANCE, BA_NUMBER
SELECT bu.bu_id AS "BANK USER ID", ba.bu_id AS "BANK ACCOUNT, USER_ID",  bu.BU_USERNAME, bu.BU_FIRST_NAME, ba.BA_BALANCE, ba.BA_NUMBER
FROM BANK_USER bu
INNER JOIN BANK_ACCOUNT ba ON bu.bu_id = ba.bu_id;


--Still have No Account Guy show up
SELECT bu.bu_id AS "BANK USER ID", ba.bu_id AS "BANK ACCOUNT, USER_ID", bu.BU_USERNAME, bu.BU_FIRST_NAME, ba.BA_BALANCE, ba.BA_NUMBER
FROM BANK_USER bu
RIGHT JOIN BANK_ACCOUNT ba ON bu.bu_id = ba.bu_id; --Left Join shows all records of the fir table 

--SQL JOINS: JOIN EVERY TABLE IN THE CHINNOOK DB


