SHOW DATABASES ;

CREATE DATABASE LOCALDATABASE;

USE LOCALDATABASE;

CREATE TABLE mischief
(
mischief_date DATE  NOT NULL,
author VARCHAR(10)  NOT NULL,
title VARCHAR(20) NOT NULL
);

EXPLAIN mischief;

INSERT INTO mischief (mischief_date, author, title) VALUES ('2016-12-01', 'Dewey', 'Cook the golden fish in a bucket');

ALTER TABLE mischief MODIFY title VARCHAR (40);

INSERT INTO mischief (mischief_date, author, title) VALUES ('2016-12-01', 'Dewey', 'Cook the golden fish in a bucket');
INSERT INTO mischief (mischief_date, author, title) VALUES ('2016-12-01', 'Dewey', 'Paint the walls pink');
INSERT INTO mischief (mischief_date, author, title) VALUES ('2016-12-01', 'Huey', 'Eat all the candies');
INSERT INTO mischief (mischief_date, author, title) VALUES ('2016-12-01', 'Louie', 'Wrap the cat in toilet paper');
INSERT INTO mischief (mischief_date, author, title) VALUES ('2016-12-08', 'Louie', 'Play hockey on linoleum');
INSERT INTO mischief (mischief_date, author, title) VALUES ('2017-01-01', 'Huey', 'Smash a window');
INSERT INTO mischief (mischief_date, author, title) VALUES ('2017-02-06', 'Dewey', 'Create a rink on the porch');

SELECT * FROM mischief;
