\encoding UTF-8

CREATE TABLE fct_oprhistory
(screen_id varchar (14) NOT NULL,
screen_name varchar (100) NULL,
user_id varchar (500) NOT NULL,
co_cd varchar (10) NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL,
operation_cd varchar (2) NOT NULL,
button_name varchar (50) NULL,
button_label varchar (100) NULL,
access_ts timestamp(0)  NOT NULL,
action_id varchar (15) NULL,
machine varchar (50) NULL,
note varchar (100) NULL
);

