show databases;
create database students_db;
use students_db;

create table student(
sno int,
name varchar(50));

insert into student (sno,name)values(100,'prashant'),(200,'govindam'),(300,'rishabh');
describe student;