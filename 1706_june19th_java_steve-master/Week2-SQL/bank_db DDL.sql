--DDL: Data Definition Language
/*
 CREATE
 DROP
 ALTER
 TRUNCATE
 RENAME
*/

CREATE TABLE bank_user (
  bu_id INT,
  bu_username VARCHAR2(4000) UNIQUE NOT NULL,
  bu_password VARCHAR2(4000) NOT NULL,
  bu_first_name VARCHAR2(4000),
  bu_last_name VARCHAR2(4000),
  PRIMARY KEY(bu_id)
);

CREATE TABLE bank_account(
  ba_number INT,
  ba_balance NUMBER(30,2) NOT NULL,
  bu_id INT,
  PRIMARY KEY(ba_number),
  FOREIGN KEY(bu_id) REFERENCES bank_user(bu_id)
);

CREATE TABLE bank_tx_type(
  btt_id INT,
  btt_name VARCHAR2(4000) UNIQUE NOT NULL,
  PRIMARY KEY(btt_id)
);

CREATE TABLE bank_tx(
  bt_id INT,
  bt_date DATE,
  bt_amount NUMBER(30,2) NOT NULL,
  ba_number INT,
  btt_id INT,
  PRIMARY KEY(bt_id),
  FOREIGN KEY(ba_number) REFERENCES bank_account(ba_number),
  FOREIGN KEY(btt_id) REFERENCES bank_tx_type(btt_id)
);

