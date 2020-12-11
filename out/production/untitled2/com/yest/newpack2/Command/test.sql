create or replace table if not exists avenue
(
	id int auto_increment
		primary key,
	zip_code char(7) null,
	prefecture smallint(6) null,
	level1 varchar(20) null,
	level2 varchar(30) null,
	level3 varchar(40) null,
	level4 varchar(50) null,
	completeString varchar(150) not null,
	completeKana varchar(150) not null
)
engine=Mroonga charset=utf8;