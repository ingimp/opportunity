create database if not exists certified_cv_db;

use certified_cv_db;

create table if not exists address (
	id int not null primary key auto_increment,
	street varchar(250) not null,
	city varchar(50) not null,
	state varchar(50) not null,
	zipcode varchar(10) not null,
	ts_updated timestamp,
	ts_created timestamp
	
) Engine = InnoDB;

create table if not exists customer (
	id int not null primary key auto_increment,
	type_customer varchar(20) not null,
	username varchar(25) not null unique key,
	password varchar(15) not null unique key,
	firstname varchar(250) default null,
	lastname varchar(250) default null,
	company_name varchar(250) default null,
	p_iva varchar(11) default null,
	email varchar(250) not null,
	ts_updated timestamp,
	ts_created timestamp

) Engine = InnoDB;

create table if not exists certified_cv (
	id int not null primary key auto_increment,
	cod varchar(16) not null,
	customer_id int not null,
	foreign key (customer_id) references customer(id)
	on delete cascade on update cascade,
	index cod_cv_idx(cod),
	ts_updated timestamp,
	ts_created timestamp
	
) Engine = InnoDB;

create table if not exists company_card(
	id int not null primary key auto_increment,
	cod varchar(16) not null,
	customer_id int not null,
	foreign key (customer_id) references customer(id)
	on delete cascade on update cascade,
	index cod_card_idx(cod),
	ts_updated timestamp,
	ts_created timestamp
	
) Engine = InnoDB;


create table if not exists customer_address (
	id_customer int not null,
	id_address int not null,
	foreign key (id_customer) references customer(id)
	on delete cascade on update cascade,
	foreign key (id_address) references address(id)
	on delete cascade on update cascade,
	primary key (id_customer, id_address)
	
) Engine = InnoDB;

 -- NON CREATE
--create table if not exists customer_certified_cv (
--	customer int not null,
--	certified_cv int not null,
--	foreign key (customer) references customer(id)
--	on delete cascade on update cascade,
--	foreign key (certified_cv) references certified_cv(id)
--	on delete cascade on update cascade,
--	primary key (customer, certified_cv),
--	ts_updated timestamp,
--	ts_created timestamp
--	
--) Engine = InnoDB;
--
--
--
--create table if not exists customer_company_card (
--	customer int not null,
--	company_card int not null,
--	foreign key (customer) references customer(id)
--	on delete cascade on update cascade,
--	foreign key (Company_Card) references company_card(id)
--	on delete cascade on update cascade,
--	primary key (customer, company_card),
--	ts_updated timestamp,
--	ts_created timestamp
--	
--) Engine = InnoDB;