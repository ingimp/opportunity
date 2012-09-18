create database if not exists certified_cv;
use certified_cv;
create table Address if not exists (
	id int not null primary key auto_increment,
	street varchar(250) not null,
	city varchar(50) not null,
	state varchar(50) not null,
	zipcode varchar(10) not null
	ts_created timestamp default '0000-00-00 00:00:00';
	ts_updated timestamp default now() on update now();
	
) TYPE=InnoDB;

create table if not exists Certied_CV (
	id int not null primary key auto_increment,
	cod varchar(16) not null,
	index cod_cv_idx(cod),
	ts_created timestamp default '0000-00-00 00:00:00';
	ts_updated timestamp default now() on update now();
	
) TYPE = InnoDB;

create table if not exists Company_Card(
	id int not null primary key auto_increment,
	cod varchar(16) not null,
	index cod_card_idx(cod),
	ts_created timestamp default '0000-00-00 00:00:00';
	ts_updated timestamp default now() on update now();
	
) TYPE = InnoDB;

create table if not exists Customer (
	id int not null primary key auto_increment,
	username varchar(25) not null,
	password varchar(15) not null,
	firstname varchar(250) default null,
	lastname varchar(250) default null,
	company_name varchar(250) default null,
	p_iva varchar(11) default null,
	email varchar(250) not null,
	address int not null foreign key (address) references Address(id)
	on delete cascade on update cascade;
	index address_idx(address),
	ts_created timestamp default '0000-00-00 00:00:00';
	ts_updated timestamp default now() on update now();
	

) TYPE=InnoDB;

create table if not exists Customer_Certied_CV (
	customer int not null foreign key (customer) references Customer(id)
	on delete cascade on update cascade,
	certified_cv int not null foreign key (certief_cv) references Certified_CV(id)
	on delete cascade on update cascade;
	primary key (customer, certified_cv),
	ts_created timestamp default '0000-00-00 00:00:00';
	ts_updated timestamp default now() on update now();
	
) TYPE = InnoDB;

create table if not exists Customer_Company_Card (
	customer int not null foreign key (customer) references Customer(id)
	on delete cascade on update cascade,
	company_card int not null foreign key (Company_Card) references Company_Card(id)
	on delete cascade on update cascade,
	primary key (customer, company_card),
	ts_created timestamp default '0000-00-00 00:00:00';
	ts_updated timestamp default now() on update now();
	
) TYPE = InnoDB;