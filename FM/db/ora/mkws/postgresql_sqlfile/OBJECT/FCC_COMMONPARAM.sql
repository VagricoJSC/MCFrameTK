\encoding UTF-8

CREATE TABLE fcc_commonparam
(class_id varchar (3) NOT NULL,
code varchar (10) NOT NULL,
name varchar (40) NULL,
str_val varchar (100) NULL,
num_val numeric (21,8) NOT NULL,
description varchar (100) NULL,
note varchar (30) NULL
);


ALTER TABLE fcc_commonparam
ADD CONSTRAINT fcc_commonparam_pk PRIMARY KEY(class_id,code);

