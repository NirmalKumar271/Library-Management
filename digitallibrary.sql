create database digital_library;
use digital_library;


drop table language_table;
drop table author_table;
drop table user_personal_details_table;
drop table book_table;
drop table user_table;


create table language_table(language_id int auto_increment,language_name varchar(15),primary key(language_id));
insert into language_table(language_name)values("english"),("tamil");
select *from language_table;


create table author_table(author_id int auto_increment,author_name varchar(15),primary key(author_id));
insert into  author_table(author_name)values ("leo tolstoy"),("scott"),("kalki"),("barathidhasan");
select *from author_table;


create table user_personal_details_table(personal_details_id int auto_increment,phone_number long,address varchar(80),
primary key(personal_details_id));
insert into user_personal_details_table(phone_number,address)values(1234567890,"trichy srirangam"),
(0987654321,"trichy lalgudi"),(6789012345,"pudukottai keeranur"); 
select * from user_personal_details_table;


create table book_table(book_id int auto_increment,book_name varchar(30),primary key(book_id),
author_id int,foreign key(author_id)references author_table(author_id),language_id int,
foreign key(language_id)references language_table(language_id),ratings_1to5_only int);
insert into book_table(book_name,author_id,language_id,ratings_1to5_only)values
("war and peace",1,1,4),("the great gatsby",2,1,4),("ponniyen selven",3,2,5),("erunda vedu",4,2,5);
select * from book_table;



create table user_table(user_id int auto_increment,user_name varchar(26),primary key(user_id),
personal_details_id int,foreign key(personal_details_id )references user_personal_details_table(personal_details_id),
book_id int,foreign key(book_id)references book_table(book_id),from_date date ,to_date date,
book_received varchar(20));
insert into user_table(user_name,personal_details_id,book_id,from_date,to_date,book_received)values
("nirmal kumar",1,3,"2024-01-10","2024-01-11","received"),("vel",2,4,"2024-01-10","2024-01-13","received"),
("rex",3,1,"2024-01-10","2024-01-15","recevied");
select * from user_table;
