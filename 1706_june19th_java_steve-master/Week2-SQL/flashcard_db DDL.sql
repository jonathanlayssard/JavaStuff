--DDL
DROP TABLE flashcard;
CREATE TABLE flashcard(
  fc_id INT,
  fc_question VARCHAR2(4000) UNIQUE,
  fc_answer VARCHAR2(4000),
  PRIMARY KEY(fc_id)
);