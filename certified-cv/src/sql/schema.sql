create table address if not exists (
	id int not null primary key auto_increment,
	street varchar(250) not null,
	city varchar(50) not null,
	state varchar(50) not null,
	zipcode varchar(10) not null
	
) TYPE=InnoDB;

create table if not exists Customer (
	id int not null primary key auto_increment,
	username varchar(25) not null,
	password varchar(15) not null,
	firstname varchar(250) not null,
	lastname varchar(250) not null,
	email varchar(250) not null,
	address int not null foreign key (address) references address(id)
	on delete cascade on update cascade;
	index address_idx(address),
	

) TYPE=InnoDB;