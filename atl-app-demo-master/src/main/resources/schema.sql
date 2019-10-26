drop table if exists users;

create table users(
  ID int not null IDENTITY,
  NAME varchar(100) not null,
  STATUS int,
  PRIMARY KEY ( ID )
);

insert into users (name, status) values ('user1', 0);
insert into users (name, status) values ('user2', 1);
insert into users (name, status) values ('user3', 0);