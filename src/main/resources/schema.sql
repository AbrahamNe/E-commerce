-- DROP TABLE AUTHOR IF EXISTS ;
-- DROP TABLE PUBLISHER IF EXISTS ;
--
-- CREATE TABLE AUTHOR(
--     ID BIGINT primary key,
--     NAME varchar(50) not null,
--     BIOGRAPHY varchar(100) not null
--
-- );
--
-- CREATE TABLE PUBLISHER(
--         ID bigint primary key,
--         NAME varchar(50) not null ,
--         SHORT_STORY varchar(500) not null,
--         STREET varchar(50),
--         CITY VARCHAR(50),
--         STATE VARCHAR(50),
--         ZIPCODE int
-- );
--
-- CREATE TABLE BOOK {
--     ID BIGINT primary key,
--     ISBN BIGINT,
--     TITLE VARCHAR(50),
--     DESCRIPTION VARCHAR(500),
--     AUTHOR_ID BIGINT FOREIGN KEY(AUTHOR_ID) REFERENCES AUTHOR(ID) UNIQUE ;
--     }
--