# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

/**
People table
 */
create table people (
  pid                           integer not null,
  name                          varchar(255),
  surname                       varchar(255),
  dob                           DATE,
  gender                        BIT,
  constraint pk_people primary key (pid)
);
create sequence people_seq;

/**
Companies table
 */
create table companies (
  cid                           integer not null,
  name                          varchar(255),
  description                   varchar(255),
  constraint pk_companies primary key (cid)
);
create sequence companies_seq;

/**
Jobs table
 */
create table jobs (
  jid                            integer not null,
  name                          varchar(255),
  constraint pk_jobs primary key (jid)
);
create sequence jobs_seq;

/**
Jobs table
 */
create table positions (
  pid                           integer not null,
  name                          varchar(255),
  jid                           varchar(255),
  description                   varchar(255),
  date                          DATETIME,
  salary                        FLOAT,
  open                          BIT,
  constraint pk_positions primary key (pid),
  constraint fk_positions foreign key (jid) REFERENCES jobs(jid)
);
create sequence jobs_seq;

/**
users table
 */
create table users (
  uid                           integer not null,
  name                          varchar(255),
  email                         varchar(255),
  password                      varchar(255),
  constraint pk_users primary key (uid)
);
create sequence users_seq;


# --- !Downs

drop table if exists people;
drop sequence if exists people_seq;

drop table if exists companies;
drop sequence if exists companies_seq;

drop table if exists positions;
drop sequence if exists positions_seq;

drop table if exists users;
drop sequence if exists users_seq;

drop table if exists jobs;
drop sequence if exists jobs_seq;

