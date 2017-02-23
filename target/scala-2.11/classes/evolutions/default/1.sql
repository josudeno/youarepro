# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table company (
  cid                           integer not null,
  name                          varchar(255),
  description                   varchar(255),
  constraint pk_company primary key (cid)
);
create sequence company_seq;

create table job (
  jid                           integer not null,
  name                          varchar(255),
  description                   varchar(255),
  constraint pk_job primary key (jid)
);
create sequence job_seq;

create table person (
  pid                           integer not null,
  name                          varchar(255),
  surname                       varchar(255),
  dob                           timestamp,
  gender                        varchar(255),
  constraint pk_person primary key (pid)
);
create sequence person_seq;

create table position (
  pid                           integer not null,
  name                          varchar(255),
  description                   varchar(255),
  salary                        float,
  date_open                     timestamp not null,
  date_closed                   timestamp not null,
  constraint pk_position primary key (pid)
);
create sequence position_seq;

create table product (
  id                            integer not null,
  name                          varchar(255),
  description                   varchar(255),
  constraint pk_product primary key (id)
);
create sequence product_seq;

create table user (
  uid                           varchar(255) not null,
  name                          varchar(255),
  email                         varchar(255) not null,
  password                      varchar(255),
  constraint uq_user_email unique (email),
  constraint pk_user primary key (uid)
);


# --- !Downs

drop table if exists company;
drop sequence if exists company_seq;

drop table if exists job;
drop sequence if exists job_seq;

drop table if exists person;
drop sequence if exists person_seq;

drop table if exists position;
drop sequence if exists position_seq;

drop table if exists product;
drop sequence if exists product_seq;

drop table if exists user;

