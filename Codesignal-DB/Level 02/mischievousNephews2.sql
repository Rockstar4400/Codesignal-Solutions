CREATE DATABASE codesignal;

-- Source help: https://www.w3resource.com/mysql/string-functions/mysql-field-function.php
--              https://www.mysqltutorial.org/mysql-left-function/

USE codesignal;

SHOW DATABASES;

SHOW TABLES;

CREATE TABLE mischief(
  mischief_date DATE NOT NULL,
  author VARCHAR (50) NOT NULL,
  title VARCHAR (50) NOT NULL
    );

DROP TABLE mischief;

INSERT INTO mischief (mischief_date,author,title) VALUES ("2016-12-01","Dewey","Cook the golden fish in a bucket");
INSERT INTO mischief (mischief_date, author, title) VALUES ('2016-12-01', 'Dewey', 'Paint the walls pink');
INSERT INTO mischief (mischief_date, author, title) VALUES ('2016-12-01', 'Huey', 'Eat all the candies');
INSERT INTO mischief (mischief_date, author, title) VALUES ('2016-12-01', 'Louie', 'Wrap the cat in toilet paper');
INSERT INTO mischief (mischief_date, author, title) VALUES ('2016-12-08', 'Louie', 'Play hockey on linoleum');
INSERT INTO mischief (mischief_date, author, title) VALUES ('2017-01-01', 'Huey', 'Smash a window');
INSERT INTO mischief (mischief_date, author, title) VALUES ('2017-02-06', 'Dewey', 'Create a rink on the porch');

TRUNCATE TABLE mischief;

SELECT * FROM mischief;


/*Please add ; after each select statement*/
CREATE PROCEDURE mischievousNephews()
BEGIN

  SELECT mischief_date, author, title FROM mischief;

END;


SHOW PROCEDURE STATUS WHERE db = 'codesignal';

CREATE PROCEDURE mischievousNephews()
BEGIN

  SELECT mischief_date, author, title FROM mischief;

END;

DROP PROCEDURE mischievousNephews;

CALL mischievousNephews();

-- TEST
SELECT weekday,mischief_date, author, title FROM mischief;

-- Solution
SELECT
  WEEKDAY(mischief_date) AS weekday,
  mischief_date, author, title FROM mischief
ORDER BY weekday,  FIELD (author,'Huey', 'Dewey', 'Louie'),
mischief_date, LEFT(title,5);

