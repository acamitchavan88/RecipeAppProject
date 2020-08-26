create table category(
id BIGINT(100) auto_increment primary key not null,
	description varchar(200)
);

create table ingredient(
id BIGINT(100) auto_increment primary key not null,
	description varchar(200),
	amount BIGINT(1000)
);

create table notes(
id BIGINT(100) auto_increment primary key not null
);


create table unitofmeasure(
id BIGINT(100) auto_increment primary key not null,
description varchar(200)
);

create table recipe(
id BIGINT(100) auto_increment primary key not null,
description varchar(200),
prepTime int,
cookTime int,
source varchar(200),
url varchar(200),
directions varchar(200)
);


alter table notes add  recipenotes  varchar(200);
insert into category(description) values('GUJRATI');
insert into category(description) values('MAHARASHTRIAN');


insert into recipe(description) values('Gulaab Jamoon');

insert into recipe(description) values('Puran Poli');

insert into recipe(description) values('Kheer');



insert into unitofmeasure(description) values('Teaspoon');

insert into unitofmeasure(description) values('Bowl Full');

insert into unitofmeasure(description) values('Big Spoon');

insert into unitofmeasure(description) values('Table Spoon');

insert into unitofmeasure(description) values('Dash');

insert into unitofmeasure(description) values('Pinch');

insert into unitofmeasure(description) values('Each');

insert into unitofmeasure(description) values('Pint');


insert into notes(recipenotes) values('KACCHI DABELI');
insert into notes(recipenotes) values('VADA PAAV');

INSERT INTO category (description) VALUES ('American');
INSERT INTO category (description) VALUES ('Italian');
INSERT INTO category (description) VALUES ('Mexican');
INSERT INTO category (description) VALUES ('Fast Food');


